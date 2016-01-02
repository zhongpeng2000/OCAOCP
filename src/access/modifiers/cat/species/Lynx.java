/**
 * Project: OCAOCP
 * File: Lynx.java
 * Date: Dec 23, 2015
 * Time: 2:33:22 PM
 */

package access.modifiers.cat.species;

import access.modifiers.cat.BigCat;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public class Lynx extends BigCat{
	public static void main(String[] args) {
		BigCat cat = new BigCat();
		//Lynx cat = (Lynx)new BigCat();
		System.out.println(cat.name);
		System.out.println(cat.hasFur);
		System.out.println(cat.hasPaws);
		System.out.println(cat.id);
	}
}
