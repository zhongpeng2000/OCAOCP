/**
 * Project: OCAOCP
 * File: Food.java
 * Date: Dec 27, 2015
 * Time: 10:17:06 PM
 */

package designPattern.factory;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public abstract class Food {
	
	private int quantity;

	/**
	 * 
	 */
	public Food(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	
	public abstract void consumed();
	

	

}
