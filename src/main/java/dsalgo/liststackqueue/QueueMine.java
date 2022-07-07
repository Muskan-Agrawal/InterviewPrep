package dsalgo.liststackqueue;

public class QueueMine {
	Node first = null;
	Node last = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueMine queue = new QueueMine();
		
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.display();
		queue.enqueue(8);
		queue.enqueue(9);
		queue.display();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.display();

	}
	void enqueue(int data) {
		Node newnode = new Node(data);
		if(first == null && last == null) {
			first = newnode;
			last = newnode;
			return;
		}
		
		
		last.next = newnode;
		last=newnode;
	}
	void display() {
		if(first == null && last == null) {
			System.out.println("Queue empty");
		}
		System.out.println("Queue: ");
		Node current = first;
		while(current != last.next) {
			System.out.print("\t"+current.data);
			current = current.next;
		}
		System.out.println();
	}
	
	int dequeue() {
		if(first == null && last == null) {
			System.out.println("Empty queue!!");
			return 0;
		}
		int data = first.data;
		first = first.next;
		return data;
	}
}
