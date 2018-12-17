package com.epam.zlobin.generator.card.visa;

public class VisaClassic extends Visa {

	private static final String TYPECARD = "Visa Classic";

	public VisaClassic() {
		super.setTypecard(TYPECARD);
		this.getTypeCard();
		this.createNumber();
	}

}
