/**
 * Project: OCAOCP
 * File: Foo.java
 * Date: Dec 29, 2015
 * Time: 8:29:52 PM
 */

package generic.newGenerics;

/**
 * @author Alexander Zhong, A00972836
 *
 */


// java style new T()!!!!!!

class X {


	void doSomething(){System.out.println("Hello world");}
}

class Y extends X {
	
}


public class Foo<T extends X> {
	//T f = new T(); compile error!!!!!!!!!!!!!!!!!!!!
	private static class SomeContainer<T>
	{
	    T createContents(Class<T> clazz) throws InstantiationException, IllegalAccessException
	    {
	        return clazz.newInstance();
	    }
	}
	
	public static void main(String[] args) {
		Foo foo = new Foo<Y>();
		SomeContainer<Y> someContainer = new SomeContainer<>();
		try {
			someContainer.createContents(Y.class).doSomething();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
