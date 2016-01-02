/**
 * Project: OCAOCP
 * File: Pellets.java
 * Date: Dec 27, 2015
 * Time: 10:21:41 PM
 */

package designPattern.factory;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public class Pellets extends Food {

	/**
	 * @param quantity
	 */
	public Pellets(int quantity) {
		super(quantity);
		
	}

	@Override
	public void consumed() {
		System.out.println("Pellets eaten: " + getQuantity());
	}

}
