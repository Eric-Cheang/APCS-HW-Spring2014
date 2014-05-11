public class MyStack {

    private Node top;
    private int numElts;

    public MyStack(){
	top = null;
	numElts = 0;
    }

    public  void push(double s){
	Node n = new Node(s);
	n.setNext(top);
	top = n;
	numElts = numElts+1;
    }
    public double pop() {
	double s;
	s = top.getData();
	top = top.getNext();
	numElts = numElts-1;
	return s;
    }

    public double peek() {
	return top.getData();
    }

    public boolean isEmpty() {
	return top == null;
    }

    public int getSize() {
	return numElts;
    }
    
    public String toString(){
	String tmp = "";
	Node currentNode =  top;
	while (currentNode != null ) {
	    tmp += currentNode.getData() + ", ";
	    currentNode = currentNode.getNext();
	}
	return tmp;
    }
}
