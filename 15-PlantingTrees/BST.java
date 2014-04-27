public class BST{

	private Node root;
	private int length = 1;
	private Node myLazySearchFunction;

	public BST(){
		root = null;
	}

	public BST(Node givRoot){
		root = givRoot;
	}

	public int getLength(){
		return length;
	}

	public void insert(Node given){ //search function is embedded in here
		length++;
		String retVar = "";
		Node curNode = root;
		while (!curNode.isLeaf()){
			if (curNode.getData() > given.getData()){
				curNode = curNode.getLeft();
			}
			else{
				curNode = curNode.getRight();
			}
		}
		if (curNode.getData() > given.getData()){ //curnode might be dropped out of existance
			curNode.setLeft(given);
		}
		else{
			curNode.setRight(given);
		}
		myLazySearchFunction = curNode;
	}

	public Node search2(Node c, int x){
		if (c.getData() == x){
			return c;
		}
		else{
			if (c.getData() > x){
				search2(c.getLeft(),x);
			}
			else{
				search2(c.getRight(),x);
			}
		}
		return null;		
	}

}