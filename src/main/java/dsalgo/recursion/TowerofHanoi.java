package dsalgo.recursion;

public class TowerofHanoi {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		towerOfHanoi(5);
		System.out.println(count);
		
	}
	static void towerOfHanoi(int n) {
		if(n==1) {
			count++;
			return;
		}
		count++;
		//move n-1 disk from source to temporary
		towerOfHanoi(n-1);
		//move nth disk to destination
		//move n-1 disks from temporary to destination
		towerOfHanoi(n-1);
	}

}
