package dsalgo.recursion;

public class Palindrome {
	public static void main(String...k) {
		System.out.println(ispalindrome("hello",0,"hello".length()-1));
		System.out.println(ispalindrome("racecar",0,"racecar".length()-1));
		
	}
	public static boolean ispalindrome(String s, int left_index, int right_index) {
		if(left_index == right_index || left_index == right_index-1)
			return true;
		if(s.charAt(left_index) != s.charAt(right_index))
			return false;
		return ispalindrome(s,left_index+1, right_index-1);
	}
}
