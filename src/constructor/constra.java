/**
 * Project: OCAOCP
 * File: constra.java
 * Date: Dec 6, 2015
 * Time: 2:20:12 PM
 */

package constructor;

/**
 * @author Alexander Zhong, A00972836
 *
 */






public class constra {

	/**
	 * 
	 */
	public constra() {
		this("foo");
		// TODO Auto-generated constructor stub
	}
	
	public constra(String s){

	}
	
	public void go(){
		doStuff();
	}
	
	public void doStuff(){
		go();
	}
	
	public static void main(String[] args) {
		constra constra = new constra();
		constra.go();
	}

}
