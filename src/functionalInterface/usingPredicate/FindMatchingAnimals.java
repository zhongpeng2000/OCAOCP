package functionalInterface.usingPredicate;

import java.util.function.Predicate;

import functionalInterface.implementation.Animal;

public class FindMatchingAnimals {
	private static void print (Animal animal, Predicate<Animal> trait) {
		if(trait.test(animal))
			System.out.println(animal);
	}
	
	public static void main(String[] args) {
		print(new Animal("fish", false, true), a -> {return a.canHop();});
		print(new Animal("kangaroo2", true, false), (Animal a) -> a.canHop());
		print(new Animal("kangaroo", true, false), a -> a.canHop());
	}

}
