package com.epam.zlobin.generator.card;

import java.security.SecureRandom;

/**
 * This interface contains methods for generating number
 * 
 * @author Ilya_Zlobin NUMBER_CARD_LENGHT - card number length; MIN_RANDOM - the
 *         minimum value for the randomness;
 */
public abstract class AbstractCard {

    /*
     * MIN_RANDOM - the minimum value for the randomness; MAX_RANDOM - the
     * maximum value for the randomness; ALGORITHM_LUHN_MODULE - module;
     * ALGORITHM_LUHN_NUMBER - the number according to the luhn algorithm;
     * ALGORITHM_LUHN_EVEN_NUMBERED_INDEX - the number of the algorithm Luhn, to
     * call the desired index;
     */
    protected static final int NUMBER_CARD_LENGHT = 16;
    public static final int MIN_RANDOM = 1;
    public static final int MAX_RANDOM = 9;
    public static final int ALGORITHM_LUHN_MODULE = 10;
    public static final int ALGORITHM_LUHN_NUMBER = 9;
    public static final int ALGORITHM_LUHN_EVEN_NUMBERED_INDEX = 2;
    private String cardType;
    protected int[] numberOfCard = new int[NUMBER_CARD_LENGHT];

    public void setTypecard(String cardType) {
        this.cardType = cardType;
    }

    /**
     * Returns the part of the number responsible for identification.
     * 
     * @param iinCardNumber -Card number
     * @return -the part of the number responsible for identification
     */
   private int[] generateIdentificationNumber(int[] iinCardNumber) {

        int lenghtIdentification = AbstractCard.NUMBER_CARD_LENGHT
                - iinCardNumber.length - 1;
        int[] identificationNumberForRand = new int[lenghtIdentification];

        for (int i = 0; i < identificationNumberForRand.length; i++) {
            identificationNumberForRand[i] = this.getRandomizedValue(MIN_RANDOM,
                    MAX_RANDOM);
        }

        return identificationNumberForRand;
    }

    /**
     * Generates the number according to the Luhn algorithm. The method takes
     * the input numbers.
     * 
     * @param numbe method takes the input numbers cards
     * @return - the number according to the Luhn algorithm
     */
   private int generateNumbForAlgorithmLuhn(int[] numbe) {

        int sum = 0;
        int numberForLuna = 0;
        int evenNumbers = 0;
        for (int i = 0; i < numbe.length; i++) {
            numberForLuna = numbe[i];
            evenNumbers = numberForLuna;
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

    /**
     * Generates a random number.
     * 
     * @param min
     * @param max
     * @return - a random number
     */
   private final int getRandomizedValue(int min, int max) {
        SecureRandom secureRandom = new SecureRandom();
        max -= min;
        return (int) ((secureRandom.nextDouble() * ++max) + min);
    }

    /**
     * This method generates the card number.
     * 
     * @param NUMBER_OF_PAYMENT_SYSTEM - payment system number;
     * @param BIN_FOR_NUMBER_OF_CARD   - bin card number;
     * @return
     */
    protected int[] generateNumber(int numberOfPaymentSystem, int binForNumberCard ) {
        int[] iin = this.getIin(numberOfPaymentSystem, binForNumberCard); 
        System.arraycopy(iin, 0, numberOfCard, 0, iin.length);
        System.arraycopy(this.generateIdentificationNumber(iin), 0,
                numberOfCard, iin.length,
                this.generateIdentificationNumber(iin).length);
        this.getLastNumber();

        return numberOfCard;

    }

    private void getLastNumber() {
        numberOfCard[numberOfCard.length - 1] = generateNumbForAlgorithmLuhn(
                numberOfCard);
    }

    public int[] getNumberCard() {
        return numberOfCard;
    }

    public String getTypeCard() {
        return this.cardType;
    }

    /**
     * This method returns an array IIN
     * 
     * @param numberOfPaymentSystem
     * @param binForNumberCard
     * @return an array IIN
     */
    private int[] getIin(int numberOfPaymentSystem, int binForNumberCard) {

        int[] paymentSysten = { numberOfPaymentSystem };

        String bin = Integer.toString(binForNumberCard);
        int[] binNumber = new int[bin.length()];
        int[] iin = new int[binNumber.length + paymentSysten.length];
        for (int i = bin.length() - 1; i >= 0; i--) {
            binNumber[i] = binForNumberCard % 10;
            binForNumberCard /= 10;
        }
        System.arraycopy(paymentSysten, 0, iin, 0, paymentSysten.length);
        System.arraycopy(binNumber, 0, iin, paymentSysten.length,
                binNumber.length);
        return iin;

    }

}
