/**
 * Project: OCAOCP
 * File: Squirrel.java
 * Date: Dec 31, 2015
 * Time: 7:30:14 PM
 */

package comparable.squirrel;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public class Squirrel{

	private int weigth;
	private String species;
	
	public Squirrel(String theSpecies) {
		if(theSpecies == null) throw new IllegalArgumentException();
		species = theSpecies;
	}

	/**
	 * @return the weigth
	 */
	public int getWeigth() {
		return weigth;
	}

	/**
	 * @return the species
	 */
	public String getSpecies() {
		return species;
	}

	/**
	 * @param weigth the weigth to set
	 */
	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	/**
	 * @param species the species to set
	 */
	public void setSpecies(String species) {
		this.species = species;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Squirrel [weigth=" + weigth + ", species=" + species + "]";
	}

	public int compareTo(Squirrel o) {
		return this.getSpecies().compareTo(o.getSpecies());
	}
	
	
	

}
