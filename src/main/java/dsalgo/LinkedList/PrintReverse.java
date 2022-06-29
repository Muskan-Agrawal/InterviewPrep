package dsalgo.LinkedList;

import java.util.Stack;

import dsalgo.liststackqueue.Node;

public class PrintReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = new Node(1);
		node.next = new Node(5);
		node.next.next = new Node(4);
		node.next.next.next = new Node(5);
		node.next.next.next.next = new Node(6);
		node.next.next.next.next.next = new Node(5);
		node.next.next.next.next.next.next = new Node(7);
		
		System.out.print("Before: ");
		node.printList(node);
		System.out.print("\nAfter: ");
		PrintReverse.printReverse(node);
		System.out.print("\nAfter: ");
		PrintReverse.printReverseUsingStack(node);
	}

	//using recursion
	public static void printReverse(Node node) {
		if(node == null)
			return;
		printReverse(node.next);
		//printing the data while backtracking
		System.out.print(node.data+"->");
	}
	
	public static void printReverseUsingStack(Node node) {
		Stack<Integer> stack = new Stack<Integer>();
		//pushing element first and then popping out (results in reverse order
		while(node != null) {
			stack.add(node.data);
			node = node.next;
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+"->");
		}
	}
}
