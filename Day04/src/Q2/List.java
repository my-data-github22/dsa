package Q2;

public class List {
	public class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node tail;

	public List() {
		this.tail = null;
	}

	public boolean isEmpty() {
		return tail == null;
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			tail = newNode;
			newNode.next = newNode;
		} else {
			newNode.next = tail.next;
			tail.next = newNode;
		}
	}

	public void addLast(int data) {
		Node newNode = new Node(data);
		if (isEmpty())
			addFirst(data);
		else {
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		Node trav = tail.next;
		System.out.print("List :");
		do {
			System.out.print(" " + trav.data);
			trav = trav.next;
		} while (trav != tail.next);
		System.out.println("");
	}

	public void delFirst() {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		} else if (tail.next == tail)
			tail = null;
		else {
			tail.next = tail.next.next;
		}
	}

	public void delLast() {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		} else if (tail.next == tail)
			tail = null;
		else {
			Node trav = tail;
			while (trav.next != tail)
				trav = trav.next;
			trav.next = tail.next;
			tail = trav;
		}
	}
}
