public class Tree{
	public static void main(String[] args){
		Node root = new Node(50);
		Node placeholder = new Node(50000);

		BST test = new BST(root);
		test.insert(placeholder);
		//System.out.println(root.getRight());
		Node bettabeleft = new Node(49999);
		System.out.println(test.delete(50));
	}
}y