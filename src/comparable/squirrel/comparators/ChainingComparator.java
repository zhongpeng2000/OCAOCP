package comparable.squirrel.comparators;

import java.util.Comparator;

import comparable.squirrel.Squirrel;

public class ChainingComparator implements Comparator<Squirrel> {

	@Override
	public int compare(Squirrel o1, Squirrel o2) {
		Comparator<Squirrel> comparator = Comparator.comparing(s -> s.getSpecies());
		comparator = comparator.thenComparing(s -> s.getWeigth());
		return comparator.compare(o1, o2);
	}


}
