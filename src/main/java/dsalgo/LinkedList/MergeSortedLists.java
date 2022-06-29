package dsalgo.LinkedList;

import java.util.ArrayList;

import dsalgo.liststackqueue.Node;

public class MergeSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = new Node(1);
		node.next= new Node(5);
		node.next.next = new Node(6);
		node = node.addLast(node, new Node(12));
		
		Node node2 = new Node(1);
		node2.addLast(node2, 1);
		node2.addLast(node2, 3);
		node2.addLast(node2, 4);
		
		Node node3 = new Node(2);
		
		ArrayList<Node> list = new ArrayList<Node>();
		list.add(node);
		list.add(node2);
		list.add(node3);
		
		Node sortedList ;
		sortedList = MergeSortedLists.sortKLists(list);
		System.out.println("After: ");
		node.printList(sortedList);
	}
	
	public static Node sortKLists (ArrayList<Node> list) {
		Node newList = new Node(list.get(0).data);
		Node minNode;
		int minIndex = 0;
		
		// to be checked
//		
//		for(int i=1; i<list.size(); i++) {
//			minNode = list.get(0);
//			minIndex = 0;
//			while(list.get(0) != null || list.get(1) != null || list.get(2) != null)
//			for(int j=1; j<list.size(); j++) {
//				if(minNode != null && list.get(j) != null && minNode.data > list.get(j).data) {
//					minNode = list.get(j);
//					minIndex = j;
//				}
//			}
//			newList.addLast(newList, minNode);
//			list.set(minIndex, minNode.next);
//		}
		
		
		return newList;
	}
}
