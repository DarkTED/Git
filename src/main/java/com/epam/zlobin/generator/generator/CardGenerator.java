package com.epam.zlobin.generator.generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.epam.zlobin.generator.card.Card;
import com.epam.zlobin.generator.output.MakerNiceNumber;

public class CardGenerator {

	public static void main(String[] args) {

		CardGenerator cardGenerator = new CardGenerator();
		cardGenerator.run(args);

	}

	public void run(String[] args) {

		List<String> cardNames = new ArrayList<String>(
				Arrays.asList(args));
		List<Card> cards = getCards(cardNames);
		new MakerNiceNumber().print(cards);

	}

	List<Card> getCards(List<String> cardNames) {
		ArrayList<Card> cards = new ArrayList<Card>();
		for (String value : cardNames) {
			cards.add(TypesCard.getTypeCard(value).getObjectCard());

		}

		return cards;

	}

}
