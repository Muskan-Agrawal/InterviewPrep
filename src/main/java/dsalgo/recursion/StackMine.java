package dsalgo.recursion;

public class StackMine {
	int top=-1;
	int arr[];
	int size=10;
	public static void main(String[] args) {
		StackMine stack = new StackMine();
		stack.push(5);
		stack.push(10);
		stack.push(15);
		stack.push(20);
		stack.push(25);
		stack.display();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.display();
	}
	StackMine(){
		arr = new int[size];
		
	}
	void push(int data) {
		if(top == size-1) {
			System.out.println("overflow dear.. please manage on yourself");
			return;
		}
		arr[++top]=data;
		
	}
	void pop() {
		if(top <= 0) {
			System.out.println("underflow..!!");
			return;
		}
		System.out.println("Removed elemnt: "+arr[top]);
		arr[top]=0;
		top--;
	}
	void display() {
		if(top == -1) {
			System.out.println("Stack Empty! ");
			return;
		}
		System.out.println("Stack: ");
		int i=0;
		while(i != top+1) {
			System.out.print(arr[i]+"\t");
			i++;
		}
		System.out.println();
	}

}
