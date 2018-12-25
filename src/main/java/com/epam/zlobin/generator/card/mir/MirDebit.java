package com.epam.zlobin.generator.card.mir;

public class MirDebit extends Mir {

	private static final String CARD_TYPE_NAME = "Mir Debit";

	public MirDebit() {
        this.createDataCart(CARD_TYPE_NAME);
    }

}