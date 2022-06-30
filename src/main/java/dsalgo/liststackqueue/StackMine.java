package dsalgo.liststackqueue;

import java.util.*;
public class StackMine<T> {
	Node top;
	class Node{
		T data;
		Node next;
		Node(T d){
			data=d;
			next=null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackMine<Character> stack = new StackMine<Character>();
		stack.push('5');
		stack.display();
		stack.push('6');
		stack.push('7');
		stack.push('8');
		stack.display();
		stack.pop();
		stack.pop();
		stack.push('9');
		stack.push('{');
	}
	
	protected void push(T data) {
		Node newnode = new Node(data);
		newnode.next = top;
		top = newnode;
	}
	
	public T pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		T data = top.data;
		top = top.next;
		
		return data;
	}
	
	public T peek() {
		if(top == null) {
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("No Elemenst");
			return;
		}
		System.out.println("Stack: ");
		Node current = top;
		while(current != null) {
			System.out.print(current.data+"\t");
			current = current.next;
		}
	}

	public boolean isEmpty() {
		if(top == null)
			return true;
		return false;
	}
}
