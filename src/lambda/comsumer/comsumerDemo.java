package lambda.comsumer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class comsumerDemo {
	
	public static Consumer<List<Integer>> methodRef1 = Collections::sort;
	public static Consumer<List<Integer>> lambda1 =  l->Collections.sort(l);
	
	public static Consumer<List<Integer>> print =  l-> l.forEach(i->System.out.println(i));
	
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(0);
		
		print.accept(list);
		
		methodRef1.accept(list);
		
		print.accept(list);
		
		
		
		
	}

}
