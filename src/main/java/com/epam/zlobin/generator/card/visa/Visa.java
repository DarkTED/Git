package com.epam.zlobin.generator.card.visa;

import com.epam.zlobin.generator.card.AbstractCard;

/**
 * This is the parent class for the Visa system, which stores common constants
 * for all visa cards
 * 
 * @author Ilya_Zlobin 
 */
public abstract class Visa extends AbstractCard {

	public static final int NUMBER_OF_PAYMENT_SYSTEM = 4;
	public static final int BIN_FOR_NUMBER_OF_CARD = 45643;

	protected void createNumber() {
        super.generateNumber(NUMBER_OF_PAYMENT_SYSTEM, BIN_FOR_NUMBER_OF_CARD);
    }

}
