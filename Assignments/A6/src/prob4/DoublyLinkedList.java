package prob4;

public class DoublyLinkedList {

	Node header;

	DoublyLinkedList() {
		header = new Node();
	}

	// 1. adds to the end of the list
	public void addLast(String item) {
		Node newNode = new Node();
		newNode.value = item;

		Node current = header;
		while (current.next != null) {
			current = current.next;
		}

		current.next = newNode;
		newNode.previous = current;
	}

	// 2. Remove by passing object
	public boolean remove(String item) {
		if (item == null) return false;

		Node current = header.next;

		while (current != null) {
			if (item.equals(current.value)) {
				Node prev = current.previous;
				Node next = current.next;

				prev.next = next;
				if (next != null) {
					next.previous = prev;
				}
				return true;
			}
			current = current.next;
		}

		return false;
	}

	// 3. Remove the First Node
	public boolean removeFirst() {
		if (header.next == null) {
			return false;
		}

		Node first = header.next;
		Node second = first.next;

		header.next = second;
		if (second != null) {
			second.previous = header;
		}

		return true;
	}

	// 4. Prints the list from last to first
	public void printReverse() {
		Node current = header.next; // Same logic to find the last value

		if (current == null) {
			System.out.println("List is empty");
			return;
		}

		while (current.next != null) {
			current = current.next;
		}

		while (current != header) {
			System.out.print(current.value + " ");
			current = current.previous;
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		toString(sb, header);
		return sb.toString();
	}

	private void toString(StringBuilder sb, Node n) {
		if (n == null) return;
		if (n.value != null) sb.append(" " + n.value);
		toString(sb, n.next);
	}

	class Node {
		String value;
		Node next;
		Node previous;

		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addLast("Bob");
		list.addLast("Harry");
		list.addLast("Steve");
		System.out.println("Original:" + list);

		list.remove("Harry");
		System.out.println("\nAfter remove Harry:" + list);

		list.removeFirst();
		System.out.println("\nAfter removeFirst:" + list);

		list.addLast("Tom");
		list.addLast("Bill");
		System.out.println("After addLast:" + list);

		System.out.print("Reverse: ");
		list.printReverse();
		System.out.println("\n");
	}
}