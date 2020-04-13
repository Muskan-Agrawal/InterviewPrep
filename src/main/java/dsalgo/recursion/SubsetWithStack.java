package dsalgo.recursion;

import java.util.Stack;

class SubsetWithStack{
	public static void main(String...k){
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		 
		Stack<Integer> op = new Stack<Integer>();
		SubsetWithStack s= new SubsetWithStack();
		s.subset(stack, op);
	}
	public void subset(Stack<Integer> stack, Stack<Integer> output){
		if(stack.size() == output.size())
		{                                                              
			for(int k=0; k<output.size(); k++){
				System.out.print(output.peek()+"\t");
			}
			System.out.println("");
			
			return ; 
		}

		

		//inclusive
		output.push(stack.pop());
		subset(stack, output);

		//exclusive
        output.pop();
		subset(stack, output);
		
	}

 
}

