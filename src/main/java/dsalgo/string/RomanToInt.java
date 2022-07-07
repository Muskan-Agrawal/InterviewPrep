package dsalgo.string;

public class RomanToInt {

	public static void main(String[] args) {
		RomanToInt r = new RomanToInt();
		String str = "MCDLXIV";
		System.out.println(str+" to number: "+r.romanToInt(str));
		str = "MMXXII";
		System.out.println(str+" to number: "+r.romanToInt(str));
//		str = "";
//		System.out.println(str+" to number: "+r.romanToInt(str));
//		str = "ASD";
//		System.out.println(str+" to number: "+r.romanToInt(str));
		
		int num = 120;
		System.out.println(num+" to roman: "+r.intToRoman(num));
		num = 2022;
		System.out.println(num+" to roman: "+r.intToRoman(num));

	}

	public int romanToInt(String str) {
		if(str == "" || str == null) {
			System.out.println("No number provided");
			return -1;
		}
		int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
		String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};  
		int num=0;
		// i-for romanLetters | j for str iteration
		int i=0, j=0;
		while(i<values.length && str.length()>j) {
			if(str.substring(j,j+1).equals(romanLetters[i])) {
				num += values[i];
				j++;
				continue;
			}
			else if(str.substring(j,j+2).equals(romanLetters[i])) {
				num += values[i];
				j += 2;
				continue;
			}
			i++;
		}
		if(num ==0) {
			System.out.println("Invalid number provided");
			return -1;
		}
		return num;
	}
	
	public StringBuilder intToRoman(int num) {
		
		if(num == 0) return null;
		if(num<0) {
			System.out.println("Negative number");
			return null;
		}
		
		StringBuilder roman = new StringBuilder("");
		int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
		String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		
		int i=0;
		while(i<values.length && num != 0) {
			if(values[i]<=num) {
				roman.append(romanLetters[i]);
				num -= values[i];
			}
			else i++;
		}
		return roman;
	}
}
