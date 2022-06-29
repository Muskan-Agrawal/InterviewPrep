package dsalgo.LinkedList;

import dsalgo.liststackqueue.Node;

public class CycleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = new Node(1);
		node.next = new Node(5);
		node.next.next = new Node(4);
		node.next.next.next = new Node(5);
		node.next.next.next.next = new Node(6);
		node.next.next.next.next.next = new Node(5);
		//node.next.next.next.next.next.next = node.next.next.next;
		
		System.out.print(CycleLinkedList.isCyclePresent(node));
	}

	public static boolean isCyclePresent(Node node) {
		if(node == null)
			return false;
		Node slowP = node;
		Node fastP = node.next;
		
		// if cycle is present, the slow pointer will be equal to fast pointer at least once in 2 cycle of iteration inside the loop
		while(fastP!=null) {
			if(fastP == slowP)
				return true;
			if(fastP.next == null)
				return false;
			fastP = fastP.next.next;
			slowP = slowP.next;
		}
		return false;
	}
}
