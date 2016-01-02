/**
 * Project: OCAOCP
 * File: Outer2.java
 * Date: Dec 25, 2015
 * Time: 10:47:49 PM
 */

package innerClass.memberInner;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public class Outer2 {
	private int x =24;
	public int getX(){
		String message = "x is ";
		class Inner {
			private int x = Outer2.this.x;
			public void printX() {
				System.out.println(message + x);
			}
		}
		Inner inner = new Inner();
		inner.printX();
		return x;
	}
	public static void main(String[] args) {
		new Outer2().getX();
	}
	
}
