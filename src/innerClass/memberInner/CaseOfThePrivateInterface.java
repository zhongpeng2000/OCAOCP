/**
 * Project: OCAOCP
 * File: CaseOfThePrivateInterface.java
 * Date: Dec 25, 2015
 * Time: 7:02:50 PM
 */

package innerClass.memberInner;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public class CaseOfThePrivateInterface {
	private interface Secret {
		 void shh();
	}
	class DontTell implements Secret {
		public void shh(){
			System.out.println("haha");
		}
	}
	
	public static void main(String[] args) {
		CaseOfThePrivateInterface caseOfThePrivateInterface  = new CaseOfThePrivateInterface();
		Secret secret =caseOfThePrivateInterface.new DontTell();
		secret.shh();
	}

}
