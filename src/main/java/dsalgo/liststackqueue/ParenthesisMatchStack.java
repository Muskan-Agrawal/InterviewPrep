package dsalgo.liststackqueue;

import dsalgo.liststackqueue.StackMine;

public class ParenthesisMatchStack {
	static StackMine par = new StackMine();
	public static void main(String[] args) {
		String s = "[abc{de(fgh)}]";
		System.out.println(parenthesis(s));
	}
	static boolean parenthesis(String s) {
		if(s.length() <= 0) {
			return true;
		}
		
		if(s.charAt(0) == '(' || s.charAt(0) == '{' || s.charAt(0) == '[') {
			par.push(s.charAt(0));
			return parenthesis(s.substring(1));
		}
		//()
		if(s.charAt(0) == ')') {
			if(par.pop() == '(') {
				return parenthesis(s.substring(1));
			}
			else
				return false;
		}
		//{}
		else if(s.charAt(0) == '}') {
			if(par.pop() == '{') {
				return parenthesis(s.substring(1));
			}
			else
				return false;
		}
		//[]
		else if(s.charAt(0) == ']') {
			if(par.pop() == '[') {
				return parenthesis(s.substring(1));
			}
			else
				return false;
		}
		
		
		return parenthesis(s.substring(1));
	}
}

