package dsalgo.recursion;

public class CalculateShortestPath {
	static int count=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[][] {{1,2,6,13},{10,3,7,12},{1,4,7,11},{1,5,9,10}};
		
		System.out.println("Path with maximum weight= "+calpath(arr, 0, 0, 0));
		
	}
	static int calpath(int arr[][], int row, int col, int value) {
		if(row == arr.length-1 && col == arr[0].length-1) {
			System.out.println("Path"+count+" = "+(value+arr[row][col]));
			count++;
			return value+arr[row][col];
		}
		if(row> arr.length-1 || col> arr[0].length-1)
			return 0;
		
		return Math.max(calpath(arr, row+1, col, value+arr[row][col]), calpath(arr, row, col+1, value+arr[row][col])); 
		
	}

}
