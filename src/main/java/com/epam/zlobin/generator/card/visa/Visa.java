package com.epam.zlobin.generator.card.visa;

import java.util.List;

import com.epam.zlobin.generator.card.AbstractCard;
import com.epam.zlobin.generator.card.CommunicatableWithCard;
/**
 * This is the parent class for the Visa system, which stores common constants for all visa cards
 * @author Ilya_Zlobin
 *
 */
public abstract class Visa extends AbstractCard
		implements CommunicatableWithCard {

	private static final int NUMBER_OF_PAYMENT_SYSTEM = 4;
	private static final int BIN_FOR_NUMBER_OF_CARD = 45643;
	/**
	 * This method generates a number for the card.
	 * @return a number for the card.
	 */
	public List<String> generateNumberOfCard() {
		numberOfCard.add(this.generateNumberOfPaymentSystem());
		numberOfCard.add(this.generateBinForNumberOfCard());
		numberOfCard.add(super.generateIdentificationNumberOfCard(
				numberOfCard));
		numberOfCard.add(
				super.generateNumbForAlgorithmLuhn(numberOfCard));
		return numberOfCard;
	}
	/**
	 * This method generates a number of payment system
	 * @return a number of payment system
	 */
	public String generateNumberOfPaymentSystem() {
		return String.valueOf(NUMBER_OF_PAYMENT_SYSTEM);
	}
	/**
	 * This method generates a bin number
	 * @return a bin number
	 */
	public String generateBinForNumberOfCard() {
		return String.valueOf(BIN_FOR_NUMBER_OF_CARD);
	}

}
