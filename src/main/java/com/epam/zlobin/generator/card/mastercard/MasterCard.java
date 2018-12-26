package com.epam.zlobin.generator.card.mastercard;

import com.epam.zlobin.generator.card.AbstractCard;

public class MasterCard extends AbstractCard {

    public static final String CARD_NAME = "MasterCard";
    protected static final int[] PAYMENT_NUMBER = { 5 };
    protected static final int[] BIN_NUMBER ={ 7, 2, 0, 9, 9 };

    public MasterCard() {
        super(CARD_NAME, PAYMENT_NUMBER, BIN_NUMBER);
    }

}
