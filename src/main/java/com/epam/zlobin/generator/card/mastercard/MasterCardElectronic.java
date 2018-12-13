package com.epam.zlobin.generator.card.mastercard;

import java.util.List;

import com.epam.zlobin.generator.card.Card;

public class MasterCardElectronic extends Master implements Card {

	final String TYPECARD = "MasterCarde Electronic";

	public String getTypeCard() {
		return this.TYPECARD;
	}

	public MasterCardElectronic() {
		this.generateNumberOfCard();
	}

	public List<String> getNumberCard() {
		return this.numberOfCard;
	}

}
