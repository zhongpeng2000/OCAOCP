/**
 * Project: OCAOCP
 * File: AccessControl.java
 * Date: Oct 12, 2015
 * Time: 1:25:22 PM
 */

package Chap1;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public class SportCar {
	protected int a = 0;
	protected void goFast() {
	}

	private void doStuff() {
		goFast();
	}

}

class Convertible extends SportCar {
	void doThings() {
		SportCar sCar = new SportCar();
		sCar.goFast();
	}
}

class Driver {
	void doThings() {
		SportCar sCar = new SportCar();
		sCar.goFast();
	}
}

class SportCar {

	/**
	 * 
	 */
	public SportCar() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
