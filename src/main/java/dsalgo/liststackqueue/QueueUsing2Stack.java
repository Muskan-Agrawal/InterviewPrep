package dsalgo.liststackqueue;

import java.util.Stack;

public class QueueUsing2Stack extends StackMine<Integer>{
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	public static void main(String[] args) {
		QueueUsing2Stack q = new QueueUsing2Stack();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		
		System.out.println("Dequeue: "+q.dequeue());
		System.out.println("Dequeue: "+q.dequeue());
		System.out.println("Dequeue: "+q.dequeue());
		System.out.println("Dequeue: "+q.dequeue());
		System.out.println("Dequeue: "+q.dequeue());

	}
	
	//if stack1 is having data, pop from there
	//if stack1 is empty, pop everything from stack2 and push into stack1. the data in satck1 will be in fifo order then.
	int dequeue() {
		if(stack1.isEmpty()) {
			if(stack2.isEmpty()) {
				System.err.print("Stack Underflow!");
				return -1;
			}
			while(!stack2.isEmpty()) {
				stack1.push(stack2.pop());
			}
		}
		return stack1.pop();
	}
	
	//if stack1 is empty, push into that stack
	//else push every time in stack2
	void enqueue(int data) {
		if(stack1.isEmpty()) {
			stack1.push(data);
		}
		else
			stack2.push(data);
	}
}
