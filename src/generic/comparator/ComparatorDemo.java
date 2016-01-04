package generic.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		Comparator<Integer> comparator = (o1, o2) -> o2 - o1;
		
		List<Integer> list = Arrays.asList(5,4,7,1);
		
		Collections.sort(list, comparator);
		
		System.out.println(Collections.binarySearch(list, 1));
	}

}
