package dsalgo.liststackqueue;



public class QueueUsing2Stack extends StackMine<Integer>{

	public static void main(String[] args) {
		StackMine<Integer> en_stack = new StackMine<Integer>();
		StackMine<Integer> de_stack = new StackMine<Integer>();
		
		QueueUsing2Stack q = new QueueUsing2Stack();
		q.enqueue(en_stack, 5);
		q.enqueue(en_stack, 6);
		q.enqueue(en_stack, 7);
		q.enqueue(en_stack, 8);
		q.display(en_stack, de_stack);
		q.dequeue(en_stack, de_stack);
		q.dequeue(en_stack, de_stack);
		q.display(en_stack, de_stack);
		q.enqueue(en_stack, 9);
		q.enqueue(en_stack, 10);
		q.display(en_stack, de_stack);

	}
	void enqueue(StackMine<Integer> en_stack, int data) {
		en_stack.push(data);
	}
	
	int dequeue(StackMine<Integer> en_stack, StackMine<Integer> de_stack) {
		if( de_stack.isEmpty()) {
			while(! en_stack.isEmpty()) {
				de_stack.push(en_stack.pop());
			}
		}
		return de_stack.pop();	
	}
	void display() {
		if(top == null) {
			System.out.println("-");
			return;
			
		}
		
		Node current = top;
		while(current != null) {
			System.out.print(current.data+"\t");
			current = current.next;
		}
	}
	void display(StackMine<Integer> en_stack, StackMine<Integer> de_stack) {
		System.out.println("Stack: ");
		en_stack.display();
		de_stack.display();
		
	}
}
