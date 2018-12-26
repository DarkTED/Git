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
    private int[] cardNumber = new int[NUMBER_CARD_LENGHT];
    private String cardName;
    private int[] paymentSystemNumber;
    private int[] binForNumberCard;

    public AbstractCard(String cardName, int[] paymentNumber, int[] binNumber) {
        this.paymentSystemNumber = paymentNumber;
        this.binForNumberCard = binNumber;
        this.cardName = cardName;

    }

    public void generateNumber() {
        System.arraycopy(paymentSystemNumber, 0, cardNumber, 0,
                paymentSystemNumber.length);
        System.arraycopy(binForNumberCard, 0, cardNumber,
                paymentSystemNumber.length, binForNumberCard.length);
        int iinRangesLenght = paymentSystemNumber.length
                + binForNumberCard.length;
        generateIdentificationNumber(iinRangesLenght);
        cardNumber[cardNumber.length - 1] = generateNumbForAlgorithmLuhn(
                cardNumber);

    }

    private void generateIdentificationNumber(int iinLenght) {

        int identificationLenght = NUMBER_CARD_LENGHT - iinLenght - 1;
        for (int i = 0; i < identificationLenght; i++) {
            cardNumber[iinLenght++] = getRandomValue(MIN_RANDOM, MAX_RANDOM);
        }

    }

    private int generateNumbForAlgorithmLuhn(int[] cardNumber) {

        int sum = 0;
        for (int i = 0; i < cardNumber.length; i++) {
            int numberForLuna = cardNumber[i];
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
        int result = 0;
        if (!(sum % ALGORITHM_LUHN_MODULE == 0)) {
            int residue = sum % ALGORITHM_LUHN_MODULE;
            result = ALGORITHM_LUHN_MODULE - residue;
        }
        return result;
    }

    private int getRandomValue(int min, int max) {
        SecureRandom secureRandom = new SecureRandom();
        max -= min;
        return (int) ((secureRandom.nextDouble() * ++max) + min);
    }

    /**
     * Returns the card number;
     * 
     * @return - the card number
     */
    public int[] getCardNumber() {
        return cardNumber;
    }

    /**
     * Returns the name of the card;
     * 
     * @return - the name of the card
     */
    public String getCardName() {
        return cardName;
    }

}
