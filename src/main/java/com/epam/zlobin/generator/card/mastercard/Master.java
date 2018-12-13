package com.epam.zlobin.generator.card.mastercard;

import java.util.List;

import com.epam.zlobin.generator.card.AbstractCard;
import com.epam.zlobin.generator.card.NumberCard;

public abstract class Master extends AbstractCard
		implements NumberCard {

	private static final String NUMBER_OF_PAYMENT_SYSTEM = "5";
	private static final int BIN1_FOR_NUMBER_OF_CARD = 22100;
	private static final int BIN2_FOR_NUMBER_OF_CARD = 72099;
	private String binForNumberOfCard = "";

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
		return NUMBER_OF_PAYMENT_SYSTEM;
	}

	public String generateBinForNumberOfCard() {
		if (binForNumberOfCard == "") {
			binForNumberOfCard = String.valueOf(
					super.rand((int) Master.BIN1_FOR_NUMBER_OF_CARD,
							(int) Master.BIN2_FOR_NUMBER_OF_CARD));
			return binForNumberOfCard;
		} else {
			return binForNumberOfCard;
		}

	}

}
