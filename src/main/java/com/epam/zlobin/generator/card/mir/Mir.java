package com.epam.zlobin.generator.card.mir;

import java.util.List;

import com.epam.zlobin.generator.card.AbstractCard;
import com.epam.zlobin.generator.card.NumberCard;

public abstract class Mir extends AbstractCard implements NumberCard {

	private static final int NUMBER_OF_PAYMENT_SYSTEM = 2;
	private static final int BIN_FOR_NUMBER_OF_CARD = 22456;

	public List<String> generateNumberOfCard() {
		numberOfCard.add(this.generateNumberOfPaymentSystem());
		numberOfCard.add(this.generateBinForNumberOfCard());
		numberOfCard.add(super.generateIdentificationNumberOfCard(
				numberOfCard));
		numberOfCard.add(
				super.generateNumbForAlgorithmLuhn(numberOfCard));
		return numberOfCard;

	}

	public String generateNumberOfPaymentSystem() {
		return String.valueOf(NUMBER_OF_PAYMENT_SYSTEM);
	}

	public String generateBinForNumberOfCard() {
		return String.valueOf(BIN_FOR_NUMBER_OF_CARD);
	}

}
