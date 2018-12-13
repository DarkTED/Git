package com.epam.zlobin.generator.maker;

import com.epam.zlobin.generator.card.Card;
import com.epam.zlobin.generator.card.mastercard.*;
import com.epam.zlobin.generator.card.mir.*;
import com.epam.zlobin.generator.card.visa.*;

public enum TypesCard {
	MAESTRO("MasterCardMaestro") {
		@Override
		protected Card getObjectCard() {
			return new MasterCardMaestro();
		}
	},
	MASTER_CARD("Master Card") {
		protected Card getObjectCard() {
			return new MasterCard();
		}
	},
	MASTER_CARD_ELECTRONIC("MasterCarde Electronic") {
		@Override
		protected Card getObjectCard() {
			return new MasterCardElectronic();
		}
	},

	MIR_CLASSIC("Mir Classic") {
		@Override
		protected Card getObjectCard() {
			return new MirClassical();
		}
	},
	MIR_DEBIT("Mir Debit") {
		@Override
		protected Card getObjectCard() {
			return new MirDebit();
		}
	},
	MIR_PREMIUM("Mir Premium") {
		@Override
		protected Card getObjectCard() {
			return new MirPremium();
		}
	},

	VISA_CLASSIC("Visa Classic") {
		@Override
		protected Card getObjectCard() {
			return new VisaClassic();
		}
	},
	VISA_ELECTRON("Visa Electron") {

		protected Card getObjectCard() {
			return new VisaElectron();
		}
	},
	VISA_GOLD("Visa Gold") {

		protected Card getObjectCard() {
			return new VisaGold();
		}
	};

	private String cardName;

	public String getCardName() {
		return this.cardName;
	}

	public static TypesCard getTypeCard(String cardName) {
		TypesCard enamObject = null;
		for (TypesCard value : TypesCard.values()) {
			if (value.getCardName().contains(cardName)) {
				enamObject = value;
			}
		}

		return enamObject;
	}

	private TypesCard(String cardName) {
		this.cardName = cardName;
	}

	protected abstract Card getObjectCard();

}
