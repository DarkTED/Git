package com.epam.zlobin.generator.card.mastercard;

public class MasterCardMaestro extends Master {

	private static final String TYPECARD = "MasterCardMaestro";

	public MasterCardMaestro() {
		super.setTypecard(TYPECARD);
		this.getTypeCard();
		this.createNumber();
	}

}
