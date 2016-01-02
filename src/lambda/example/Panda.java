/**
 * Project: OCAOCP
 * File: Panda.java
 * Date: Dec 27, 2015
 * Time: 11:00:46 PM
 */

package lambda.example;

import java.util.function.Predicate;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public class Panda {
	
	int age;
	
	public static void main(String[] args) {
		Panda p1 = new Panda();
		p1.age = 1;
		check(p1, p-> p.age < 5);
	}
	
	private static void check(Panda panda, Predicate<Panda> pred) {
		String result = pred.test(panda) ? "match": "not match";
		System.out.println(result);
	}
	
	


}
