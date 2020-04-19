package dsalgo.recursion;

import java.util.Queue;
import java.util.LinkedList;

public class QueuePredefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue= new LinkedList<String>();
		queue.add("happy");
		queue.add("love");
		queue.add("care");
		queue.add("humanity");
		queue.add("passion");
		
		System.out.println(queue);
		
		System.out.println("peek: "+queue.peek());
		System.out.println("queue: "+queue.remove());
		System.out.println("poll: "+queue.poll());
		System.out.println(queue);
		System.out.println("size: "+queue.size());
	}

}
