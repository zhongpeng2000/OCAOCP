package generic.trick;

import java.util.ArrayList;
import java.util.List;

class A{}
class B extends A{}
class C extends B{}


public class Demo {

	public static void main(String[] args) {
		List<?> list1 = new ArrayList<A>();
		List<? extends A> list2 = new ArrayList<A>();
		List<? super A> list3 = new ArrayList<A>();
		
		List<? extends B> list4 = new ArrayList<A>();
		
		List<? super B> list5 = new ArrayList<A>();
		
		List<?> list6 = new ArrayList<? extends A>();
		
	}

}
