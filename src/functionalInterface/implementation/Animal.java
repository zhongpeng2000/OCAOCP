/**
 * Project: OCAOCP
 * File: Animal.java
 * Date: Dec 26, 2015
 * Time: 6:35:47 PM
 */

package functionalInterface.implementation;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public class Animal {
	
	private String species;
	private boolean canHop;
	private boolean canSwim;
	/**
	 * @param species
	 * @param canHop
	 * @param canSwim
	 */
	public Animal(String species, boolean canHop, boolean canSwim) {
		super();
		this.species = species;
		this.canHop = canHop;
		this.canSwim = canSwim;
	}
	
	public boolean canHop(){
		return canHop;
	}
	
	public boolean canSwim(){
		return canSwim;
	}
	public String toString() {
		return species;
	}
	
	

}
