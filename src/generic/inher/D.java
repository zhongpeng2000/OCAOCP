/**
 * Project: OCAOCP
 * File: D.java
 * Date: Jan 3, 2016
 * Time: 8:03:34 PM
 */

package generic.inher;

/**
 * @author Alexander Zhong, A00972836
 *
 */

class A{}
class B extends A {}
class C extends B {}


public class D<C> {

	A a1 = new A();
	A a2 = new B();
	
	// C is the type parameter in class D
	A a3 = new C();
	
	C c1 = new A();
	C c2 = new B();
	C c3 = new C();
	
	

}
