package Q1;

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
	private Node tail;

	public List() {
		this.head = null;
		this.tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void addLast(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			addFirst(data);
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void delFirst() {
		if (isEmpty()) {
			System.out.println("List is Empty");
		} else {
			head = head.next;
		}
	}

	public void delLast() {
		if (isEmpty()) {
			System.out.println("List is Empty");
		} else if (head.next == null) {
			head = null;
			tail = null;
		} else {
			Node trav = head;
			while (trav.next != tail) {
				trav = trav.next;
			}
			trav.next = null;
			tail = trav;
		}
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("List is Empty.");
			return;
		}
		Node trav = head;
		System.out.print("List :");
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}
}
