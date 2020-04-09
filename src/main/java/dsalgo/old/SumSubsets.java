package dsalgo.old;
class SumSubsets{
	public static void main(String...k){
		int []arr = new int[]{1,2,3,5,6};   
		int output[] = new int[arr.length];
		
		SumSubsets s= new SumSubsets();

		s.subset(arr, 0, output, 0, 6, 0);
	}
	public void subset(int arr[], int i, int output[], int j, int key, int sum){
		if(i == arr.length-1 && key==sum){       
			                                                        
			for(int k=0; k<j; k++){
				System.out.print(output[k]+"\t");
			}
			System.out.println();
			
			return ; 
		}
		//inclusive
		if(sum<key){
			output[j]=arr[i];
		 subset(arr, i+1, output, j+1, key, sum+output[j]);
		}
        //exclusive
			subset(arr, i+1, output, j, key, sum);
	}
}