package lesson7.LinkedList;

public class TestNode {
    static void main() {
        MyLL ll = new MyLL();
        ll.addFirst1(20);
        ll.addFirst1(30);
        ll.addFirst1(40);
        System.out.println(ll);
        System.out.println(ll.size());

        ll.addFirst(50);
        ll.addFirst(60);
        System.out.println(ll);
        System.out.println(ll.size());

        boolean response = ll.contains(50);
        System.out.println(response);

        ll.removeLast();
        System.out.println(ll);
        System.out.println(ll.size());
    }
}
