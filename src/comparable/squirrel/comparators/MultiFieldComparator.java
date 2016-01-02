/**
 * Project: OCAOCP
 * File: MultiFieldComparator.java
 * Date: Dec 31, 2015
 * Time: 7:58:22 PM
 */

package comparable.squirrel.comparators;

import java.util.Comparator;

import comparable.squirrel.Squirrel;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public class MultiFieldComparator implements Comparator<Squirrel> {

	@Override
	public int compare(Squirrel o1, Squirrel o2) {
		int result = o1.getSpecies().compareTo(o2.getSpecies());
		if (result != 0) return result;
		return o1.getWeigth()-o2.getWeigth();
	}
	


}
