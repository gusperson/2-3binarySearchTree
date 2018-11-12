public class 23BST {
	
	protected Node root;


	protected class Node{
		int maxkey;
		int middlekey;
		int minkey;

		Node left;
		Node middle;
		Node right;

		Node(int k, int j, int m, Node l, Node m, Node r){
			minkey = k;
			maxkey = j;
			middlekey = m;
			left = l;
			middle = m;
			right = r;

		}

	}

}