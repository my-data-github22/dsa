package Q1;

public class SinglyLL {
	public static void main(String[] args) {
		List lt = new List();

		lt.addFirst(10); // 10
		lt.addFirst(20); // 20 10
		lt.addFirst(30); // 30 20 10
		lt.display(); // 30 20 10
		lt.addLast(40);
		lt.display(); // 30 20 10 40
		lt.delFirst();
		lt.display(); // 20 10 40
		lt.delLast();
		lt.display(); // 20 10
	}
}
