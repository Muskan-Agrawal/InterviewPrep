package dsalgo.liststackqueue;

public class Node {

	public int data;
	public Node next ;
	
//	public Node() {
//		
//	}
	
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
	
	public Node addLast(Node node, Node newNode) {
		Node curr = node;
		while(curr.next != null) {
			curr = curr.next; 
		}
		curr.next = newNode;
		return node;
	}
	
	public Node addLast(Node node, int newNodeData) {
		Node curr = node;
		while(curr.next != null) {
			curr = curr.next; 
		}
		curr.next = new Node(newNodeData);
		return node;
	}
	
}
