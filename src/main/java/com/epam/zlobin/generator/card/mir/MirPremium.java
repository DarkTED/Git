package com.epam.zlobin.generator.card.mir;

import com.epam.zlobin.generator.card.AbstractCard;

public class MirPremium extends AbstractCard {

    public static final String CARD_NAME = "Mir Premium";
    protected static final int[] PAYMENT_NUMBER = { 2 };
    protected static final int[] BIN_NUMBER = { 2, 2, 4, 5, 6 };

    public MirPremium() {
        super(CARD_NAME, PAYMENT_NUMBER, BIN_NUMBER);
    }

}