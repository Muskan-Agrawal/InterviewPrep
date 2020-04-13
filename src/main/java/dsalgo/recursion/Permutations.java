package dsalgo.recursion;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int [] {1,2,3};
		permutation(arr, 0);
	}
	static void permutation(int []arr, int i) {
		if(i== arr.length) {
			for(int k=0; k<arr.length; k++)
				System.out.print(arr[k]+"\t");
			System.out.println();
		}
			
		for(int j=i; j<arr.length; j++) {
			swap(arr, i, j);
			System.out.println(i);
			System.out.println(j);
			permutation(arr, i+1);
			swap(arr, i, j);
		}
	}
	static void swap(int []arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
