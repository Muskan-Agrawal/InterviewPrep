package dsalgo.LinkedList;

import dsalgo.liststackqueue.Node;

public class RotateList {

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
		node = RotateList.rotateListByK(node, 10);
		node.printList(node);
	}

	public static Node rotateListByK(Node node, int k) {
		if(node == null || node.next == null || k <= 0) {
			return node;
		}
		
		Node prevHead = node;
		Node newEnd = null;
		Node newHead = null;
		int i=0, flag=0;
		while(node.next != null) {
			i++;
			if(i == k) {
				newEnd = node;
				newHead = node.next;
				flag = 1;
			}
			node = node.next;
		}
		//if k is greater than length of list, print exception
		if(flag == 0) {
			System.err.print("Rotation is more than list length");
			return prevHead;
		}
		node.next = prevHead;
		newEnd.next = null;
		return newHead;
	}
}
