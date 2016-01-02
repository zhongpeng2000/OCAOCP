package inhere;

import java.util.Scanner;

abstract class Aminal {

	abstract public int getChi();

}

class Monkey extends Aminal {

	public int getChi() {

		System.out.println("Monkey CHICHI");

		return 0;

	}

}

class Monkey111 extends Monkey {

	private static int chichi = 20;

	public int getChi() {

		System.out.println("Monkey111 CHICHI");

		return chichi;

	}

}

class Monkey222 extends Monkey {

	private static int chichi = 10;

	public int getChi() {

		System.out.println("Monkey222 CHICHI");

		return chichi;

	}

}

class Bear extends Aminal {

	public int getChi() {

		System.out.println("Bear CHICHI");

		return 0;

	}

}

class PolarBear extends Bear {

	static int chichi = 1;

	public PolarBear() {
		// TODO Auto-generated constructor stub
	}

	public int getChi() {

		System.out.println("PolarBear CHICHI");
		return chichi;

	}

}

class BlackBear extends Bear {

	static int chichi = 2;

	/**
	 * 
	 */
	public BlackBear() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getChi() {

		System.out.println("BlackBear CHICHI");

		return chichi;

	}

}

public class ploymo {

	public static Bear setByUserBear(int number) {

		Bear aBear;

		if (number == 0) {
			aBear = new PolarBear();
		} else if (number == 1) {
			aBear = new BlackBear();
		} else {
			throw new RuntimeException();
		}

		return aBear;

	}

	public static Monkey setByUserMonkey(int number) {

		Monkey aMonkey;

		if (number == 0) {
			aMonkey = new Monkey111();
		} else if (number == 1) {
			aMonkey = new Monkey222();
		} else {
			throw new RuntimeException();
		}

		return aMonkey;

	}

	public static Aminal setByUserAminal(int number) {

		Aminal aminal;

		if (number == 0) {
			aminal = new Bear();
		} else if (number == 1) {
			aminal = new Monkey();
		} else {
			throw new RuntimeException();
		}

		return aminal;

	}

	public static void main(String[] args) {

		Aminal aminal;

		// Bear aBear;

		Scanner user_input = new Scanner(System.in);
		String number;
		// number = user_input.next( );
		System.out.print("Enter your what animal1: ");
		number = user_input.next();

		aminal = setByUserAminal(Integer.parseInt(number));

		System.out.println(number + "    what is my number");
		// System.out.println("is my number equals zero: " + number"0");
		if (number.equals("0")) {
			System.out.print("Enter your what Bear: ");
			number = user_input.next();
			aminal = setByUserBear(Integer.parseInt(number));

		} else {
			System.out.print("Enter your what Monkey: ");
			number = user_input.next();
			aminal = setByUserMonkey(Integer.parseInt(number));
		}

		System.out.println(aminal.getClass().getSuperclass().getSuperclass().getSimpleName());
		System.out.println(aminal.getClass().getSuperclass().getSimpleName());
		System.out.println(aminal.getClass().getSimpleName());

		System.out.println(aminal.getChi());
		// System.out.println(20);
	}

}
