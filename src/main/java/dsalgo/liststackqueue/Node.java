package dsalgo.liststackqueue;

public class Node {

	public int data;
	public Node next ;
	public Node(int d){
		data=d;
		next = null;
	}
	
	public void printList(Node node) {
		System.out.print("\n List: ");
		while(node != null) {
			System.out.print(node.data+"->");
			node = node.next;
		}
	}
}
