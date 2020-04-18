package dsalgo.recursion;

public class NQueen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr=new int[4][4];
		int res[]=new int[4];
		isNQueenPossible(0, arr, res);
	}
	static void isNQueenPossible(int i, int [][]arr, int res[]) {
		if(i == arr.length) {
			System.out.println("possible");
			return;
		}
			
		
		
		for(int j=i; j<arr.length; j++) {
			arr[i][j]=1;
			if(isSafe(res)) {
				System.out.println("yes");
				res[i]=j;
				isNQueenPossible(i+1, arr, res);
			}
			//backtrack
			else {
				arr[i][j]=0;
			}
		}
		
		
		//return false;
	}
	
	static boolean isSafe(int res[]) {
		int i=0;
		for(i=0;i<res.length-1; i++) {
			if(res[i]!=0 && res[i] == res[i+1]+1 || res[i]+1 == res[i+1]) {
				break;
			}
			
		}
		if(i==res.length)
			return true;
		else
			return false;
		
	}

}

