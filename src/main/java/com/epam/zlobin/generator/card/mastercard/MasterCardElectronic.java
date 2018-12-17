package com.epam.zlobin.generator.card.mastercard;

public class MasterCardElectronic extends Master {

	private static final String TYPECARD = "MasterCarde Electronic";

	public MasterCardElectronic() {
		super.setTypecard(TYPECARD);
		this.getTypeCard();
		this.createNumber();
	}

}
