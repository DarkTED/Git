package com.epam.zlobin.generator.output;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.epam.zlobin.generator.card.Card;

public class MakerNiceNumber {

	private static final int SPLIT_PATTERN = 5;

	public void print(List<Card> cards) {
		String stringNumberOfCard = "";
		List<String> �ardsNumber;
		String divisionByFour = "";
		for (int i = 0; i < cards.size(); i++) {
			for (int f = 0; f < cards.get(i).getNumberCard()
					.size(); f++) {

				stringNumberOfCard = stringNumberOfCard
						+ cards.get(i).getNumberCard().get(f);

			}

			String[] numberOfCard = stringNumberOfCard.split("");
			�ardsNumber = new ArrayList<String>(
					Arrays.asList(numberOfCard));
			for (int r = 0; r < �ardsNumber.size(); r++) {
				if (r % SPLIT_PATTERN == 0) {

					�ardsNumber.add(r, " ");

				}
			}
			for (int g = 0; g < �ardsNumber.size(); g++) {
				divisionByFour += �ardsNumber.get(g);
			}

			System.out.println(cards.get(i).getTypeCard() + " : "
					+ divisionByFour.substring(1));

			divisionByFour = "";
			�ardsNumber.clear();
			numberOfCard = null;
			stringNumberOfCard = "";
		}

	}

}
