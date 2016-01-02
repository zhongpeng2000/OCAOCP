/**
 * Project: OCAOCP
 * File: Hay.java
 * Date: Dec 27, 2015
 * Time: 10:20:15 PM
 */

package designPattern.factory;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public class Hay extends Food {

	/**
	 * @param quantity
	 */
	public Hay(int quantity) {
		super(quantity);
		
	}

	@Override
	public void consumed() {
		System.out.println("Hay eaten: " + getQuantity());
		
	}

}
