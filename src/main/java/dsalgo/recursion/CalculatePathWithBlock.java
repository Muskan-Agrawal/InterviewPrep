package dsalgo.recursion;

public class CalculatePathWithBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[3][3];
		arr[0][2]=1;
		arr[1][2]=1;
		arr[1][2]=1;
		System.out.println(calpath(arr, 0, 0));
	}
	public static int calpath(int arr[][], int row, int coloumn) {
		if(row == arr.length-1 && coloumn == arr[0].length-1)
			return 1;
		if(row>arr.length-1 || coloumn>arr[0].length-1)
			return 0;
		if(arr[row][coloumn] == 1)
			return 0;
		
		return calpath(arr, row+1, coloumn)+calpath(arr, row, coloumn+1);
	}

}
