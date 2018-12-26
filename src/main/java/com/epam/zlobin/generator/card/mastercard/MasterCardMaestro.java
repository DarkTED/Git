package com.epam.zlobin.generator.card.mastercard;

import com.epam.zlobin.generator.card.AbstractCard;

public class MasterCardMaestro extends AbstractCard {

    public static final String CARD_NAME = "MasterCard Maestro";
    protected static final int[] PAYMENT_NUMBER = { 5 };
    protected static final int[] BIN_NUMBER = { 7, 2, 0, 9, 9 };

    public MasterCardMaestro() {
        super(CARD_NAME, PAYMENT_NUMBER, BIN_NUMBER);
    }

}
