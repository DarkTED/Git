package com.epam.zlobin.generator;

import java.util.ArrayList;
import java.util.List;

import com.epam.zlobin.generator.card.AbstractCard;
import com.epam.zlobin.generator.output.OutputResult;

/**
 * Main class with main method Card generation program
 * 
 * @autor Zlobin Ilya
 * @param "MasterCardMaestro"
 * @version 1.0
 */
public class CardGenerator {
    private OutputResult output = new OutputResult();

    public static void main(String[] args) {
        CardGenerator cardGenerator = new CardGenerator();
        cardGenerator.run(args);

    }

    /**
     * The method runs the program.
     * 
     * @param args - the names of cards
     */
    public void run(String[] args) {
        List<AbstractCard> cards = getCards(args);
        output.printNumber(cards);

    }

    /**
     * This method returns a pool of cards.
     * 
     * @param cardNames - the names of cards
     * @return - a pool of cards
     */
    public List<AbstractCard> getCards(String[] cardNames) {

        ArrayList<AbstractCard> cards = new ArrayList<AbstractCard>();

        for (String name : cardNames) {

            try {
                AbstractCard card = getCard(name);

                cards.add(card);

            } catch (IllegalArgumentException e) {

                output.printError(e, name);
            }
        }

        return cards;
    }

    /**
     * Returns the card type;
     * 
     * @param cardName -the name of the card
     * @return - the card type
     */
    public AbstractCard getCard(String cardName) {
        AbstractCard result = null;

        for (CardType value : CardType.values()) {
            if (value.getCard().getCardName().equalsIgnoreCase(cardName)) {
                result = value.getCard();
                break;
            }
        }

        if (result != null) {
            result.generateNumber();
        } else {
            throw new IllegalArgumentException(cardName);
        }

        return result;
    }

}
