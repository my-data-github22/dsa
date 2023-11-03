package Q2;

public class SinglyCircularLL {
	public static void main(String[] args) {
		List list = new List();

		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.delFirst();
		list.display();
		list.addLast(40);
		list.delLast();
		list.display();

	}

}
