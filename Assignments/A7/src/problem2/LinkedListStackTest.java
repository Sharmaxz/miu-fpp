package problem2;

public class LinkedListStackTest {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        System.out.println("Peek: " + stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.toString());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(null);

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.toString());
    }
}