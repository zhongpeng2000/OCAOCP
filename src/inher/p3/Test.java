package inher.p3;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import inher.p1.DoInterface;


class Alpha{
	public String doStuff(String msg) {
		return msg;
	}
}
class Beta extends Alpha{
	public String doStuff(String msg) {
		return msg.replace('a','e');
	}
}

class Gamma extends Beta{
	public String doStuff(String msg) {
		return msg.substring(2);
	}
}

public class Test {

	public static void main(String[] args) {
//		DoInterface doInterface = new DoClass();
//		doInterface.m1(200);
		
		
//		int[] fst = {1,2,3,4,5,4,3,2,1};
//		int sum = 0;
//		for (int frnt = 0, rear = fst.length -1; frnt < 5 && rear >= 5; frnt++, rear--){
//			sum = sum + fst[frnt] + fst[rear];
//		}
//		System.out.println(sum);	
//		
//		int[] xx = null;
//		for (int i : xx){
//			System.out.println(i);
//		}
		
		
		List<Alpha> strs = new ArrayList<>();
		strs.add(new Alpha());
		strs.add(new Beta());
		strs.add(new Gamma());
		for (Alpha t: strs){
			System.out.println(t.doStuff("Java"));
		}
		
//		char x = 8;
//		int z = '8';
//		System.out.println(x);
//		System.out.println(z);
	}

}
