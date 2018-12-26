package com.epam.zlobin.generator.card.visa;

import com.epam.zlobin.generator.card.AbstractCard;

public class VisaElectron extends AbstractCard {

    public static final String CARD_NAME = "Visa Electron";
    protected static final int[] PAYMENT_NUMBER = { 4 };
    protected static final int[] BIN_NUMBER = { 4, 5, 6, 4, 3 };

    public VisaElectron() {
        super(CARD_NAME, PAYMENT_NUMBER, BIN_NUMBER);
    }

}