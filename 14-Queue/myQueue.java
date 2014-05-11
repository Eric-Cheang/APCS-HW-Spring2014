public class MyQueue{

	private Node head;
	private Node tail;
	private int length;

	public MyQueue(){
		head = null;
		tail = null;
	}

	public void enqueue(String s){
		Node n = new Node(s);
		if (length == 0){
			head = n;
			tail = n;
		}
		else{
			tail.setNext(n);
			tail = n;
		}
		length++;
	}

	public String toString(){
		String s = "";
		Node tmp = head;
		while (tmp != null){
			s = s + tmp.getData() + " ---> ";
			tmp = tmp.getNext();
		}
		s = s + " tail";
		return s;
	}
}