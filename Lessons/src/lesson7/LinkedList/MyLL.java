package lesson7.LinkedList;

public class MyLL {
    Node header;

    public MyLL() {
        header = new Node(null);
    }

    public void addFirst1(Integer data) {
        Node newNode = new Node(data);
        newNode.next = header.next;
        if (header.next != null) { // List is not empty
            header.next.prev = newNode;
        }
        header.next = newNode;
    }

    // addFirst method
    public void addFirst(Integer data) {
        Node newNode = new Node(header, data, header.next);
        if (header.next != null) { // List is not empty
            header.next.prev = newNode;
        }
        header.next = newNode;
    }

    public boolean contains(Integer data) {
        for(Node current = header.next; current != null; current = current.next) {
            if(current.data.equals(data)) {
                return true;
            }
        }

        return false;
    }

    public boolean removeLast() {
        if(header.next == null) {
            return false;
        }

        Node current = header.next;
        while(current.next != null) {
            current = current.next;
        }
        current.prev.next = null;
        return true;
    }


    public int size() {
        if(header.next == null) {
            return 0;
        }

        int counter = 0;

        for(Node current = header.next; current != null; current = current.next) {
            counter++;
        }

        return counter;
    }

    public String toString() {
        if (header.next == null) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");

        Node current = header.next;
        while (current != null) {
            sb.append(current.data);
            sb.append(" -> ");
            current = current.next;
        }
        sb.append("null ]");
        return sb.toString();
    }


    // Node Structure - Inner class

    class Node {
        Integer data;
        Node prev;
        Node next;

        Node(Integer data) {
            this.data = data;

        }

        Node(Node prev, Integer data, Node next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }
}