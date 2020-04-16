package dsalgo.recursion;


public class PermOddValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int [] {1,2,3,4,5};
		permutation(arr, 0, 3);
	}
	static void permutation(int []arr, int i, int number) {
		if(i== arr.length) {
			for(int k=0; k<arr.length; k++)
				System.out.print(arr[k]+"\t");
			System.out.println();
		}
		for(int j=i ; j<arr.length; j++) {
			
			if( i<number && arr[j] % 2 ==0) {
				continue;
			}
			swap(arr, i, j);
			permutation(arr, i+1, number);
			swap(arr, i, j);
			
		}
	}
	static void swap(int []arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}