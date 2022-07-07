package dsalgo.tree;

public class BinaryTree {
	
	public static void main(String[] args) {
		
		BinaryTree bt = new BinaryTree();
		
		Node root = new Node(5);
		root.left = new Node(7);
		root.left.right = new Node(2);
		root.left.left = new Node(3);
		root.right = new Node(1);
		root.right.left = new Node(9);
		root.right.left.right = new Node(6);
		
		InorderTraversal inorder = new InorderTraversal();
		System.out.print("Inorder Traversal: ");
		inorder.traverseInorder(root);
		
		System.out.println("\nHeight of the binary tree: "+height(root));
		
		Node root2 = new Node(6);
		System.out.println("\n Is the two tree identical: "+bt.isIdentical(root, root2));
		
		bt.mirrorTree(root);
		System.out.print("\nInorder Traversal of mirror of the tree: ");
		inorder.traverseInorder(root);
		
		System.out.println("\nIs the given BT balances?: "+bt.isBalanced(root));
	}

	static public int height(Node root) {
		if(root == null) 
			return 0;
		return Math.max(height(root.left), height(root.right))+1;
	}
	
	public boolean isIdentical(Node root1, Node root2) {
		if(root1 == null && root2 == null) {
			return true;
		}
		if(root1.value == root2.value) {
			return isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
		}
		return false;
	}
	
	//TODO: correct logic
	public Node mirrorTree(Node root) {
		if(root == null)
			return root;
				
		mirrorTree(root.left);
		mirrorTree(root.right);
		
		BinaryTree.swapNode(root.left, root.right);
		return root;
	}
	
	public boolean isSysmmetric(Node root) {
		BinaryTree bt = new BinaryTree();
		if(bt.isIdentical(root.left, mirrorTree(root.right)))
			return true;
		return false;
	}
	
	public static void swapNode(Node node1, Node node2) {
		Node temp = node1;
		node1 = node2;
		node2 = temp;
	}
	
	public boolean isBalanced(Node root) {
		if(root == null)
			return true;
		int lheight = height(root.left);
		int rheight = height(root.right);
		
		if(Math.abs(lheight - rheight)>1) {
			return false;
		}
		
		return isBalanced(root.left) && isBalanced(root.right);
	}
}
