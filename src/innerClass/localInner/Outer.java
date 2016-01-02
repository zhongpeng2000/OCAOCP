/**
 * Project: OCAOCP
 * File: Outer.java
 * Date: Dec 25, 2015
 * Time: 7:14:58 PM
 */

package innerClass.localInner;

import java.util.Random;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public class Outer {
	private int length = 5;
	public void calculate(){
		//final int width = 20;
		int temp = new Random().nextInt();
		int width = temp;
		width++;
		class Inner {
			public void multiply(){
				System.out.println(length* width);
			}
		}
		Inner inner = new Inner();
		inner.multiply();
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.calculate();
	}
	
	
}
