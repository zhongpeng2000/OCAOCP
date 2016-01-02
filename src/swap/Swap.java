package swap;

import java.awt.Point;

public class Swap {

	public static void badSwap(Integer var1, Integer var2) {
		var1++;
		var2++;
		var1 = 500;
	}

	public static void tricky(Point arg1, Point arg2) {
		arg1.x = 100;
		arg1.y = 100;
		Point temp = arg1;
		arg1 = null;
		arg2 = null;
	}

	public Swap() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Dog aDog = new Dog("Max");
		foo(aDog);

		if (aDog.getName().equals("Max")) { // true
			System.out.println("Java passes by value.");

		} else if (aDog.getName().equals("Fifi")) {
			System.out.println("Java passes by reference.");
		}
	}

	public static void foo(final Dog d) {
		d.getName().equals("Max"); // true
		//d.setName("Fifi");
		//d = new Dog("Fifi");
		d.getName().equals("Fifi"); // true
		d.setName("Fifi");
	}
	// Java copies and passes the reference by value, not the object.
	// Thus, method manipulation will alter the objects, since the references point to
	// the original objects. But since the references are copies, swaps will fail.

}
