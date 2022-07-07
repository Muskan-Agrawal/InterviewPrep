package dsalgo.recursion;

import java.util.*;

public class LinkedListPreDefined implements Cloneable {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		LinkedList<Integer> ll= new LinkedList<Integer>();
		
		//adding elements---
		ll.add(11);
		ll.add(12);
		ll.add(13);
		ll.add(14);
		ll.add(15);
		
		//printing elements--->
		System.out.println(ll);
		
		//adding at first position
		ll.addFirst(16);
		
		//adding at last position
		ll.addLast(17);
		
		System.out.println(ll);
		
		//removing elements---->
		ll.remove(1); // here 1 is position
		ll.remove(4);
		ll.remove(1);
		ll.removeLast();
		ll.removeFirst();
		System.out.println("After removing 1,3,6, last and first elements:  "+ll);
		
		//size of the list
		System.out.println(ll.size());
		
		//to fetch the elements 
		System.out.println(ll.get(1));
		
		//to change the value of particular elements-->
		ll.set(1, 88);
		System.out.println(ll);
		
		//to create copy of the list
		LinkedList<Integer> ll2= new LinkedList<Integer>();
		ll2 = (LinkedList<Integer>) ll.clone();
		System.out.println(ll2);
		//while cloning, shallow copy of elements are passed... no change in value like when passing refernce
		
		//deleting / clearing
		ll2.clear();
		System.out.println(ll2);
		
		//offer method to add the element
		//difference btween offer and add is add throws exception when size is fixed and limit is being exceeded
		//while offer return false
		
		ll.offer(20);
		ll.offerFirst(30);
		ll.offerLast(40);			
		System.out.println(ll);
		
		//poll() retrieves and remove
		System.out.println(ll.poll()+"  "+ll);
		System.out.println(ll.pollLast());
		
		
		//toArray()--->
		Object arr[] = ll.toArray();
		//arr = ll.toArray();
		System.out.println(arr);
		System.out.print("Array: ");
		for(Object o : arr)
			System.out.print(o+"\t");
		
		
	}

}
