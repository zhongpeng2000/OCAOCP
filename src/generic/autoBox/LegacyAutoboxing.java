/**
 * Project: OCAOCP
 * File: LegacyAutoboxing.java
 * Date: Dec 29, 2015
 * Time: 10:28:18 PM
 */

package generic.autoBox;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public class LegacyAutoboxing {

	public static void main(String[] args) {
		List numbers = new ArrayList<>();
		
		numbers.add(1);
		
		//compiler does not know if numbers contain integers!!!!!!!!!!!!!
		int result =  numbers.get(0);
		
		int result2 =  (Integer) numbers.get(0);
		
	}

}
