/**
 * Project: OCAOCP
 * File: EnumDemo2.java
 * Date: Dec 25, 2015
 * Time: 5:49:57 PM
 */

package enumDemo;

/**
 * @author Alexander Zhong, A00972836
 *
 */
enum SeasonWithMethod{
	WINTER{
		public void printHours(){
			System.out.println("3am-3pm");
		}
	}, SPRING{
		public void printHours(){
			System.out.println("9am-5pm");
		}
	}, SUMMER{
		public void printHours(){
			System.out.println("9am-7pm");
		}
	},FALL{
		public void printHours(){
			System.out.println("9am-5pm");
		}
	};
	//public abstract void printHours();
	public void printHours(){
		
	}
}


public class EnumDemo2 {
	public static void main(String[] args) {
		SeasonWithMethod season = SeasonWithMethod.WINTER;
		System.out.println(season);
		season.printHours();
	}
}
