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
				return search2(c.getLeft(),x);
			}
			else{
				return search2(c.getRight(),x);
			}
		}	
	}

	public Node search(int x){
		return search2(root,x);
	}

	public Node delete(int x){
		Node rmNode = search(x);
		if (rmNode.isLeaf()){
			if (rmNode.getParent().getData() > rmNode.getData()){
				rmNode.getParent().setLeft(null);
			}
			if (rmNode.getParent().getData() < rmNode.getData()){
				rmNode.getParent().setRight(null);
			}
		}

		if (!(rmNode.isLeaf() && rmNode.isFull())){
			if (rmNode.getData() < rmNode.getParent().getData()){
				rmNode.getParent().getParent().setLeft(rmNode.getLeft());
			}
			if (rmNode.getData() > rmNode.getParent().getData()){
				rmNode.getParent().getParent().setRight();
			}
		}

		if (rmNode.isFull()){
			rmNode.getParent().setLeft(rmNode.getLeft());
			Node farthestNull = rmNode.getParent().getLeft();
			Node farthestLeft = farthestNull;
			while (farthestNull != null){
				farthestNull = farthestNull.getRight();
				if (!farthestNull.equals(null)){
					farthestLeft = farthestNull;
				}
			}
			farthestLeft.setRight(rmNode.getRight());
		}
		return rmNode;
	}

}