/**
 * Project: OCAOCP
 * File: Foo.java
 * Date: Dec 29, 2015
 * Time: 9:29:15 PM
 */

package generic.instanceofClass;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public class Foo<U> {

	// using the generic type defined in class Foo2
	public List<U> castCollectionWrong1(List<U> srcList, Class<U> clas) {
		List<U> list = new ArrayList<U>();
		for (Object obj : srcList) {

			// compile error
			if (obj instanceof U) {

			}
		}
		return list;
	}

	// NOT using the generic type defined in class Foo
	public <T> List<T> castCollectionWrong(List<T> srcList, Class<T> clas) {
		List<T> list = new ArrayList<T>();
		for (Object obj : srcList) {

			// compile error
			if (obj instanceof T) {

			}
		}
		return list;
	}

	public <T> List<T> castCollectionRightOne(List<T> srcList, Class<T> clas) {
		List<T> list = new ArrayList<T>();
		for (Object obj : srcList) {

			// check if T is a subclass of String
			if (String.class.isAssignableFrom(obj.getClass())) {
				System.out.println(obj.getClass() + " is String");
			} else {
				System.out.println(obj.getClass() + " is not String");

			}
		}
		return list;
	}

	public List<U> castCollectionRightTwo(List<U> srcList, Class<U> clas) {
		List<U> list = new ArrayList<U>();
		for (Object obj : srcList) {

			// check if T is a subclass of String
			if (String.class.isAssignableFrom(obj.getClass())) {
				System.out.println(obj.getClass() + " is String");
			} else {
				System.out.println(obj.getClass() + " is not String");

			}
		}
		return list;
	}

	public static void main(String[] args) {
		Foo<String> foo = new Foo<>();
		List<String> strList = new ArrayList<>();
		strList.add("hello");
		strList.add("hello");
		strList.add("hello");

		List<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);

		foo.castCollectionRightTwo(strList, String.class);

		// In two it actually use the predefined type in Class (String) not flexible!!!!!!
		foo.castCollectionRightTwo(integerList, Integer.class);

		// In one it discards the predefined type in Class!!!!!
		foo.castCollectionRightOne(integerList, Integer.class);

		foo.castCollectionRightOne(strList, String.class);

	}

}
