package com.epam.zlobin.generator.card.mastercard;

import java.util.List;

import com.epam.zlobin.generator.card.Card;

public class MasterCardMaestro extends Master implements Card {

	private final String TYPECARD = "MasterCardMaestro";

	public String getTypeCard() {
		return this.TYPECARD;
	}

	public MasterCardMaestro() {
		this.generateNumberOfCard();
	}

	public List<String> getNumberCard() {
		return this.numberOfCard;
	}
}
