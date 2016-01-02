
public class Calculator {

	public static void main(String[] args) {
		int num = 5;
		int sum = 0;
		
		do {
			sum += num;
			System.out.println("IN" + num);
		}while ((num--) > 1);
		
//		while ((num--) > 1){
//			sum += num;
//			System.out.println("IN" + num);
//		}
		
		
//		do {
//			sum += num;
//			num--;
//			System.out.println("IN" + num);
//		}while (num > 1);
		
		System.out.println("The sum is " + sum);
	}

}
