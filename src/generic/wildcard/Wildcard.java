/**
 * Project: OCAOCP
 * File: Wildcard.java
 * Date: Jan 3, 2016
 * Time: 3:54:35 PM
 */

package generic.wildcard;

import java.awt.CardLayout;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public class Wildcard {

	public void showSize(List<?> list) {
		System.out.println(list.size());
	}
	
	public static void main(String[] args) {
		Wildcard wildcard = new Wildcard();
		
		
		ArrayDeque<?> list1 = new ArrayDeque<String>();
		
		wildcard.showSize(list1);
		
		List<Exception> list2 = new ArrayList<IOException>();
		
		Vector<? extends Number> list3 = new Vector<Integer>();
		
		wildcard.showSize(list3);
		
		
		
	}

}
