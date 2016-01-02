package Collection.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();
		System.out.println(queue.offer(10));
		System.out.println(queue.offer(4));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		for(Integer integer: queue) {
			System.out.println(integer);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		
		System.out.println("------------------------------");
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.push(10);
		stack.push(4);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		for(Integer integer: stack) {
			System.out.println(integer);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println(stack.peek());
		System.out.println(stack.poll());
		System.out.println(stack.poll());
		System.out.println(stack.peek());
		
		List<String> strings = new ArrayList<>();
		strings.add("121231");
		strings.add("adsada");
		strings.add("ADFAW");
		
		Collections.sort(strings);
		
		System.out.println("------------------------------");
		strings.forEach(a->System.out.println(a));
		
		
		
		
		
		
	}
	
	
	
}
