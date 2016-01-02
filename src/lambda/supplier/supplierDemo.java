package lambda.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import lambda.comsumer.comsumerDemo;

public class supplierDemo {

	Supplier<ArrayList<Integer>> methodRef = ArrayList::new;
	Supplier<ArrayList<Integer>> lambda = ()->new ArrayList<>();
	
	
	public static void main(String[] args) {
		supplierDemo supplierDemo = new supplierDemo();
		
		List<Integer> list = supplierDemo.methodRef.get();
		List<Integer> list2 = supplierDemo.lambda.get();
		
		list.add(1);
		list2.add(2);
		
		comsumerDemo.print.accept(list);
		
		comsumerDemo.print.accept(list2);
		
		list.removeIf(s->s.equals(100));
	}
}
