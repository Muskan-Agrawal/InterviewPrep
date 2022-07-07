package dsalgo.stack;

import java.util.Stack;

public class SortStack {
	Stack<Integer> stack = new Stack<Integer>();
	
	public static void main(String[] args) {
		SortStack s = new SortStack();
		s.stack.push(5);
		s.stack.push(3);
		s.stack.push(4);
		s.stack.push(2);
		s.stack.push(7);
		s.stack.push(1);
		s.stack = s.sortStack();
		System.out.print("pop:"+s.stack.pop());
		System.out.print("pop:"+s.stack.pop());
		System.out.print("pop:"+s.stack.pop());
		System.out.print("pop:"+s.stack.pop());
		System.out.print("pop:"+s.stack.pop());
		System.out.print("pop:"+s.stack.pop());
	}
	
	public Stack<Integer> sortStack() {
		Stack<Integer> temp = new Stack<Integer>();
		while(!stack.isEmpty()) {
			int val = stack.pop();
			while(!temp.isEmpty() && val<temp.peek()) {
				stack.push(temp.pop());
			}
			temp.push(val);
		}
		return temp;
	}

}
