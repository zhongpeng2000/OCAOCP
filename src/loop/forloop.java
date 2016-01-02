package loop;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

class NPE {
	static String string;

}

class Demo {

	static Demo showError = null;

	static {
		showError.go();
	}

	public void go() {
		System.out.println("Hi");
	}

	public static void main(String[] args) {

	}

}

public class forloop {

	static int x = 0;
	static Integer z;
	private int y = 0;

	{
		x++;
		y++;
		System.out.println("x increment block");
	}

	static {
		x++;
		System.out.println("x increment");

	}

	public forloop() {
		// System.out.println("before super");
		super();
		System.out.println("after super " + x);
	}

	public void go() {
		System.out.println("Hi");
		"abc".toUpperCase();
	}

	static String s;
	static int count = 0;

	public static void fool() {
		System.out.println(++count);
		fool();

	}

	public static void main(String[] args) {
//		System.out.println(s.length());
		try{
			fool();
		}catch(Error e){
			System.out.println("ouch");
		}
		
//		for(int i = 0; i <10; )
//		{
//			System.out.println(i);
//			i++;
//			System.out.println("HI");
//		}
		
		forloop aForloop = new forloop();
		forloop aForloop1 = new forloop();
		forloop aForloop2 = new forloop();
		
		System.out.println(z++);
		
//		outer:
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 5; j++ ) {
					System.out.println("Hello");
					//continue outer;
					continue;
				}
				System.out.println("outer");
				
			}
			

		
		
		System.out.println("OK");
	}

}
