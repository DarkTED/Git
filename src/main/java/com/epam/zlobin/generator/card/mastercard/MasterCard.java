package com.epam.zlobin.generator.card.mastercard;

import java.util.List;

import com.epam.zlobin.generator.card.Card;

public class MasterCard extends Master implements Card {

	final String TYPECARD = "MasterCard";

	public String getTypeCard() {
		return this.TYPECARD;
	}

	public MasterCard() {
		this.generateNumberOfCard();
	}

	public List<String> getNumberCard() {
		return this.numberOfCard;
	}
}
