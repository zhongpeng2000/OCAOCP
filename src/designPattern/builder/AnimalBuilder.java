/**
 * Project: OCAOCP
 * File: AnimalBuilder.java
 * Date: Dec 27, 2015
 * Time: 8:27:55 PM
 */

package designPattern.builder;

import java.util.List;

import designPattern.immutableObject.Animal;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public class AnimalBuilder {
	



	private String species;
	private int age;
	private List<String> favoriteFoods;
	
	
	/**
	 * @param species the species to set
	 */
	public AnimalBuilder setSpecies(String species) {
		this.species = species;
		return this;
	}


	/**
	 * @param age the age to set
	 */
	public AnimalBuilder setAge(int age) {
		this.age = age;
		return this;
	}


	/**
	 * @param favoriteFoods the favoriteFoods to set
	 */
	public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods) {
		this.favoriteFoods = favoriteFoods;
		return this;
	}
	
	public Animal build(){
		return new Animal(species, age, favoriteFoods);
	}

}
