package dsalgo.tree;

import dsalgo.tree.BinarySearchTree.Node;
import java.util.*;
public class PostorderTraversal {

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
		
		System.out.print("\nPostorder: ");
		postorder(root);
		
	}
	public static void postorder(Node node) {
		Stack<Node> temp = new Stack<Node>();
		Stack<Node> res = new Stack<Node>();
		Node cur = node;
		temp.push(node);
		
		while(!temp.isEmpty()) {
			cur = temp.pop();
			res.push(cur);
			if(cur.left != null)
				temp.push(cur.left);
			if(cur.right != null)
				temp.push(cur.right);
			
			
				
			
		}
		while(!res.isEmpty()) {
			System.out.print(res.pop().value + " ");
		}
	}

}
