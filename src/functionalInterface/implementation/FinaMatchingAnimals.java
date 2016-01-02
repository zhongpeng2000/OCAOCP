/**
 * Project: OCAOCP
 * File: FinaMatchingAnimals.java
 * Date: Dec 26, 2015
 * Time: 6:41:56 PM
 */

package functionalInterface.implementation;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public class FinaMatchingAnimals {
	private static void print(Animal animal, CheckTrait trait) {
		if(trait.test2(animal))
			System.out.println(animal);
	}
	
	public static void main(String[] args) {
		print(new Animal("fish", false, true), a -> {return a.canHop();});
		print(new Animal("kangaroo2", true, false), (Animal a) -> a.canHop());
		print(new Animal("kangaroo", true, false), a -> a.canHop());
		
	}

}
