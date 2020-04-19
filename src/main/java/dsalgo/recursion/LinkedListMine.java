package dsalgo.recursion;

public class LinkedListMine {
	Node head;
	//elements of a node in linked list
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data = d;
			this.next = null;
		} 
	}
	public static void main(String[] args) {
		LinkedListMine list = new LinkedListMine();
		
		
		list.insert(list, 11, 0);
		list.insert(list, 12, 1);
		list.insert(list, 13, 2);
		list.insert(list,  14,  -1);
		list.insert(list,  15,  1);
		list.display(list);
		list.remove(list, 14);
		list.remove(list, 15);
		list.remove(list, 11);
		list.remove(list, 19);
		list.display(list);
	}
	public static LinkedListMine create(LinkedListMine list, int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		
		if(list.head == null)
			list.head=newNode;
		
		else {
			Node current = list.head;
			while(current.next != null)
				current = current.next;
			
			current.next=newNode;
		}
		
		return list;
		
	}
	
	public LinkedListMine insert(LinkedListMine list, int data, int position) {
		Node newNode = new Node(data);
		Node current = list.head;
		if(list.head == null)
			list.head = newNode;
		else {
			if(position == 0) {
				current.next = newNode;
				newNode.next = current;
			}
			else if(position == -1) {

				while(current.next != null)
					current = current.next;
				
				current.next=newNode;
			}
			else {
				while(position != 1 && current.next != null) {
					current = current.next;
					position--;
				}
				newNode.next = current.next;
				current.next = newNode;
				
			}
		}
		return list;
	}
	
	LinkedListMine remove(LinkedListMine list, int data) {
		if(list == null) {
			System.out.println("Empty list");
			return list;
		}
		Node current = list.head;
		if(list.head.data == data) {
			list.head=current.next;
			System.out.println("the element deleted is: "+data);
			return list;
		}
		while(current.next != null && current.next.data != data ) {
			current = current.next;
		}
		if(current.next == null) {
			System.out.println("Element not found!!");
			return list;
		}
		System.out.println("the element deleted is: "+ data);
		current.next=current.next.next;
		return list;
	}
	
	void display(LinkedListMine list) {
		if(list.head == null) {
			System.out.println("list empty");
			return;
		}
		System.out.println("List:  ");
		Node current = list.head;
		while(current != null) {
			System.out.print(current.data+"\t");
			current = current.next;
		}
		
		System.out.println();
	}
		
}


