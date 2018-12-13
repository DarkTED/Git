package com.epam.zlobin.generator.card.mir;

import java.util.List;

import com.epam.zlobin.generator.card.Card;

public class MirClassical extends Mir implements Card {

	private final String TYPECARD = "Mir Classic";

	public String getTypeCard() {
		return this.TYPECARD;
	}

	public MirClassical() {
		this.generateNumberOfCard();
	}

	public List<String> getNumberCard() {
		return this.numberOfCard;
	}
}
