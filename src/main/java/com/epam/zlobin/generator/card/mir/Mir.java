package com.epam.zlobin.generator.card.mir;

import com.epam.zlobin.generator.card.AbstractCard;

/**
 * This is the parent class for the Mir system, which stores common constants
 * for all mir cards
 * 
 * @author Ilya_Zlobin
 * 
 */
public abstract class Mir extends AbstractCard {

    public int[] paymentNumber = { 2 };
    public int[] binNumber = { 2, 2, 4, 5, 6 };

    protected void createDataCart(String cardTypeName) {

        setCardTypeName(cardTypeName);
        generateNumber(paymentNumber, binNumber);
    }
}
