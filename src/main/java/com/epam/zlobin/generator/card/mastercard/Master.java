package com.epam.zlobin.generator.card.mastercard;

import com.epam.zlobin.generator.card.AbstractCard;

/**
 * This is the parent class for the wizard system, which stores common constants
 * for all wizard cards
 * 
 * @author Ilya_Zlobin
 *
 */
public abstract class Master extends AbstractCard {

    public int[] paymentNumber = { 5 };
    public int[] binNumber = { 7, 2, 0, 9, 9 };

    protected void createDataCart(String cardTypeName) {

        setCardTypeName(cardTypeName);
        generateNumber(paymentNumber, binNumber);
    }

}
