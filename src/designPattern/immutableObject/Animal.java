/**
 * Project: OCAOCP
 * File: Animal.java
 * Date: Dec 27, 2015
 * Time: 8:14:49 PM
 */

package designPattern.immutableObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public final class Animal {
	
	private final String species;
	private final int age;
	private final List<String> favoriteFoods;
	/**
	 * @param species
	 * @param age
	 * @param favoriteFoods
	 */
	public Animal(String species, int age, List<String> favoriteFoods) {
		super();
		this.species = species;
		this.age = age;
		
		if(favoriteFoods == null) {
			throw new RuntimeException("favoriteFoods is required");
		}
		
		this.favoriteFoods = new ArrayList<String>(favoriteFoods);
	}
	/**
	 * @return the species
	 */
	public String getSpecies() {
		return species;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	public int getFavoriteFoodsCount() {
		return favoriteFoods.size();
	}
	
	public String getFavoriteFood(int index) {
		return favoriteFoods.get(index);
	}
	
	


}
