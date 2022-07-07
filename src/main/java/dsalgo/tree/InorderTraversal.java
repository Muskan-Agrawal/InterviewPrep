package dsalgo.tree;

import java.util.*;
public class InorderTraversal {

	public static void main(String[] args) {
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
		
		InorderTraversal inorder = new InorderTraversal();
		System.out.print("\nInorder Traversal: ");
		inorder.traverseInorder(root);
	}
	
	public void traverseInorder(Node node) {
		Stack<Node> stack = new Stack<Node>();
		//stack.push(node);
		Node cur = node;
		while(cur != null || stack.size()>0) {
			while(cur != null) {
				stack.push(cur);
				cur = cur.left;
			}
			
			cur = stack.pop();
			System.out.print(cur.value+" ");
			cur = cur.right;
		}
	}
}
