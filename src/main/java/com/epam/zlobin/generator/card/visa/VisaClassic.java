package com.epam.zlobin.generator.card.visa;

import java.util.List;

import com.epam.zlobin.generator.card.Card;

public class VisaClassic extends Visa implements Card {

	final String TYPECARD = "Visa Classic";

	public String getTypeCard() {
		return this.TYPECARD;
	}

	public VisaClassic() {
		this.generateNumberOfCard();
	}

	public List<String> getNumberCard() {
		return this.numberOfCard;
	}

}
