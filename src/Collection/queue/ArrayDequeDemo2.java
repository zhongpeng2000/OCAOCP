package Collection.queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo2 {
	public static void main(String[] args) {
		ArrayDeque<String> greetings = new ArrayDeque<>();
		greetings.push("hello");
		greetings.push("hi");
		greetings.push("ola");
		greetings.pop();
		while(greetings.peek() != null) {
			System.out.println(greetings.pop());
		}
	}
}
