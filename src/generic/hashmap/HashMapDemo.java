/**
 * Project: OCAOCP
 * File: HashMapDemo.java
 * Date: Jan 3, 2016
 * Time: 3:31:10 PM
 */

package generic.hashmap;

import java.util.TreeSet;

import javax.print.attribute.standard.MediaName;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public class HashMapDemo {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("one");
		treeSet.add("One");
		treeSet.add("ONE");
		
		System.out.println(treeSet.ceiling("On"));
		System.out.println(treeSet.floor("On"));
		System.out.println(treeSet.higher("On"));
		System.out.println(treeSet.lower("On"));
	}
}
