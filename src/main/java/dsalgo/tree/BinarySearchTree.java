package dsalgo.tree;



public class BinarySearchTree {
	static class Node{
		int value;
		Node left;
		Node right;
		Node(int data){
			value = data;
			left = null;
			right = null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
	}
	 public void insert(Node node, int data) {
	       if(data > node.value) {
	    	   if(node.right != null) {
	    		   insert(node.right, data);
	    	   }
	    	   else {
	    		   System.out.println("Inserted value: "+data);
	    		   node.right = new Node(data);
	    	   }
	    	   
	       }
	       else {
	    	   if(node.left != null) {
	    		   insert(node.left, data);
	    	   }
	    	   else {
	    		   System.out.println("Inserted value: "+data);
	    		   node.left = new Node(data);
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
}

