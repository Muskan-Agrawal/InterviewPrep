package dsalgo.LinkedList;

import java.util.Hashtable;

import dsalgo.liststackqueue.Node;
public class RemoveDuplicate {

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
		
		node = RemoveDuplicate.removeDuplicate(node);
		System.out.println("\n\nAfter: ");
		node.printList(node);
	}
	
	public static Node removeDuplicate(Node node) {
		Node current = node;
		Node prev = null;
		Hashtable<Integer, Integer> hash = new Hashtable<Integer, Integer>();
		
		while(current != null) {
			//if the hashtable will have the current node's data mean its already present earlier. so remove it, else add into hashtable
			if(hash.containsKey(current.data)) {
				prev.next = current.next;
				current.next = null;
				current = prev.next;
			}
			else {
				hash.put(current.data, 1);
				prev = current;
				current = current.next;
			}
			
		}
		return node;
	}

}
