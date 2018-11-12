public class 23BST {
	
	protected Node root;


	protected class Node{
		int key1;
		int key2;
		int key3;  //extra storage when moving keys around
		int amountofkeys;

		Node left;
		Node middle;
		Node right;

		Node(int k, int j, int m, Node l, Node m, Node r){
			key1 = k;
			key2 = j;
			key3 = m;
			left = l;
			middle = m;
			right = r;

		}



	}

}