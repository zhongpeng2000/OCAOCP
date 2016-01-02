/**
 * Project: OCAOCP
 * File: FoodFactory.java
 * Date: Dec 27, 2015
 * Time: 10:25:36 PM
 */

package designPattern.factory.producer;

import designPattern.factory.Fish;
import designPattern.factory.Food;
import designPattern.factory.Hay;
import designPattern.factory.Pellets;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public class FoodFactory {

	public static Food getFood(String animalName) {
		switch(animalName) {
			case "zebra": return new Hay(100);
			case "rabbit": return new Pellets(5);
			case "goat": return new Pellets(30);
			case "polar bear": return new Fish(10);
		}
		throw new UnsupportedOperationException("Unsupported animal: " + animalName);
	}
}
