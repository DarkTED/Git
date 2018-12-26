package com.epam.zlobin.generator.card.visa;

import com.epam.zlobin.generator.card.AbstractCard;

/**
 * This is the parent class for the Visa system, which stores common constants
 * for all visa cards
 * 
 * @author Ilya_Zlobin
 */
public abstract class Visa extends AbstractCard {

    public int[] paymentNumber = { 4 };
    public int[] binNumber = { 4, 5, 6, 4, 3 };

    protected void createDataCart(String cardTypeName) {

        setCardTypeName(cardTypeName);
        generateNumber(paymentNumber, binNumber);
    }

}
