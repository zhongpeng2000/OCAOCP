package Chap1Pack2;

import Chap1.SportCar;


class Convertible2 extends SportCar {
	void doThings() {
		Convertible2 sCar = new Convertible2();
		sCar.goFast();
		System.out.println(sCar.a);
	}
}



public class AccessControl2 {
	

	
	private static <T> void swap (T a, T b) {// BAD swap
		T cT = a;
		a = b;
		b = cT;
	}

	public AccessControl2() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Convertible2 cov = new Convertible2();
		cov.doThings();
		
		Integer a = 0;
		Integer b = 2;
		
		swap(a,b);
		
		System.out.println("a is "+ a + " b is " + b);
		
	}

}