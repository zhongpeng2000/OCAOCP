/**
 * Project: OCAOCP
 * File: Fish.java
 * Date: Dec 27, 2015
 * Time: 10:22:40 PM
 */

package designPattern.factory;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public class Fish extends Food {

	/**
	 * @param quantity
	 */
	public Fish(int quantity) {
		super(quantity);
		
	}

	@Override
	public void consumed() {
		System.out.println("Fish eaten: " + getQuantity());
		
	}
	
	

}
