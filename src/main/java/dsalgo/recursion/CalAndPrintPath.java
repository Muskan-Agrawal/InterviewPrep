package dsalgo.recursion;

public class CalAndPrintPath {
	static int count=0;
	public static void main(String[] args) {
		int arr[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int arr1[]=new int[arr.length+arr[0].length-1];
		calPath(arr, 0, 0, arr1,0, 0);
		System.out.println("No. of ways:"+count);
	}
	public static int calPath(int [][]arr, int row, int coloumn, int result[], int res_index, int sum) {
		//base condition
		if(row == arr.length-1 && coloumn == arr[0].length-1) {
			result[res_index]=arr[row][coloumn];
			for(int i=0;i<result.length;i++) {
				System.out.print(result[i]+"--->");
			}
			System.out.print("    Sum= "+sum);
			System.out.println();
			count++;
			return count;
		}
		
		//boundary condition
		if(row>arr.length-1 || coloumn >arr[0].length-1) {
			return 0;
		}
		
		result[res_index]=arr[row][coloumn];
		calPath(arr, row+1, coloumn, result, res_index+1, sum+arr[row][coloumn]);
		calPath(arr, row, coloumn+1, result, res_index+1, sum+arr[row][coloumn]);
		
		
		return count;
	}

}
