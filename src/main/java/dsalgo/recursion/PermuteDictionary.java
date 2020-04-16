package dsalgo.recursion;


public class PermuteDictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int [] {'a','c','t'};
		String dict[]= {"act", "cat","rat"};
		permutation(arr, dict,0, 3);
	}
	static void permutation(int []arr, String []dic, int i, int number) {
		if(i== arr.length) {
			for(int k=0; k<arr.length; k++)
				System.out.print((char)arr[k]);
			System.out.println();
		}
		for(int j=i ; j<arr.length; j++) {
			int flag=0;
			for(int x=0; x<dic.length; x++) {
				flag=0;
				if(arr[i] == dic[x].charAt(i)) {
					flag=1;
					break;
				}
				
			}
			if(flag == 0)
				break;
			swap(arr, i, j);
			permutation(arr, dic, i+1, number);
			swap(arr, i, j);
			
		}
	}
	static void swap(int []arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
