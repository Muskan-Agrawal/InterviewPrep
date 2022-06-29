package dsalgo.LinkedList;

import dsalgo.liststackqueue.Node;

public class ReorderList {

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
		
		node = ReorderList.reorderList(node);
		System.out.print("\nAfter: ");
		node.printList(node);
	}

	public static Node reorderList(Node node) {
		if(node == null || node.next == null)
			return node;
		//find the mid element to divide the list using slow-pointer and fast-pointer
		Node slow = node, fast = node;
		while(fast != null) {
			if(fast.next == null)
				break;
			slow = slow.next;
			fast = fast.next.next;
		}
		//divide the list into two halves
		Node node2 = slow.next;
		slow.next = null;
		
		//reverse the second half of the list
		node2 = ReverseList.reverseLL(node2);
		
		//merge the first half with reversed 2nd half one by one element
		Node newNode = new Node(node.data);
		newNode.next = new Node(node2.data);
		
		while(node.next != null && node2.next != null) {
			node = node.next;
			node2 = node2.next;
			newNode.addLast(newNode, node.data);
			newNode.addLast(newNode, node2.data);
		}
		if(node != null) newNode.addLast(newNode, node.next);
		return newNode;
	}
}
