package dsalgo.liststackqueue;

import java.util.*;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkedList r = new ReverseLinkedList();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(5);
		ll.add(6);
		ll.add(7);
		ll.add(8);
		//display
		try {
			int i=0;
			while( ! ll.isEmpty() ) {
				System.out.print(ll.get(i)+" ");
				i++;
			}
		
		}
		catch(java.lang.IndexOutOfBoundsException e) {}
		ll = r.reverseList(ll);
		
		//display reverse------>
		System.out.print("\n"+"Reverse: ");
		int i=0;
		try{
			while( ! ll.isEmpty()) {
		
				System.out.print(ll.get(i)+" ");
				i++;
			}
		}
		catch(java.lang.IndexOutOfBoundsException e) {}
	}
	LinkedList<Integer> reverseList(LinkedList<Integer> ll) {
		LinkedList<Integer> reverse = new LinkedList<Integer>();
		while( ! ll.isEmpty()) {
			reverse.addFirst(ll.removeFirst());
		}
		
		return reverse;
	}

}
