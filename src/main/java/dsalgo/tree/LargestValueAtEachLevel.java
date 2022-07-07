package dsalgo.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LargestValueAtEachLevel {

	public static void main(String[] args) {
		LargestValueAtEachLevel l = new LargestValueAtEachLevel();
		Node root = new Node(5);
		root.left = new Node(7);
		root.left.right = new Node(2);
		root.left.left = new Node(3);
		root.right = new Node(1);
		root.right.left = new Node(9);
		root.right.left.right = new Node(6);
		l.smallestValue(root);
	}

	void smallestValue(Node node) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		queue.add(null);
		while( !queue.isEmpty() ) {
			Node n = queue.remove();
			if(n == null) {
				if(queue.peek() == null) break;
				System.out.println();
				queue.add(null);
				continue;
			}
			System.out.print(n.value+" ");
			if(n.left != null) queue.add(n.left);
			if(n.right != null) queue.add(n.right);
		}
	}
}
