/**
 * Project: OCAOCP
 * File: AnimalClasses.java
 * Date: Dec 26, 2015
 * Time: 11:16:33 AM
 */

package enumDemo;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public enum AnimalClasses {
	MAMMAL(true), FISH(Boolean.FALSE),BIRD(false),
	REPITLE(false), AMPHIBIAN(false), INVERTEBRATE(false)
		boolean hasHair;
		public AnimalClasses(boolean hasHair) {
			this.hasHair = hasHair;
		}
		
		public boolean hasHair() {
			return hasHair;
		}
		public void giveWig(){
			hasHair = true;
		}
}
