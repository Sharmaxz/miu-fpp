package problem1;

public class CircularQueueTest {
    public static void main(String[] args) {
        ArrayQueueImpl queue = new ArrayQueueImpl(5);

        System.out.println("Is empty? " + queue.isEmpty());
        System.out.println("Size: " + queue.size());

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println(queue);
        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("After dequeue: " + queue);

        queue.enqueue(60);
        queue.enqueue(70);

        System.out.println("After enqueue more: " + queue);
        System.out.println("Size: " + queue.size());
        System.out.println("Peek: " + queue.peek());

//        ArrayQueueImpl q = new ArrayQueueImpl(5);
//
//        q.enqueue(10);
//        q.printDetails("enqueue 10");
//
//        q.enqueue(20);
//        q.printDetails("enqueue 20");
//
//        q.enqueue(30);
//        q.printDetails("enqueue 30");
//
//        q.dequeue();
//        q.printDetails("dequeue");
//
//        q.dequeue();
//        q.printDetails("dequeue");
//
//        q.enqueue(40);
//        q.printDetails("enqueue 40");
//
//        q.enqueue(50);
//        q.printDetails("enqueue 50");
//
//        q.enqueue(60);
//        q.printDetails("enqueue 60");
//
//        q.enqueue(70);
//        q.printDetails("enqueue 70");
//
//        q.enqueue(80);
//        q.printDetails("enqueue 80");
    }
}
