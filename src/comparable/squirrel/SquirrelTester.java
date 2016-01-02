package comparable.squirrel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import comparable.squirrel.comparators.ChainingComparator;
import comparable.squirrel.comparators.MultiFieldComparator;

public class SquirrelTester {

	public static void main(String[] args) {
		Squirrel s1 = new Squirrel("wawa");
		Squirrel s2 = new Squirrel("haha");
		s1.setWeigth(10);
		s2.setWeigth(20);
		
		List<Squirrel> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		
		list.forEach(l -> System.out.println(l));
		
		//Collections.sort(list, new MultiFieldComparator());
		Collections.sort(list, new ChainingComparator());
		
		list.forEach(l -> System.out.println(l));
		
		
		
		// must implements Comparable have the method is not enough
		Collections.sort(list);
		
	}

}
