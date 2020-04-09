package dsalgo.recursion;

public class FindDictionaryPath {
	public static void main(String...k) {
		char arr[][] = new char[][] {
			{'m','u','e'},
			{'k','s','t'},
			{'a','k','e'},
			{'t','a','n'}};
		System.out.println("found?: "+findWord(arr, 0, 0, "muskan", ""));
	}
	static boolean findWord(char [][]arr, int row, int col, String s, String result) {
		//base condition
		int m=arr.length-1;
		int n=arr[0].length-1;
		if(row == m && col == n) {
			result= result+arr[m][n];
			System.out.println(result);
			if(result.contentEquals(s))
				return true;
			else
				return false;
			
		}
		//boundary condition
		if(row>arr.length-1 || col>arr[0].length-1)
			return false;
		
		result=result+arr[row][col];
		return findWord(arr, row+1, col, s, result) || findWord(arr, row, col+1, s, result);
	}
}
