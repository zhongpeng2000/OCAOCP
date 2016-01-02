package generic.unboundedWildcards;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void printList(List<Object> list) {
		for(Object obj: list) {
			System.out.println(obj);
		}
	}
	
	public static <T> void  printListGeneric(List<T> list) {
		for(T t: list) {
			System.out.println(t);
		}
	}
	
	public static <T> void  printListUnBounded(List<?> list) {
		for(Object t: list) {
			System.out.println(t);
		}
	}
	
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		
		
		//compile error
		//printList(list);
		
		
		printListGeneric(list);
		printListUnBounded(list);
	}

}
