/**
 * Project: OCAOCP
 * File: HashSetDemo.java
 * Date: Jan 3, 2016
 * Time: 3:26:39 PM
 */

package generic.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public class HashSetDemo {

	public static void main(String[] args) {
		Set<Number> numbers = new HashSet<>();
		numbers.add(86);
		numbers.add(75);
		numbers.add(new Integer(86));
		numbers.add(null);
		numbers.add(309L);
		Iterator iterator = numbers.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
