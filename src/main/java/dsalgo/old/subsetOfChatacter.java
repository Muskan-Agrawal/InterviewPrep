class subsetOfChatacter{
	public static void main(String...k){
		java.util.Scanner sc= new java.util.Scanner(System.in);
		int size=sc.nextInt();
		char []arr= new char[size];
		String inp=sc.next();
		for(int i=0; i<size; i++){
			arr[i]=inp.charAt(i);
		}
		char []output = new char[size];
		subset(arr, 0, output, 0);
	}
	public static void subset(char arr[], int i, char []output, int j){
		if(i == arr.length){
			for(int k=0; k<output.length; k++){
				if(arr[k] != '0')
				System.out.print(output[k]+"\t");
			}
			System.out.println("-----------------");
			return;
		}
		output[j]=arr[i];
		subset(arr, i+1, output, j+1);
		output[j]='0';
		subset(arr, i+1, output, j);
	}
}