package dsalgo.liststackqueue;

import java.util.Stack;

public class ParenthesisMatchStack {
	
	static Stack<Character> par = new Stack<Character>();
	
	public static void main(String[] args) {
		String s = "[abc{de(fgh)}]";
		System.out.println(isParenthesisBalanced(s));
		s = "[a)}]";
		System.out.println(isParenthesisBalanced(s));
		s = "[{()}]";
		System.out.println(isParenthesisBalanced(s));
	}
	
	static boolean isParenthesisBalanced(String s) {
		if(s == null) {
			return false;
		}
		
		Stack<Character> stack = new Stack<Character>();
		int i = 0;
		
		while(s.length() > i) {
			//if opening braces, push into stack
			if(s.charAt(i) == '['
					|| s.charAt(i) == '('
					|| s.charAt(i) == '{') {
				stack.push(s.charAt(i));
			}
			
			//if closing braces, check stack top, if opening brace in top of the stack, okay else return false
			else if(s.charAt(i) == '}') {
				if(stack.peek() != '{')
					return false;
				stack.pop();
			}
			else if(s.charAt(i) == ']') {
				if(stack.peek() != '[')
					return false;
				stack.pop();
			}
			else if(s.charAt(i) == ')') {
				if(stack.peek() != '(')
					return false;
				stack.pop();
			}
			
			i++;
		}
		if(stack.isEmpty())
			return true;
		return false;
	}
}

