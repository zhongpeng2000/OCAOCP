/**
 * Project: OCAOCP
 * File: ZooKeeper.java
 * Date: Dec 27, 2015
 * Time: 10:29:59 PM
 */

package designPattern.factory.test;

import designPattern.factory.Food;
import designPattern.factory.producer.FoodFactory;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public class ZooKeeper {

	public static void main(String[] args) {
		final Food food = FoodFactory.getFood("polar bear");
		food.consumed();
	}

}
