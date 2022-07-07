package dsalgo.tree;

public class ArrayToBST {

	public static void main(String[] args) {
		ArrayToBST a = new ArrayToBST();
		int arr[] = new int[] {1,2,3,4,5,6,7};
		Node root = new Node();
		root = a.arrayToBST(arr);
		InorderTraversal in = new InorderTraversal();
		in.traverseInorder(root);
		
		root = a.sortedArrayToBST(arr, 0, arr.length-1);
		System.out.print("\n Inorder traversal of BST: ");
		in.traverseInorder(root);
	}

	//TODO correct logic
	Node arrayToBST(int []arr) {
		if(arr.length == 0)
			return null;
		
		Node root = new Node(arr[0]);
		int i=1;
		boolean isPlaced = false;
		Node temp = root;
		while(i<arr.length) {
			temp = root;
			isPlaced = false;
			Node newNode = new Node(arr[i]);
			while( !isPlaced ) {
				if(temp == null) {
					temp = newNode;
					isPlaced = true;
				}
				else if(newNode.value < temp.value) {
					temp = temp.left;
				}
				else {
					temp = temp.right;
				}
			}
			i++;
		}
		InorderTraversal in = new InorderTraversal();
		in.traverseInorder(temp);
		return root;
	}
	
	Node sortedArrayToBST(int []arr, int start, int end) {
		if(start>end)
			return null;
		
		int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);
 
        /* Recursively construct the left subtree and make it
         left child of root */
        node.left = sortedArrayToBST(arr, start, mid - 1);
 
        /* Recursively construct the right subtree and make it
         right child of root */
        node.right = sortedArrayToBST(arr, mid + 1, end);
         
        return node;
	}
}
