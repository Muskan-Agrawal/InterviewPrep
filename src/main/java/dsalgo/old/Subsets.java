package dsalgo.old;
class Subsets{
	public static void main(String...k){
		
		int []arr = new int[] {1,2,3};
		 
		int output[] = new int[arr.length];
		Subsets s= new Subsets();
		s.subset(arr, 0, output, 0 );
	}
	public void subset(int arr[], int i, int output[], int j){
		if(i == arr.length){                                                               
			for(int k=0; k<j; k++){
				System.out.print(output[k]+"\t");
			}
			System.out.println("");
			
			return ; 
		}

		

		//inclusive
		output[j]=arr[i];
		subset(arr, i+1, output, j+1);

        //exclusive
		subset(arr, i+1, output, j);
		
	}

 
}