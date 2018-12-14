package com.epam.zlobin.generator.card;

import java.util.ArrayList;
import java.util.List;
/**
 * This interface contains methods for generating number
 * @author Ilya_Zlobin
 *
 */
public abstract class AbstractCard {
	protected List<String> numberOfCard = new ArrayList<String>();
	protected final static int LENGHT_NUMBER_CARD = 16;
	private final static int MIN_RND = 1;
	private final static int MAX_RND = 9;
	private final static int ALG_MAX = 10;
	private final static int ALG_NUMBER_LUHN = 9;
	private final static int ALG_EVEN_NUMBERED_INDEX = 2;

	/**
	 * Returns the part of the number responsible for identification
	 * @param cardNumber -Card number
	 * @return -the part of the number responsible for identification
	 */
	public String generateIdentificationNumberOfCard(
			List<String> cardNumber) {

		String binNumber = "";
		for (int i = 0; i < cardNumber.size(); i++) {
			binNumber += cardNumber.get(i);
		}

		int lengthIin = binNumber.length();

		String counterIdentificationNumber = "";
		int lenghtIdentification = AbstractCard.LENGHT_NUMBER_CARD
				- lengthIin - 1;
		String[] identificationNumberForRand = new String[lenghtIdentification];

		for (int i = 0; i < identificationNumberForRand.length; i++) {

			identificationNumberForRand[i] = String
					.valueOf(this.rand(MIN_RND, MAX_RND));
			counterIdentificationNumber += identificationNumberForRand[i];

		}
		String identificationNumbetOfCard = counterIdentificationNumber;

		return identificationNumbetOfCard;
	}
	/**
	 * Generates the number according to the Luhn algorithm. The method takes the input numbers.
	 * @param numbe method takes the input numbers cards
	 * @return - the number according to the Luhn algorithm
	 */
	public String generateNumbForAlgorithmLuhn(List<String> numbe) {
		int sum = 0;
		int numberForLuna = 0;
		int evenNumbers = 0;
		int result;
		String[] cardNumber;
		String numberOfCardForSplit = "";
		for (int i = 0; i < numbe.size(); i++) {
			numberOfCardForSplit += numbe.get(i);
		}

		cardNumber = numberOfCardForSplit.split("");

		for (int i = 0; i < cardNumber.length; i++) {
			numberForLuna = Integer.parseInt(cardNumber[i]);
			evenNumbers = numberForLuna;
			if (i % ALG_EVEN_NUMBERED_INDEX == 0) {

				evenNumbers = numberForLuna * ALG_EVEN_NUMBERED_INDEX;
				if (evenNumbers > ALG_NUMBER_LUHN) {
					evenNumbers = evenNumbers - ALG_NUMBER_LUHN;
				}
			}
			sum = sum + evenNumbers;

		}

		if (!(sum % ALG_MAX == 0)) {
			int i = sum % ALG_MAX;
			result = ALG_MAX - i;
		} else {
			result = 0;
		}
		numberOfCardForSplit = "";
		return String.valueOf(result);
	}
	/**
	 * Generate ran number
	 * @param min
	 * @param max
	 * @return - number
	 */
	public int rand(int min, int max) {
		max -= min;
		return (int) ((Math.random() * ++max) + min);
	}

}
