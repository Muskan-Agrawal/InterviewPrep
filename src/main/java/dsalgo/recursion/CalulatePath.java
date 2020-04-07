package dsalgo.recursion;

public class CalulatePath {

	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		System.out.println(calPath(arr, 0, 0));
	}
	public static int calPath(int [][]arr, int row, int coloumn) {
		if(row == arr.length-1 && coloumn == arr[0].length-1)
			return 1;
		
		if(row>arr.length-1 || coloumn > arr[0].length-1)
			return 0;
		
		return calPath(arr, row+1, coloumn)+calPath(arr, row, coloumn+1);
	}

}
