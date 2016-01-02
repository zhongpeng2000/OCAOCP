/**
 * Project: OCAOCP
 * File: Otter.java
 * Date: Dec 25, 2015
 * Time: 11:59:04 PM
 */

package equals;


/**
 * @author Alexander Zhong, A00972836
 *
 */

public interface Otter {
	default void play() {}


}
class RiverOtter implements Otter {
	
	@Override
	public boolean equals(Otter o) {
		return false;
		
	}
}
