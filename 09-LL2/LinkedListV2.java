import java.*;

public class LinkedListV2{
	private Node head;
	private int length;

	public LinkedListV2(){
		head = new Node("Dummy");
		length = 1;
	}  

	public int length(){
		return length - 1;
	}

	public String toString(){
		Node temp = head; 
		String retStr = ""; 

		for (int index = 0; index < length; index++){
			if (index != 0){
				retStr = retStr + "Node Index " + (index - 1) + ": " + temp.getData() + " ";
				retStr = retStr + "\n";
			}
			temp = temp.getNext(); 
		}
		return retStr; 
	}

	public void add(int i, String s){
		boolean isChanged = false;
		Node orgHead = head;
		Node newNode = new Node(s);
		for (int index = 0; index < length; index++){
			if (index == i){
				Node twoNext = head.getNext();
				head.setNext(newNode);
				newNode.setNext(twoNext);
				isChanged = true;
				break; 
			}
			head = head.getNext();
		}
		if (isChanged == true){
			length++;
		}
		head = orgHead;
	}

	public void add(String s){
		Node orgHead = head;
		Node newNode = new Node(s);
		for (int index = 0; index < length; index++){
			if (index == length - 1){
				head.setNext(newNode);
			}
			head = head.getNext();
		}
		head = orgHead;
		length++;
	}

	public String get(int i){
		Node temp = head;
		i++;
		for (int index = 0; index < length; index++){
			if (index == i){
				return temp.getData();
			}
			temp = temp.getNext();
		}
		return temp.getData();
	}

	public int find(String s){
		Node temp = head;
		if (s.equals("Dummy")){
			temp.setData("ubfefwoienfoiwenfoiewnfoinwf");
		}
		for (int index = 0; index < length; index++){
			if (temp.getData().equals(s)){
				return index - 1;
			}
			temp = temp.getNext();
		}
		return -1;
	}

	public String set(int i, String s){
		i++;
		Node orgHead = head;
		for (int index = 0; index < length; index++){
			if (index == i){
				String retStr = head.getData();
				head.setData(s);
				head = orgHead;
				return retStr;
			}
			head = head.getNext();
		}
		head = orgHead;
		return "";
	}

	public String remove(int i){
		Node orgHead = head;
		for (int index = 0; index < length; index++){
			if (index == i){
				Node nextTwo = head.getNext().getNext();
				Node nextNode = head.getNext();
				String retStr = nextNode.getData();
				head.setNext(head.getNext().getNext());
				length--;
				return retStr;
			}
			head = head.getNext();
		}
		head = orgHead;
		return "iowrneoi";
	}

	public static void main(String[] args){
		LinkedListV2 tester = new LinkedListV2();
		tester.add("PEN");
		tester.add("SIKE");
		tester.add("SIKE2");
		tester.add(20, "IS");
		tester.add("Dummy");
		System.out.println(tester);
		System.out.println(tester.get(2));
		System.out.println(tester.find("SIKE2"));
		System.out.println(tester.find("NOTHERE"));
		System.out.println(tester.find("Dummy"));
		tester.set(tester.find("Dummy"), "less dummy");
		System.out.println(tester);
		tester.remove(tester.find("less dummy"));
		System.out.println(tester);
	}
}