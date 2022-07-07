package dsalgo.tree;

public class BinarySearchTree {
	
	public static void main(String[] args) {
		
		Node root = new Node(10);
		System.out.println("Root value: 10");
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(root, 5);
		bst.insert(root,  12);
		bst.insert(root, 7);
		bst.insert(root,  19);
		
		System.out.print("\nInorder Traversing: ");
		bst.InorderTraverse(root);
		
		System.out.print("\nPreorder Traversing: ");
		bst.PreorderTraverse(root); 
		
		System.out.print("\nPostorder Traversing: ");
		bst.PostorderTraverse(root); 
		
		System.out.println("\nHeight of the tree: "+bst.maxHeight(root));
	}
	
	public void insert(Node root, int data) {
		if(data > root.value) {
			if(root.right != null) {
			   insert(root.right, data);
			}
			else {
				System.out.println("Inserted value: "+data);
				root.right = new Node(data);
			}   
		}
		else {
			if(root.left != null) {
				insert(root.left, data);
			}	
		   	else {
		   		System.out.println("Inserted value: "+data);
		   		root.left = new Node(data);
		   	}
		}
	}
	
	public void InorderTraverse(Node node) {
		if(node == null)
			return;
		InorderTraverse(node.left);
		System.out.print(node.value+" ");
		InorderTraverse(node.right);
	}
 
	public void PreorderTraverse(Node node) {
		if(node == null)
			return;
		System.out.print(node.value+" ");
		InorderTraverse(node.left);
		InorderTraverse(node.right);
	}
	 
	public void PostorderTraverse(Node node) {
		if(node == null)
			return;
		 
		InorderTraverse(node.left);
		InorderTraverse(node.right);
		System.out.print(node.value+" ");
	 }
	
	public int maxHeight(Node node) {
		if(node == null)
			return 0;
		return Math.max(maxHeight(node.left), maxHeight(node.right))+1;
	}
}

