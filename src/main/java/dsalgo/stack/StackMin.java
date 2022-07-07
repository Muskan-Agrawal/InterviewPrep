package dsalgo.stack;

import java.util.Stack;

import dsalgo.liststackqueue.StackMine;

public class StackMin<T> extends StackMine<T> {
	int min;
	StackMine<Integer> stack = new StackMine<Integer>();
	
	public static void main(String[] args) {
		StackMin<Integer> s = new StackMin<Integer>();
		s.main();
	}
	
	//TODO generic problem remove
	public void push(int data) {
		if(stack.isEmpty()) {
			min = data;
			//super.push(data);
		}
		//else if(Integer.parseInt(min) > data){
			
		
	}
	
	//TODO : correct logic error 
	public void main() {
		Stack<Integer> stack = new Stack<Integer>();
		StackMin<Integer> s = new StackMin<Integer>();
		
		s.push(stack,3);
		s.push(stack,5);
		s.push(stack,2);
		s.push(stack,1);
		System.out.print("Minimum:"+minEle);
		s.push(stack,1);
		s.push(stack,-1);
		
		System.out.println("Pop "+s.pop(stack)+"Min: "+minEle);
		System.out.println("Pop "+s.pop(stack)+"Min: "+minEle);
		System.out.println("Pop "+s.pop(stack)+"Min: "+minEle);
		System.out.println("Pop "+s.pop(stack)+"Min: "+minEle);
		System.out.println("Pop "+s.pop(stack)+"Min: "+minEle);
		System.out.println("Pop "+s.pop(stack)+"Min: "+minEle);
		

	}
	static int minEle = 0;
	public void push(Stack<Integer> s, int data) {
		if(s.isEmpty()) {
			minEle = data;
			s.push(data);
		}
		else {
			if(data<minEle) {
				//int prevMin = minEle;
				minEle = data;
				data = 2*data-minEle;
			}
			s.push(data);
		}
	}
	
	public int pop(Stack<Integer> s) {
		if(s.isEmpty())
			return -1;
		int val = s.pop();
		if(val < minEle) {
			int v = minEle;
			minEle = 2*minEle - val;
			return v;
		}
		return val;
	}

}

