//Implement three stacks using one array

package dsalgo.stack;

public class ThreeInOne {

	public static void main(String[] args) {
		KStack stack = new KStack(10);
		stack.push(1, 2);
		stack.push(1, 3);
		stack.push(1, 4);
		
		stack.push(2, 7);
		stack.push(2, 71);
		stack.push(2, 72);
		stack.push(2, 73);

		stack.push(3, 8);
		stack.push(3, 9);
		stack.push(3, 8);
		stack.push(3, 9);
		
		stack.printArray();
		System.out.println("\nStack1 pop:"+stack.pop(1));
		System.out.println("Stack1 pop:"+stack.pop(1));
		System.out.println("Stack2 pop:"+stack.pop(2));
		System.out.println("Stack3 pop:"+stack.pop(3));
		stack.printArray();
		
	}

}

class KStack {
	int top1, top2, top3;
	int start1,start2,start3;
	int arr[];
	
	
	//initialize the top pointers(here indexes) and mention start index for each stack in the array
	public KStack(int n) {
		this.arr = new int[n];
		this.top1 = -1;
		this.top2 = -1;
		this.top3 = -1;
		start1 = 0;
		start2 = arr.length/2;
		start3 = arr.length - 1;
	}
	
	//check if the stack is empty
	public boolean isEmpty(int k) {
		if( (k==1 && top1 == -1)
				|| (k==2 && top2 == -1)
				|| (k==3 && top3 == -1)) {
			return true;
		}
		return false;
	}
	
	//push the value into given stack
	void push(int k, int val) {
		if(!(k>0 && k<4)) {
			System.err.print("Wrong stack!!");
			return;
		}
		
		//if the stack is empty, start with pushing the first element
		if(this.isEmpty(k)) {
			if(k==1) {
				top1 = start1;
				this.arr[top1] = val;
			}
			if(k==2) {
				top2 = start2;
				this.arr[this.top2] = val;
			}
			if(k==3) {
				top3 = start3;
				this.arr[this.top3] = val;
			}
		}
		
		//else increment/decrement the top pointer of provided stack and insert the value
		else {
			//if any stack if full, return the value with error message saying stack full : TODO
			if((k == 1 || k == 2 && top1>=Math.max(top2, start2))
					|| (k == 3 && top3<=start2)) {
				System.err.print("\nLength exceeded");
				return;
			}
			if(k==1) {
				this.top1++;
				this.arr[this.top1] = val;
			}
			if(k==2) {
				this.top2--;
				this.arr[this.top2] = val;
			}
			if(k==3) {
				this.top3--;
				this.arr[this.top3] = val;
			}
		}
	}
	
	//popping the element of the given stack
	int pop(int k) {
		if(!(k>0 && k<4)) {
			System.err.print("Wrong stack!!");
			return -1;
		}
		
		if(this.isEmpty(k)) {
			System.err.print("Stack Empty!");
			return -1;
		}
		
		int val = 0;
		if(k==1) {
			val = arr[top1];
			arr[top1--] = 0;
		}
		else if(k==2) {
			val = arr[top2];
			arr[top2++] = 0;
		}
		else {
			val = arr[top3];
			arr[top3++] = 0;
		}
		return val;
	}
	
	void printArray() {
		System.out.print("\nArray: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
