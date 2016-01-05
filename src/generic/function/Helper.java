package generic.function;

import java.io.FileNotFoundException;

import javax.print.PrintException;

public class Helper {

	public static <U extends Exception> void PrintException(U u) {
		System.out.println(u.getMessage());
	}
	
	public static void main(String[] args) {
		Helper.PrintException(new FileNotFoundException("A"));
		Helper.PrintException(new Exception("B"));
		
		Helper.<Throwable>PrintException(new Exception("C"));
		
		Helper.<NullPointerException>PrintException(new NullPointerException("C"));
		
		Helper.PrintException(new Throwable());
	}

}
