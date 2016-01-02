/**
 * Project: OCAOCP
 * File: Ambiguity.java
 * Date: Oct 16, 2015
 * Time: 3:27:42 PM
 */

/**
 * @author Alexander Zhong, A00972836
 *
 */

public class Ambiguity<T ,V> {

	/**
	 * 
	 */
	V ob1;
	T ob2;
	
	public Ambiguity() {
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @return the ob1
	 */
	public V getOb1() {
		return ob1;
	}


	/**
	 * @return the ob2
	 */
	public T getOb2() {
		return ob2;
	}


	/**
	 * @param ob1 the ob1 to set
	 */
	public void set(V ob1) {
		this.ob1 = ob1;
	}


	/**
	 * @param ob2 the ob2 to set
	 */
//	public void set(T ob2) {
//		this.ob2 = ob2;
//	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ambiguity<String, String> myA= new Ambiguity<>();
		myA.set(new String("abc"));
		

	}

}
