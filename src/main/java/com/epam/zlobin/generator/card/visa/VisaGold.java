package com.epam.zlobin.generator.card.visa;

import java.util.List;

import com.epam.zlobin.generator.card.Card;

public class VisaGold extends Visa implements Card {

	final String TYPECARD = "Visa Gold";

	public String getTypeCard() {
		return this.TYPECARD;
	}

	public VisaGold() {
		this.generateNumberOfCard();
	}

	public List<String> getNumberCard() {
		return this.numberOfCard;
	}

}