public class BinarySearchTree{

	

		public static void main(String[] args){

			Node root = new Node(20);
			Node a = new Node(10);
			Node b = new Node(1);
			Node c = new Node(4);
			Node d = new Node(13);
			Node e = new Node(37);
			Node f = new Node(26);
			Node g = new Node(33);
			Node h = new Node(50);

			root.setLeft(a);
			a.setLeft(b)
			b.setRight(c);
			a.setRight(d);
			root.setRight(e);
			e.setleft(f);
			f.setRight(g);
			e.setRight(h);


		}

	}