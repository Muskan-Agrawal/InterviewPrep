package dsalgo.recursion;

import java.util.*;

public class StackPredefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		
		//pushing elemest---
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
		
		System.out.println(stack);
		
		System.out.println("pop:"+stack.pop());
		System.out.println("pop: "+stack.pop());
		System.out.println("peek: "+stack.peek());
		
		System.out.println(stack);
		//search() returns the position
		System.out.println("search 13: "+stack.search(13));
		//when elements is not there
		System.out.println("search 10: "+stack.search(10));
	}

}
