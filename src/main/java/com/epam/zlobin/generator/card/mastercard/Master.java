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

    public static final int NUMBER_OF_PAYMENT_SYSTEM = 5;
    public static final int BIN_FOR_NUMBER_OF_CARD = 72099;

    protected void createDataCart(String cardTypeName) {

        setCardTypeName(cardTypeName);
        generateNumber(NUMBER_OF_PAYMENT_SYSTEM, BIN_FOR_NUMBER_OF_CARD);
    }

}
