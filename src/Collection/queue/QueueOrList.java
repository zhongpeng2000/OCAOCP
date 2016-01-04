package Collection.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueOrList {

	public static void main(String[] args) {
		List<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(12);
		q.remove(1);
		System.out.println(q);
		
		Queue<Integer> q1 = new LinkedList<>();
		q1.add(10);
		q1.add(12);
		//q1.remove(1);
		q1.remove();
		System.out.println(q1);
	}

}
