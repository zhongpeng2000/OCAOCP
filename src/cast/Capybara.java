/**
 * Project: OCAOCP
 * File: Capybara.java
 * Date: Dec 26, 2015
 * Time: 10:55:34 PM
 */

package cast;

/**
 * @author Alexander Zhong, A00972836
 *
 */

class Rodent {
	private StringBuilder var = new StringBuilder("abc");

	/**
	 * @return the var
	 */
	public StringBuilder getVar() {
		return var;
	}

	/**
	 * @param var the var to set
	 */
	public void setVar(StringBuilder var) {
		this.var = var;
	}
	
	
}


public class Capybara extends Rodent{
	
	public static void main(String[] args) {
		Rodent rodent = new Rodent();
		//classCastException
		
		if(rodent instanceof Capybara) {
			Capybara capybara = (Capybara)rodent;
		}
		
		
		//Capybara capybara = (Capybara)rodent;
		
		Capybara aCapybara = new Capybara();
		StringBuilder string = aCapybara.getVar();
		string.append("abc");
		System.out.println(string);
		System.out.println(aCapybara.getVar());
		
	}

}
