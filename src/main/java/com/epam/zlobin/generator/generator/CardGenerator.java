package com.epam.zlobin.generator.generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.epam.zlobin.generator.card.Card;
import com.epam.zlobin.generator.output.MakerNiceNumber;
/** Main class with main method
 * Card generation program
 * @autor Zlobin Ilya
 * @param "MasterCardMaestro"
 * @version 1.0
*/
public class CardGenerator {
/**
 * The main method.
 * @param args - input data
 */
	public static void main(String[] args) {

		CardGenerator cardGenerator = new CardGenerator();
		cardGenerator.run(args);

	}
/**
 * The method runs the program
 * @param args - input data
 */
	public void run(String[] args) {

		List<String> cardNames = new ArrayList<String>(
				Arrays.asList(args));
		List<Card> cards = getCards(cardNames);
		new MakerNiceNumber().print(cards);

	}
/**
 * This method returns a pool of cards
 * @param cardNames - the name of the card
 * @return - returns a pool of cards
 */
	public List<Card> getCards(List<String> cardNames) {
		ArrayList<Card> cards = new ArrayList<Card>();
		for (String value : cardNames) {
			cards.add(TypesCard.getTypeCard(value).getObjectCard());

		}

		return cards;

	}

}
