package dsalgo.liststackqueue;

import java.util.*;
public class StackMine {
	Node top;
	class Node{
		char data;
		Node next;
		Node(char d){
			data=d;
			next=null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackMine stack = new StackMine();
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
	
	void push(char data) {
		
		Node newnode = new Node(data);
		
	
		newnode.next = top;
		
		top = newnode;
	}
	
	char pop() {
		if(top == null) {
			throw new EmptyStackException();
		}
		
		char data = top.data;
		top = top.next;
		
		return data;
	}
	
	char peek() {
		if(top == null) {
			throw new EmptyStackException();
		}
		return top.data;
	}
	void display() {
		if(top == null) {
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

}
