package com.epam.zlobin.generator.card.mastercard;

public class MasterCard extends Master {

	public static final String TYPECARD = "MasterCard";

	public MasterCard() {
		super.setTypecard(TYPECARD);
		this.getTypeCard();
		this.createNumber();
	}

}
