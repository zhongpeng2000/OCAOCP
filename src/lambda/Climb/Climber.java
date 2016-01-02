/**
 * Project: OCAOCP
 * File: Climb.java
 * Date: Dec 27, 2015
 * Time: 11:39:41 PM
 */

package lambda.Climb;

/**
 * @author Alexander Zhong, A00972836
 *
 */

interface Climb {

	boolean isTooHigh(int height, int limit);

}

public class Climber {
	public static void main(String[] args) {
		check((h, l) -> h.toString(), 5);
		
	}
	private static void check(Climb climb, int height) {
		if(climb.isTooHigh(height, 10))
			System.out.println("too high");
		else System.out.println("ok");
	}
}
