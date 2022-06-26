package dsalgo.LinkedList;

import dsalgo.liststackqueue.Node;

public class RemoveNthFromLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = new Node(1);
		node.next = new Node(5);
		node.next.next = new Node(4);
		node.next.next.next = new Node(5);
		node.next.next.next.next = new Node(6);
		node.next.next.next.next.next = new Node(5);
		node.next.next.next.next.next.next = new Node(7);
		node.printList(node);
		
		Node element = RemoveNthFromLast.removeNthFromLast(node, 5);
		System.out.println("Element: "+ element.data);
	}
	
	public static Node removeNthFromLast(Node node, int n) {
		if(node == null || n < 0)
			return null;
		
		Node ref = node;
		Node main = node;
		
		//iterate reference pointer till nth element
		while(ref!=null && n!=0) {
			ref = ref.next;
			n--;
		}
		
		//iterate remaining length-n element
		while(ref!=null) {
			main = main.next;
			ref = ref.next;
		}
		return main;
	}

}
