public class LinkedList{
	private Node head;
	private int length; 

	//////////////////////////////////Iterable//////////////////////////////
	//Was in the mindset of iterable, meaning everything i did was in a 
	//foor loop. It makes the code less elagant, but acts as a springboard
	//for the idea of iterable


	////////////////////////////////////////////////////////////////////////

	public LinkedList(){
		head = null;		
	}

	public void add(String s){
		Node tmp = new Node(s);
		tmp.setNext(head);
		head = tmp;
		length++;
	}

	public String set(int i, String s){
		Node desNode = new Node(s);
		Node orgHead = head;
		int listLength = this.length();
		Node temp = null;
		Node m1Node = null;
		for (int index = 0; index < listLength; index++){
			head = head.getNext();
			if (index == i - 1){
				m1Node = head; 
			}
			if (index == i){
				temp = head.getNext();
				head = desNode;
				head.setNext(temp);
				m1Node.setNext(head);
			}
		}
		head = orgHead;
		return temp.getData();
	}

	public int length(){
		return length; 	
	}

	public String toString(){
		Node orgHead = head;
		String retString = "";
		int listLength = this.length();
		for (int index = 0; index < listLength; index++){
			retString = retString + "Node Number " + index +" " +  head.toString();
			retString = retString + "\n";
			head = head.getNext();
		}
		head = orgHead;
		return retString;
	}

	public int find(String s){
		int listLength = this.length();
		Node orgHead = head;
		for (int index = 0; index < listLength; index++){
			if (head.getData().equals(s)){
				head = orgHead;
				return index;
			}
			head = head.getNext();
		}
		head = orgHead;
		return -1;
	}

	public String get(int i){
		Node orgHead = head;
		for (int index = 0; index != i; index++){
			head = head.getNext();
		}
		Node dNode = head;
		head = orgHead;
		return dNode.getData();
	}

	public String remove(int i){
		Node orgHead = head;
		int listLength = this.length();
		String retString = "";
		for (int index = 0; index < listLength; index++){
			head = head.getNext();
			if (index == i - 1){
				retString = head.getNext().getData();
				head.setNext(head.getNext().getNext());
			}
		}
		return retString;
	}

	public static void main(String[] args){

		LinkedList helpMe = new LinkedList();
		helpMe.add("Whyisprecalcsohard");
		helpMe.add("Whyislifesohard");
		helpMe.add("whiningisataboo");
		helpMe.add("Hello World");
		System.out.println(helpMe.length());
		System.out.println(helpMe);
		System.out.println(helpMe);
		System.out.println(helpMe.find("whiningisataboo"));
		System.out.println(helpMe.get(0));
		System.out.println(helpMe.set(0,"PENFACE"));
		System.out.println(helpMe.get(2));
		System.out.println(helpMe);
		System.out.println(helpMe.remove(1));
		System.out.println(helpMe);
	}
}