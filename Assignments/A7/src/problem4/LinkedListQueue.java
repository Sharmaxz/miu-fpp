package problem4;

public class LinkedListQueue {
    private Node front;
    private Node rear;
    private int size;

    public void enqueue(Ticket ticket) {

        if (ticket == null) return;

        Node newNode = new Node(ticket);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }

    public Ticket dequeue() {

        if (isEmpty()) return null;

        Ticket removed = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;

        return removed;
    }

    public Ticket peek() {
        return (front == null) ? null : front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "<empty>";
        }

        StringBuilder sb = new StringBuilder();

        Node current = front;

        while (current != null) {
            sb.append(current.data).append("\n");
            current = current.next;
        }

        return sb.toString();
    }

    class Node {
        Ticket data;
        Node next;

        Node(Ticket data) {
            this.data = data;
        }
    }
}