package generic.upperBounded;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		//List<Number> list = new ArrayList<Integer>();
		
		List<? extends Number> list = new ArrayList<Integer>();
		
		list.add(new Integer(2));
		list.add(new Double(2));
	}
}
