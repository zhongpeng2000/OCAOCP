package generic.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;

public class ListDemo {
	public static void main(String[] args) {
		
		// this is not OK
		HashSet<Number> hs = new HashSet<Integer>();
		//the following is OK
		Number num = new Integer(20);
		
		// Exception is a super class of the ClassCastException
		HashSet<? super ClassCastException> set = new HashSet<Exception>();
		
		List<String> list = new Vector<String>();
		
		List<String> list2 = new Vector<String>();
		
		
		List<Object> values = new HashSet<Object>();
		
		List<Object> objects = new ArrayList<? extends Object>();
		
		
		
		
		
	}
}
