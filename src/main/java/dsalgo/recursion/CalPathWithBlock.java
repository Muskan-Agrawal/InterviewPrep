package dsalgo.recursion;

public class CalPathWithBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[4][4];
		//arr[1][1]=1;
		arr[0][2]=1;
		arr[2][1]=1;
		System.out.println(calPath(arr, 0, 0));
	}
	public static int calPath(int [][]arr, int row, int coloumn) {
		
		if(row > arr.length-1 || coloumn > arr[0].length-1 ) {
			return 0;
		}
		if(arr[row][coloumn] == 1)
			return 0;
		
		//base condition
		if(row==arr.length-1 && coloumn==arr[0].length-1) {
			return 1;
		}
		
		//boundary condition
		
			
		return calPath(arr, row+1, coloumn)+calPath(arr, row, coloumn+1);
	}

}
