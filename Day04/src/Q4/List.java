package Q4;

public class List {
	public class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node head;

	public List() {
		this.head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (isEmpty())
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("List is Empty.");
		} else {
			Node trav = head;

			System.out.print("List :");
			while (trav != null) {
				System.out.print(" " + trav.data);
				trav = trav.next;
			}
			System.out.println();
		}
	}

	public void reverseList() {
		Node t1 = head;
		Node t2 = head.next;
		head.next = null;
		while (head != null) {
			head = t2.next;
			t2.next = t1;
			t1 = t2;
			t2 = head;
		}
		head = t1;

	}
}
