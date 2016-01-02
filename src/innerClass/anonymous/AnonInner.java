/**
 * Project: OCAOCP
 * File: AnonInner.java
 * Date: Dec 25, 2015
 * Time: 8:10:00 PM
 */

package innerClass.anonymous;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public class AnonInner {
	interface SaleTodayOnly {
		int dollarsOff();
	}
	
	public int pay(){
		return admission(5 , new SaleTodayOnly() {
			
			@Override
			public int dollarsOff() {
				return 3;
			}
		});
		
	}
	public int admission(int basePrice,SaleTodayOnly sale) {
		return basePrice - sale.dollarsOff();
	}
	
	public static void main(String[] args) {
		
	}

}
