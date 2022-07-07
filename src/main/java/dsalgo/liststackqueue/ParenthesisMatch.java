package dsalgo.liststackqueue;

public class ParenthesisMatch {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("[abc{de(fgh)}]");
		System.out.println(parenthesis(s, 0, s.length()-1));
		s = new StringBuilder("[{()}]");
		System.out.println(parenthesis(s, 0, s.length()-1));
		s = new StringBuilder("[)}]");
		System.out.println(parenthesis(s, 0, s.length()-1));
	}
	static boolean parenthesis(StringBuilder s, int start, int end) {
		if(start >= end) {
			return true;
		}
		
		while(s.charAt(start) >=97 && s.charAt(start) <= 122 ) {
			start++;
		}
		while(s.charAt(end) >= 97 && s.charAt(end) <= 122 ) { 
			end--; 
		} 
		
		if(start >= end ) {
			if(s.charAt(start) == '[' || s.charAt(start) == '{' || s.charAt(start) =='(' 
					|| s.charAt(start) ==')' || s.charAt(start) == '}' || s.charAt(start) == ']' 
					||s.charAt(end) == '[' || s.charAt(end) == '{' || s.charAt(end) =='(' 
					|| s.charAt(end) ==')' || s.charAt(end) == '}' || s.charAt(end) == ']') {
				return false;
			}
			else
				return true;
		}
			
		if((s.charAt(start) == '[' && s.charAt(end) == ']') 
				|| (s.charAt(start) == '{' && s.charAt(end) == '}') 
				|| (s.charAt(start) == '(' && s.charAt(end) == ')')) {
			
			return parenthesis(s, start+1, end-1);
		}
		else 
			return false;
	}
}
