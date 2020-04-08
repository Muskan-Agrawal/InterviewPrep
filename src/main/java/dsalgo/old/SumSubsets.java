
class SumSubsets{
	public static void main(String...k){
		//java.util.Scanner sc = new java.util.Scanner(System.in);
		//System.out.println("Enter number of elelmts:");
		//int size = sc.nextInt();
		int []arr = new int[]{1,2,3,5,6};
		//System.out.println("Enter the values");
		//for(int i=0;i<size;i++){
	//		arr[i]=sc.nextInt();
	//	}   
		int output[] = new int[arr.length];
		//System.out.println("Enter the required sum: ");
		
		SumSubsets s= new SumSubsets();

		s.subset(arr, 0, output, 0 ,6 , 0);
	}
	public void subset(int arr[], int i, int output[], int j, int key, int sum){
		if(i == arr.length && key==sum){       
			//int sum=0;                                                        
			for(int k=0; k<j; k++){
				System.out.print(output[k]);
				//sum+=output[k];
			}
			System.out.println();
			//output=null;
			/*if(sum==key){
				for(int k=0; k<output.length; k++){
					//if(output[k] != 0)
					System.out.print(output[k]+"\t");
				}
				System.out.println("");
			}
			*/
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