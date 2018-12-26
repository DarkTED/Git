package com.epam.zlobin.generator.card.mastercard;

import com.epam.zlobin.generator.card.AbstractCard;

public class MasterCardElectronic extends AbstractCard {

    public static final String CARD_NAME = "MasterCarde Electronic";
    protected static final int[] PAYMENT_NUMBER = { 5 };
    protected static final int[] BIN_NUMBER = { 7, 2, 0, 9, 9 };

    public MasterCardElectronic() {
        super(CARD_NAME, PAYMENT_NUMBER, BIN_NUMBER);
    }

}
