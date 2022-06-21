package dsalgo.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class SumLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		ll1.add(7);
		ll1.add(1);
		ll1.add(6);
		
		LinkedList<Integer> ll2 = new LinkedList<Integer>();
		ll2.add(5);
		ll2.add(9);
		ll2.add(2);
		
		SumLists s = new SumLists();
		LinkedList<Integer> sum = new LinkedList<Integer>();
		sum = s.sumLists(ll1,ll2);
		
		ListIterator<Integer> i = sum.listIterator();
		while(i.hasNext()) {
			System.out.print(i.next()+"->");
		}
//		System.out.print("\b\b");
	}
	
	public LinkedList<Integer> sumLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		int num1 = this.convertIntoNum(l1);
		int num2 = this.convertIntoNum(l2);
		int sum = num1+num2;
		LinkedList<Integer> sumList = new LinkedList<Integer>();
		sumList = this.convertIntoLL(sum);
		
		return sumList;
	}
	
	private int convertIntoNum(LinkedList<Integer> ll) {
		ListIterator<Integer> l = ll.listIterator(0);
		int num = 0, i=1;
		while(l.hasNext()) {
			num += l.next()*i;
			i *= 10;
		}
		System.out.println(num);
		
		// if number in the linked list is in reversed order, return reversed number, else return num
		return this.reverseNum(num);
	}
	
	private LinkedList<Integer> convertIntoLL(int num) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		while(num != 0) {
			ll.add(num%10);
			num /= 10;
		}
		
		// if number in the linked list is in reversed order, return reversed ll, else return ll
		return this.reverseLL(ll);		
	}
	
	private int reverseNum(int num) {
		int rev = 0;
		while(num != 0) {
			int rem = num%10;
			rev = rev*10+rem;
			num /= 10;
		}
		System.out.println(rev);
		return rev;
	}
	
	private LinkedList<Integer> reverseLL(LinkedList<Integer> ll) {
		LinkedList<Integer> revLL = new LinkedList<Integer>();
		ListIterator<Integer> i = ll.listIterator(ll.size());
		
		while(i.hasPrevious()) {
			revLL.add(i.previous());
		}
		return revLL;
	}
}
