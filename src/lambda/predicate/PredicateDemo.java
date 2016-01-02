package lambda.predicate;

import java.util.function.Consumer;
import java.util.function.Predicate;


public class PredicateDemo {

	static String string = "abc";
	static Predicate<String> methodRef = string::startsWith;
	static Predicate<String> lambda = l -> string.startsWith(l);
	
	static Consumer<String> printStr = l -> System.out.println(l);
	static Consumer<String> printStr2 = System.out::println;
	
	
	public static void main(String[] args) {
		String test1 = "ab";
		String test2 = "ac";
		
		printStr.accept(test1);
		printStr.accept(test2);
		
		
		System.out.println(methodRef.test(test1));
		System.out.println(lambda.test(test1));
		
		System.out.println(methodRef.test(test2));
		System.out.println(lambda.test(test2));
	}

}
