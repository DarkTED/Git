package com.epam.zlobin.generator.card.mir;

public class MirDebit extends Mir {

	private static final String TYPECARD = "Mir Debit";

	public MirDebit() {
		super.setTypecard(TYPECARD);
		this.getTypeCard();
		this.createNumber();
	}

}