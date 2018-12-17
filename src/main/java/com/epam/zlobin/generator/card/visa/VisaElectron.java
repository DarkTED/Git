package com.epam.zlobin.generator.card.visa;

public class VisaElectron extends Visa {

	private static final String TYPECARD = "Visa Electron";

	public VisaElectron() {
		super.setTypecard(TYPECARD);
		this.getTypeCard();
		this.createNumber();
	}

}