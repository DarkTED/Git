package com.epam.zlobin.generator;



import com.epam.zlobin.generator.card.AbstractCard;
import com.epam.zlobin.generator.card.mastercard.*;
import com.epam.zlobin.generator.card.mir.*;
import com.epam.zlobin.generator.card.visa.*;

/**
 * This enum holds the types of cards
 * 
 * @author Ilya_Zlobin
 *
 */
public enum CardType {
    MAESTRO("MasterCard Maestro") {
        @Override
        public AbstractCard getCard() {
            return new MasterCardMaestro();
        }
    },
    MASTER_CARD("Master Card") {
        public AbstractCard getCard() {
            return new MasterCard();
        }
    },
    MASTER_CARD_ELECTRONIC("MasterCarde Electronic") {
        @Override
        public AbstractCard getCard() {
            return new MasterCardElectronic();
        }
    },

    MIR_CLASSIC("Mir Classic") {
        @Override
        public AbstractCard getCard() {
            return new MirClassical();
        }
    },
    MIR_DEBIT("Mir Debit") {
        @Override
        public AbstractCard getCard() {
            return new MirDebit();
        }
    },
    MIR_PREMIUM("Mir Premium") {
        @Override
        public AbstractCard getCard() {
            return new MirPremium();
        }
    },

    VISA_CLASSIC("Visa Classic") {
        @Override
        public AbstractCard getCard() {
            return new VisaClassic();
        }
    },
    VISA_ELECTRON("Visa Electron") {

        public AbstractCard getCard() {
            return new VisaElectron();
        }
    },

    VISA_GOLD("Visa Gold") {

        public AbstractCard getCard() {
            return new VisaGold();
        }
    };

    private String cardName;

    /**
     * Returns the name of the card;
     * 
     * @return - the name of the card
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * Returns the card type;
     * 
     * @param cardName -the name of the card
     * @return - the card type
     */
    
    public static CardType getType(String cardName) {
        CardType enamObject = null ;
        for (CardType value : CardType.values()) {
            if (value.getCardName().equals(cardName)) {
                enamObject = value;
                 } 
            
            
        }
        
        


        return enamObject;
    }
    


    private CardType() {
    }
    private CardType(String cardName) {
        this.cardName = cardName;
    }

    /**
     * Returns an object of type card;
     * 
     * @return - an object of type card
     */
    public abstract AbstractCard getCard();

}
