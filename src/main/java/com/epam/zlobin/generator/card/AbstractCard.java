package com.epam.zlobin.generator.card;

import java.security.SecureRandom;

/**
 * This abstract class contains methods for generating a number;
 * 
 * @author Ilya_Zlobin
 */
public abstract class AbstractCard {

    /**
     * The minimum value of random;
     */
    public static final int MIN_RANDOM = 1;
    /**
     * The maximum value of random;
     */
    public static final int MAX_RANDOM = 9;
    /**
     * The dividing module is used for Luhn algorithm;
     */
    public static final int ALGORITHM_LUHN_MODULE = 10;
    /**
     * The number of comparisons used for the algorithm of the Luhn;
     */
    public static final int ALGORITHM_LUHN_NUMBER = 9;
    /**
     * An even number used for the Luhn algorithm;
     */
    public static final int ALGORITHM_LUHN_EVEN_NUMBERED_INDEX = 2;
    /**
     * Card number length;
     */
    public static final int NUMBER_CARD_LENGHT = 16;
    protected int[] numberOfCard = new int[NUMBER_CARD_LENGHT];
    private String typeCardName;

    public void setCardTypeName(String cardType) {
        this.typeCardName = cardType;
    }

    private int[] generateIdentificationNumber(int num) {

        int lenghtIdentification = AbstractCard.NUMBER_CARD_LENGHT - num - 1;
        int[] identificationNumberForRand = new int[lenghtIdentification];

        for (int i = 0; i < identificationNumberForRand.length; i++) {
            identificationNumberForRand[i] = getRandomizedValue(MIN_RANDOM,
                    MAX_RANDOM);
        }

        return identificationNumberForRand;
    }

    private int generateNumbForAlgorithmLuhn(int[] numbe) {

        int sum = 0;
        for (int i = 0; i < numbe.length; i++) {
            int numberForLuna = numbe[i];
            int evenNumbers = numberForLuna;
            if (i % ALGORITHM_LUHN_EVEN_NUMBERED_INDEX == 0) {

                evenNumbers = numberForLuna
                        * ALGORITHM_LUHN_EVEN_NUMBERED_INDEX;
                if (evenNumbers > ALGORITHM_LUHN_NUMBER) {
                    evenNumbers = evenNumbers - ALGORITHM_LUHN_NUMBER;
                }
            }

            sum = sum + evenNumbers;
        }
        int result;
        if (!(sum % ALGORITHM_LUHN_MODULE == 0)) {
            int i = sum % ALGORITHM_LUHN_MODULE;
            result = ALGORITHM_LUHN_MODULE - i;
        } else {
            result = 0;
        }
        return result;
    }

    private int getRandomizedValue(int min, int max) {
        SecureRandom secureRandom = new SecureRandom();
        max -= min;
        return (int) ((secureRandom.nextDouble() * ++max) + min);
    }

    protected int[] generateNumber(int[] numberOfPaymentSystem,
            int[] binForNumberCard) {
        System.arraycopy(numberOfPaymentSystem, 0, numberOfCard, 0,
                numberOfPaymentSystem.length);
        System.arraycopy(binForNumberCard, 0, numberOfCard,
                numberOfPaymentSystem.length, binForNumberCard.length);
        int iinRangesLenght = numberOfPaymentSystem.length + binForNumberCard.length;
        int[] identificationNumber = generateIdentificationNumber(iinRangesLenght);
        System.arraycopy(identificationNumber, 0, numberOfCard, iinRangesLenght,
                identificationNumber.length);
        numberOfCard[numberOfCard.length - 1] = generateNumbForAlgorithmLuhn(
                numberOfCard);

        return numberOfCard;

    }

    /**
     * Returns the card number;
     * 
     * @return - the card number
     */
    public int[] getNumberCard() {
        return numberOfCard;
    }

    /**
     * Returns the name of the card;
     * 
     * @return - the name of the card
     */
    public String getCardTypeName() {
        return typeCardName;
    }

}
