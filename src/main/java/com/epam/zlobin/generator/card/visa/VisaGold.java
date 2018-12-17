package com.epam.zlobin.generator.card.visa;

public class VisaGold extends Visa {

	private static final String TYPECARD = "Visa Gold";

	public VisaGold() {
		super.setTypecard(TYPECARD);
		this.getTypeCard();
		this.createNumber();
	}

}