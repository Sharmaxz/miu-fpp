package prob3;

import java.util.EmptyStackException;

public class TestStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack(3);

        // Basic operations (these will break when you add checks—students will add try/catch later)
        try {
            System.out.println("Push 10, 20, 30");
            stack.push(10);
            stack.push(20);
            stack.push(30);
            System.out.println("Stack: " + stack);

            System.out.println("Peek: " + stack.peek());
            System.out.println("Pop: " + stack.pop());
            System.out.println("After pop, peek: " + stack.peek());
            System.out.println("Stack: " + stack);
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }

        // Uncomment later when exceptions are implemented

        //should cause overflow
        try {
            stack.push(40);
            stack.push(50);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        // should cause null not allowed
        try {
            stack.push(null);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        // empty now
        try {
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Cannot pop because the stack is empty.");
        }

        // should cause underflow
        try {
            stack.peek();
        } catch (EmptyStackException e) {
            System.out.println("Cannot peek because the stack is empty.");
        }
    }
}