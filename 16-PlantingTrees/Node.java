public class Node {
    private int data;
    private Node left;
    private Node right;
    private Node parent;

    public Node(int s) {
	   data=s;
    }
    private void setParent(Node givenParent){
        parent = givenParent;
    }
    public Node getParent(){
        return parent;
    }
    public void setData(int s) {
	   data = s;
    }
    public int getData() {
	   return data;
    }
    public void setLeft(Node n){
	   left = n;
       n.setParent(this);
    }
    public void setRight(Node n){
       right = n;
       n.setParent(this);
    }

    public Node getLeft() {
	   return left;

    }
    public Node getRight(){
        return right;
    }

    public boolean hasLeft(){
        if (getLeft() != null){
            return true;
        }
        return false;
    }

    public boolean hasRight(){
        if (getRight() != null){
            return true;
        }
        return false;
    }

    public boolean isLeaf(){
        if (hasLeft() || hasRight()){
            return false;
        }
        return true;
    }

    public boolean isFull(){
        if (hasLeft() && hasRight()){
            return true;
        }
        return false;
    }

    public String toString(){
        String retVar = "NODE... Data: " + data;
        return retVar;
    }
}

