package com.epam.zlobin.generator;

import com.epam.zlobin.generator.card.AbstractCard;
import com.epam.zlobin.generator.card.mastercard.*;
import com.epam.zlobin.generator.card.mir.*;
import com.epam.zlobin.generator.card.visa.*;

public enum CardType {
	MAESTRO("MasterCardMaestro") {
		@Override
		public AbstractCard getCard() {
			return new MasterCardMaestro();
		}
	},
	MASTER_CARD("Master Card") {
		public AbstractCard getCard() {
			return new MasterCard();
		}
	},
	MASTER_CARD_ELECTRONIC("MasterCarde Electronic") {
		@Override
		public AbstractCard getCard() {
			return new MasterCardElectronic();
		}
	},

	MIR_CLASSIC("Mir Classic") {
		@Override
		public AbstractCard getCard() {
			return new MirClassical();
		}
	},
	MIR_DEBIT("Mir Debit") {
		@Override
		public AbstractCard getCard() {
			return new MirDebit();
		}
	},
	MIR_PREMIUM("Mir Premium") {
		@Override
		public AbstractCard getCard() {
			return new MirPremium();
		}
	},

	VISA_CLASSIC("Visa Classic") {
		@Override
		public AbstractCard getCard() {
			return new VisaClassic();
		}
	},
	VISA_ELECTRON("Visa Electron") {

		public AbstractCard getCard() {
			return new VisaElectron();
		}
	},
	VISA_GOLD("Visa Gold") {

		public AbstractCard getCard() {
			return new VisaGold();
		}
	};

	private String cardName;

	public String getCardName() {
		return this.cardName;
	}

	public static CardType getType(String cardName) {
		CardType enamObject = null;
		for (CardType value : CardType.values()) {
			if (value.getCardName().contains(cardName)) {
				enamObject = value;
			}
		}

		return enamObject;
	}

	private CardType(String cardName) {
		this.cardName = cardName;
	}

	public abstract  AbstractCard getCard();

}
