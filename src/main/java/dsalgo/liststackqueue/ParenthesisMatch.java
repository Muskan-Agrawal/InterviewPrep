package dsalgo.liststackqueue;

public class ParenthesisMatch {

	public static void main(String[] args) {
		String s = "[abc{de(fgh)}]";
		System.out.println(parenthesis(s, 0, s.length()-1));
	}
	static boolean parenthesis(String s, int start, int end) {
		if(start >= end) {
			return true;
		}
		
		while(s.charAt(start) >=97 && s.charAt(start) <= 122 ) {
			System.out.print("while 1"+s.charAt(start)+'\t');
			start++;
		}
		while(s.charAt(end) >= 97 && s.charAt(end) <= 122 ) { 
			System.out.print("while 2"+s.charAt(end)+'\t'); 
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
			
		System.out.println(s.substring(start, end)+start+end);
		if((s.charAt(start) == '[' && s.charAt(end) == ']') 
				|| (s.charAt(start) == '{' && s.charAt(end) == '}') 
				|| (s.charAt(start) == '(' && s.charAt(end) == ')')) {
			
			return parenthesis(s, start+1, end-1);
		}
		else 
			return false;
	}
}
