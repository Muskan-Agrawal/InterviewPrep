import java.io.*;

class subsetofString{
	public static void main(String...k){
		java.util.Scanner sc= new java.util.Scanner(System.in);
		int size= sc.nextInt();
		//OutputStream os = new FileOutputStream("test.txt"); 
		String []arr= new String[size];
		
		System.out.println(arr.length);
		//os.flush();
		sc.nextLine();
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextLine();
		}
		for(int i=0; i<arr.length; i++){
			System.out.println(".."+arr[i]+"..");
		}
		String output[]= new String[size];
		subset(arr, 0, output, 0);
	}
	public static void subset(String []arr, int i, String []output, int j){
		if(i==arr.length){
			for(int k=0; k<output.length; k++){
				if(output[k] != "null")
					System.out.print(output[k]+ '\t');
			}
			System.out.println("");
			if(j>0)
			output[j-1]="null";
			return;
		}
		output[j]=arr[i];
		subset(arr, i+1, output, j+1);
		subset(arr, i+1, output, j);
	}
}
