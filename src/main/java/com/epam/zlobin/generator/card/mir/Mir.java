package com.epam.zlobin.generator.card.mir;

import com.epam.zlobin.generator.card.AbstractCard;

/**
 * This is the parent class for the Mir system, which stores common constants
 * for all mir cards
 * 
 * @author Ilya_Zlobin NUMBER_OF_PAYMENT_SYSTEM - payment system number;
 * 
 */
public abstract class Mir extends AbstractCard {

    public static final int NUMBER_OF_PAYMENT_SYSTEM = 2;
    public static final int BIN_FOR_NUMBER_OF_CARD = 22456;

    protected void createDataCart(String CARD_TYPE_NAME) {

        super.setCardTypeName(CARD_TYPE_NAME);
        super.generateNumber(NUMBER_OF_PAYMENT_SYSTEM, BIN_FOR_NUMBER_OF_CARD);
    }
}
