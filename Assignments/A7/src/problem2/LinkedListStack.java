package problem2;

public class LinkedListStack {
    private Node header;

    public LinkedListStack() {
        header = new Node(null);
    }

    public void push(Integer x) {
        if (x == null) return;

        header.next = new Node(x, header.next);
    }

    public Integer peek() {
        if (header.next == null) return null;

        // The top item is the first real node
        return header.next.data;
    }

    public Integer pop() {
        if (header.next == null) return null;

        // Remove the first real node
        Node temp = header.next;
        header.next = temp.next;

        return temp.data;
    }

    public boolean isEmpty() {
        return header.next == null;
    }

    public int size() {
        int count = 0;

        for (Node current = header.next; current != null; current = current.next) {
            count++;
        }

        return count;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "<empty>";

        StringBuilder sb = new StringBuilder();

        for (Node current = header.next; current != null; current = current.next) {
            sb.append(current.data).append(" ");
        }

        return sb.toString();
    }

    class Node {
        Integer data;
        Node next;

        Node(Integer data) {
            this.data = data;
        }

        Node(Integer data, Node next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }
}