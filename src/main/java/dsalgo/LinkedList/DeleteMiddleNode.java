package dsalgo.LinkedList;

import dsalgo.liststackqueue.Node;

public class DeleteMiddleNode {

	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(5);
		node.next.next = new Node(4);
		node.next.next.next = new Node(5);
		node.next.next.next.next = new Node(6);
		node.next.next.next.next.next = new Node(5);
		//node.next.next.next.next.next.next = new Node(7);
		
		System.out.print("Before: ");
		node.printList(node);
		
		System.out.println("\nDeleted element: "+DeleteMiddleNode.deleteMiddle(node).data);
		System.out.print("After: ");
		node.printList(node);
	}
	
	public static Node deleteMiddle(Node node) {
		Node ref = node;
		Node main = node;
		Node prev = null;
		
		//iterate ref through every 2nd element till last of the list(2x)
		//iterate main one by one. till ref reaches the last element, main reached half the list
		while(ref.next.next != null) {
			ref = ref.next.next;
			prev = main;
			main = main.next;
		}
		ref = main;
		prev.next = main.next;
		main.next = null;
		main = prev.next;
		return ref;
	}
}
