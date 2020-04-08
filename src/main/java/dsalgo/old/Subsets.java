
class Subsets{
	public static void main(String...k){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int size = sc.nextInt();
		int []arr = new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}   
		int output[] = new int[size];
		Subsets s= new Subsets();
		s.subset(arr, 0, output, 0 );
	}
	public void subset(int arr[], int i, int output[], int j){
		if(i == arr.length){                                                               
			for(int k=0; k<j; k++){
				//if(output[k] != 0)
				System.out.print(output[k]);
				
			}
			System.out.println("");
			//output=null;
			//if(j>0)
			//	output[j-1]=0;
			return ; 
		}

		

		//inclusive
		output[j]=arr[i];
		subset(arr, i+1, output, j+1);

        //exclusive
		subset(arr, i+1, output, j);
		
	}

 
}