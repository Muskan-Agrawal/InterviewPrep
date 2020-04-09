package dsalgo.recursion;

public class CalculatePathLength {
	static int max=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[4][4];
		calpath(arr, 0, 0, 0);
		System.out.println("\n"+(max+arr[3][3]));
		
	}
	static int calpath(int arr[][], int row, int col, int value) {
		if(row == arr.length-1 && col == arr[0].length-1) {
			if(max>value)
				max=value;
			System.out.print((arr[row][col]+value)+" ");
			return 1;
		}
		if(row> arr.length-1 || col> arr[0].length-1)
			return 0;
		
		return calpath(arr, row+1, col, value+1)+ calpath(arr, row, col+1, value+1);
	}

}
