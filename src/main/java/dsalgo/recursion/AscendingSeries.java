//subsequence is a array when some elements are deleted from it
//eg-{1,2,3,4,5}...... {1,3,5}, {4,5} is subsequence

package dsalgo.recursion;

public class AscendingSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {2,4,10,5,50};
		int op[]=new int[arr.length];
		ascendingseries(arr, 0, op, 0);
	}
	static void ascendingseries(int []arr, int arr_index, int []op, int op_index) {
		if(arr_index == arr.length){    
			int k=0;
			for( k=0; k<op_index && k+1<op.length; k++){
				System.out.print(op[k]+"\t");
			}
			System.out.println();
			
			return ; 
		}
	
		if(op_index==0 || op[op_index-1]<arr[arr_index]) {
			op[op_index]=arr[arr_index];
			ascendingseries(arr, arr_index+1, op, op_index+1);
		}
		ascendingseries(arr, arr_index+1, op, op_index);
	}

}
