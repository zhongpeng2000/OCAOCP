/**
 * Project: OCAOCP
 * File: Tiger.java
 * Date: Dec 26, 2015
 * Time: 6:17:07 PM
 */

package functionalInterface.example;

import enumDemo.AnimalClasses;

/**
 * @author Alexander Zhong, A00972836
 *
 */

//@FunctionalInterface
class Animal{}

@FunctionalInterface
interface Sprint {
	public void sprint(Animal animal);
	//public void sprint2(Animal animal);
}

@FunctionalInterface
interface Run extends Sprint{}
@FunctionalInterface
interface SprintFaster extends Sprint {
	@Override
	public void sprint(Animal animal);
}

@FunctionalInterface
interface Skip extends Sprint {
	//final int A = 0;
	public default int getHopCount(Animal animal) {
		return 10;
	}
	public static void skip(int speed) {
		
	}
}



public class Tiger implements Sprint {
	public void sprint(Animal animal) {
		System.out.println("Animal is sprinting fast! " + animal.toString());
	}

}
