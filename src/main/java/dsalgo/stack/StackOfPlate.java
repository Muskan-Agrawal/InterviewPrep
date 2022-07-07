package dsalgo.stack;

import java.util.Stack;

public class StackOfPlate{
	static final int MAX_SIZE = 5;
	// TODO: Implement same without passing stacks as parameter in push and pop methods
	public static void main(String[] args) {
		Stack<Stack<Integer>> stacks = new Stack<Stack<Integer>>();
		
		StackOfPlate s = new StackOfPlate();
		
		s.push(stacks, 1);
		s.push(stacks, 2);
		s.push(stacks, 3);
		s.push(stacks, 4);
		s.push(stacks, 5);
		s.push(stacks, 6);
		s.push(stacks, 7);
		s.push(stacks, 8);
		s.push(stacks, 9);
		s.push(stacks, 11);
		s.push(stacks, 12);
		s.push(stacks, 13);
		s.push(stacks, 14);
		s.push(stacks, 15);
		s.push(stacks, 16);
		
		System.out.println("Stack pop:"+s.pop(stacks));
		System.out.println("Stack pop:"+s.pop(stacks));
		System.out.println("Stack pop:"+s.pop(stacks));
		System.out.println("Stack pop:"+s.pop(stacks));
		System.out.println("Stack pop:"+s.pop(stacks));
		System.out.println("Stack pop:"+s.pop(stacks));
		System.out.println("Stack pop:"+s.pop(stacks));
		System.out.println("Stack pop:"+s.pop(stacks));
		System.out.println("Stack pop:"+s.pop(stacks));
		System.out.println("Stack pop:"+s.pop(stacks));
		System.out.println("Stack pop:"+s.pop(stacks));
		
	}
	
	public void push(Stack<Stack<Integer>> stacks, int data) {
		//if stack of stack is empty, make a new stack and pass 
		if(stacks.isEmpty()) {
			Stack<Integer> s = new Stack<Integer>();
			s.push(data);
			stacks.push(s);
			return;
		}
		Stack<Integer> s = stacks.peek();
		if(s.size() >= MAX_SIZE) {
			Stack<Integer> snew = new Stack<Integer>();
			snew.push(data);
			stacks.push(snew);
		}
		else
			s.push(data);
	}
	
	public int pop(Stack<Stack<Integer>> stacks) {
		int val = 0;
		Stack<Integer> s = stacks.pop();
		if(s.isEmpty()) {
			if(stacks.peek().isEmpty()) {
				System.out.print("\n Underflow!");
				return -1;
			}
			else {
				val =stacks.peek().pop();
			}
		}
		else {
			val = s.pop();
			stacks.push(s);
		}
		return val;
	}
}
