package problem3;

public class LinkedListStack {
    private Node header; // top
    private int size;

    public void push(String data) {
        if (data == null) return;

        header = new Node(data, header);
        size++;
    }

    public String peek() {
        return (header == null) ? null : header.data;
    }

    public String pop() {
        if (header == null) return null;

        String value = header.data;
        header = header.next;
        size--;
        return value;
    }

    public boolean isEmpty() {
        return header == null;
    }

    public int size() {
        return size;
    }

    public void clear() {
        header = null;
        size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}