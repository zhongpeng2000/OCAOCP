/**
 * Project: OCAOCP
 * File: Enclosing.java
 * Date: Dec 25, 2015
 * Time: 10:11:42 PM
 */

package innerClass.staticClass;

import innerClass.staticClass.EnclosingHAHA.Nested;

/**
 * @author Alexander Zhong, A00972836
 *
 */

class EnclosingHAHA {
	
	
	static class Nested {
		private int price = 6;
	}
//	public static void main(String[] args) {
//		Nested nested = new Enclosing.Nested();
//		System.out.println(nested.price);
//	}

}


public class Enclosing {
	public static void main(String[] args) {
		Nested nested = new EnclosingHAHA.Nested();
		System.out.println(nested.price);
	}
}
