public class Tree{
	public static void main(String[] args){
		Node root = new Node(50);
		Node placeholder = new Node(50000);

		BST test = new BST(root);
		test.insert(placeholder);
		//System.out.println(root.getRight());
		Node bettabeleft = new Node(49999);
		test.insert(bettabeleft);
		System.out.println(placeholder.getLeft());
		System.out.println(bettabeleft);
		System.out.println(placeholder.getRight());
		System.out.println(test.getLength());
		System.out.println(test.search2(root,50));
	}
}