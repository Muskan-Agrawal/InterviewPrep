package dsalgo.LinkedList;

import dsalgo.liststackqueue.Node;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = new Node(1);
		node.next = new Node(5);
		node.next.next = new Node(4);
		node.next.next.next = new Node(5);
		node.next.next.next.next = new Node(6);
		node.next.next.next.next.next = new Node(5);
		node.next.next.next.next.next.next = new Node(7);
		
		System.out.print("Before ");
		node.printList(node);
		
		node = ReverseList.reverseLL(node);
		node.printList(node);
	}
	
	public static Node reverseLL(Node node) {
		if(node == null || node.next == null) {
			return node;
		}
		Node prev = null;
		Node current = node;
		Node next = node.next;
		
		while(next != null) {
			current.next = prev;
			prev = current;
			current = next;
			next = next.next;
		}
		current.next = prev;
		return current;
	}
}
