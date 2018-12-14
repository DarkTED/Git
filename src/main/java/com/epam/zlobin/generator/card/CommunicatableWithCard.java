package com.epam.zlobin.generator.card;

import java.util.List;
/**
 * This interface is designed to communicate with the object from the outside.
 * @author Ilya_Zlobin
 *
 */
public interface CommunicatableWithCard {

	String generateNumberOfPaymentSystem();

	String generateBinForNumberOfCard();

	List<String> generateNumberOfCard();

}
