package com.epam.zlobin.generator.card.mir;

import java.util.List;

import com.epam.zlobin.generator.card.Card;

public class MirDebit extends Mir implements Card {

	final String TYPECARD = "Mir Debit";

	public String getTypeCard() {
		return this.TYPECARD;
	}

	public MirDebit() {
		this.generateNumberOfCard();
	}

	public List<String> getNumberCard() {
		return this.numberOfCard;
	}
}