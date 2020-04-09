package dsalgo.old;
class subsetOfChatacter{
	public static void main(String...k) {
		char []arr= new char[] {'a','b','c'};
		
		char []output = new char[arr.length];
		subset(arr, 0, output, 0);
	}
	public static void subset(char arr[], int i, char []output, int j){
		if(i == arr.length){
			for(int k=0; k<j; k++){
				if(arr[k] != '0')
				System.out.print(output[k]+"\t");
			}
			System.out.println();
			return;
		}
		output[j]=arr[i];
		subset(arr, i+1, output, j+1);
		subset(arr, i+1, output, j);
	}
}