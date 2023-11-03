package Q3;

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
			System.out.println("List is Empty");
			return;
		}
		Node trav = head;
		System.out.print("List :");
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println();
	}

	public void middleNode() {
		Node fastTrav = head;
		Node slowTrav = head;

		while (fastTrav != null && fastTrav.next != null) {
			fastTrav = fastTrav.next.next;
			slowTrav = slowTrav.next;
		}
		System.out.println("Middle Node: " + slowTrav.data);
	}
}
