package com.epam.zlobin.generator.card.mir;

import java.util.List;

import com.epam.zlobin.generator.card.Card;

public class MirPremium extends Mir implements Card {

	final String TYPECARD = "Mir Premium";

	public String getTypeCard() {
		return this.TYPECARD;
	}

	public MirPremium() {
		this.generateNumberOfCard();
	}

	public List<String> getNumberCard() {
		return this.numberOfCard;
	}

}