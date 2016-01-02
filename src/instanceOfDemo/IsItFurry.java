/**
 * Project: OCAOCP
 * File: IsItFurry.java
 * Date: Dec 26, 2015
 * Time: 12:44:07 PM
 */

package instanceOfDemo;

import java.util.ArrayList;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public class IsItFurry {
	static class Chipmunk{}
	public static void main(String[] args) {
		Chipmunk c = new Chipmunk();
		ArrayList<Chipmunk> l = new ArrayList<>();
		Runnable r = new Thread();
		int result = 0;
		if (c instanceof Chipmunk) result += 1;
		if (l instanceof Chipmunk) result += 2;
		if (r instanceof Chipmunk) result += 4;
		System.out.println(result);
		
	}
}
