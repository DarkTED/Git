package com.epam.zlobin.generator.card.visa;

import java.util.List;

import com.epam.zlobin.generator.card.Card;

public class VisaElectron extends Visa  implements Card{

	final String TYPECARD = "Visa Electron";

	public String getTypeCard() {
		return this.TYPECARD;
	}

	public VisaElectron() {
		this.generateNumberOfCard();
	}

	public List<String> getNumberCard() {
		return this.numberOfCard;
	}

}