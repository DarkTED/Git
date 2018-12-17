package com.epam.zlobin.generator.card.mir;

public class MirClassical extends Mir {

	private static final String TYPECARD = "Mir Classic";

	public MirClassical() {
		super.setTypecard(TYPECARD);
		this.getTypeCard();
		this.createNumber();
	}

}
