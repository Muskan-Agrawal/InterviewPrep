package dsalgo.string;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		LongestCommonPrefix l = new LongestCommonPrefix();
		StringBuilder []strings = new StringBuilder[] {new StringBuilder("guman"), new StringBuilder("gumsum"), new StringBuilder("gum")};
		System.out.println("Longest common prefix: "+l.longestCommonPrefix(strings));
	}
	public StringBuilder longestCommonPrefix(StringBuilder []strings) {
		StringBuilder commonString = new StringBuilder("");
		int stringIndex = 0;
		while(stringIndex < strings[0].length()) {
			int arrIndex = 1;
			while(arrIndex < strings.length) {
				if(strings[arrIndex].charAt(stringIndex) != strings[0].charAt(stringIndex))
					break;
				arrIndex++;
			}
			if(arrIndex != strings.length)
				break;
			else {
				commonString.append(strings[0].charAt(stringIndex));
				stringIndex++;
			}
		}
		return commonString;
	}
}
