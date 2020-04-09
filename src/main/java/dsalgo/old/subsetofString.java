//import java.io.*;
package dsalgo.old;
class subsetofString{
	public static void main(String...k){
		 
		String []arr= new String[] {"acb", "as","gohn"};
		String output[]= new String[arr.length];
		subset(arr, 0, output, 0);
	}
	public static void subset(String []arr, int i, String []output, int j){
		if(i==arr.length){
			for(int k=0; k<j; k++){
				System.out.print(output[k]+ '\t');
			}
			System.out.println();
			return;
		}
		output[j]=arr[i];
		subset(arr, i+1, output, j+1);
		subset(arr, i+1, output, j);
	}
}
