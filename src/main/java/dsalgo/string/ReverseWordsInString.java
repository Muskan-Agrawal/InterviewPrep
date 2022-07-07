package dsalgo.string;

public class ReverseWordsInString {

	public static void main(String[] args) {
		ReverseWordsInString r = new ReverseWordsInString();
		StringBuilder str = new StringBuilder("i.love.me.and.my.sister");
		System.out.println("Reversed with words: "+ r.reverseWord(str));
		str = new StringBuilder("i.");
		System.out.println("Reversed with words: "+ r.reverseWord(str));
		str = new StringBuilder(".me");
		System.out.println("Reversed with words: "+ r.reverseWord(str));
	}
	
	public StringBuilder reverseWord(StringBuilder str) {
		StringBuilder reversedStr = new StringBuilder();
		int i = str.length()-1;
		StringBuilder word = new StringBuilder("");
		
		while(i>=0) {
			if(str.charAt(i) == '.') {
				reversedStr.append(word+".");
				word.delete(0, word.length());
			}
			else
				word.insert(0, str.charAt(i));
			i--;
		}
		reversedStr.append(word);
		return reversedStr;
	}
	
}
