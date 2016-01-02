/**
 * Project: OCAOCP
 * File: Outer3.java
 * Date: Dec 26, 2015
 * Time: 1:18:46 PM
 */

package innerClass.memberInner;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public class Outer3 {
	private int x = 24;
	public int getX(){
		String message = "x is ";
		class Inner {
			private int x = Outer3.this.x;
			public void printX(){
				System.out.println(message + x);
			}
		}
		Inner inner = new Inner();
		inner.printX();
		return x;
	}
	
	public static void main(String[] args) {
		new Outer3().getX();
	}
	

}
