package com.epam.zlobin.generator.output;

import java.util.Arrays;
import java.util.List;

import com.epam.zlobin.generator.card.AbstractCard;

public class OutputResult {

    public static final String PATTERN_FOR_PRINTF = "%d%d%d%d %d%d%d%d %d%d%d%d %d%d%d%d\n";

    /**
     * Print a beautiful number.
     * 
     * @param cards -the finished cards.
     */
    public void printNumber(List<AbstractCard> cards) {

        for (AbstractCard card : cards) {
            System.out.printf("%-20s ", card.getCardTypeName());
            if (card.getNumberCard().length == 16) {

                System.out.printf(PATTERN_FOR_PRINTF,
                        (Object[]) toIntegers(card.getNumberCard()));
            } else {
                System.out.println(Arrays.toString(card.getNumberCard()));
            }

        }

    }

    /**
     * Print exceptions
     * 
     * @param e    - exception
     * @param name - cardName
     */
    public void printError(RuntimeException e, String name) {

        System.out.printf(e + " The user entered an invalid argument.Card | "

                + " %-28s - will not be generated!\n", name);

    }

    private static Integer[] toIntegers(int[] array) {
        Integer[] result = new Integer[array.length];

        for (int i = 0; i < array.length; ++i) {
            result[i] = array[i];
        }

        return result;
    }

}
