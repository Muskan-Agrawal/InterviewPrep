package dsalgo.tree;


import dsalgo.tree.BinarySearchTree.Node;
import java.util.*;
public class PreorderTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(root,  0);
		bst.insert(root,  8);
		bst.insert(root,  23);
		bst.insert(root, 1);
		bst.insert(root,  5);
		bst.insert(root,  27);
		bst.insert(root,  -7);
		bst.insert(root,  11);
		
		System.out.print("\nPreorder Traversing: ");
		preorder(root);
	}
	public static void preorder(Node node) {
		Stack<Node> stack = new Stack<Node>();
		stack.push(node);
		
		while(! stack.isEmpty()) {
			Node cur = stack.pop();
			System.out.print(cur.value+" ");
			
			if(cur.right != null)
				stack.push(cur.right);
			
			if(cur.left != null)
				stack.push(cur.left);
			
		}
	}

}
