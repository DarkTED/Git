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

    MAESTRO(new MasterCardMaestro()),
    
    MASTER_CARD(new MasterCard()),
    
    MASTER_CARD_ELECTRONIC(new MasterCardElectronic()),
    
    MIR_CLASSIC(new MirClassical()),
    
    MIR_DEBI(new MirDebit()),
    
    MIR_PREMIUM(new MirPremium()),
    
    VISA_CLASSIC(new VisaClassic()),
    
    VISA_ELECTRON(new VisaElectron()),
    
    VISA_GOLD(new VisaGold());

    private AbstractCard card;

    CardType(AbstractCard card) {
        this.card = card;
    }

    public AbstractCard getCard() {
        return card;
    }



}
