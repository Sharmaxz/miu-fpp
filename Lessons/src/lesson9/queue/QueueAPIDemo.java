package lesson9.queue;

import java.util.*;

// Demo for Queue Methods
public class QueueAPIDemo {
    public static void main(String[] args) {
        Queue<Integer> iq = new PriorityQueue<Integer>();
        iq.offer(10);
        iq.offer(20);
        iq.add(15);
        iq.add(8);
        System.out.println(iq);
        System.out.println("Removed");
        Iterator<Integer> it = iq.iterator();
        while(it.hasNext()) {
            System.out.println(iq.remove());

        }

        Queue<String> queue = new LinkedList<String>();
        queue.offer("Java");
        queue.offer("DotNet");
        queue.offer("PHP");
        queue.offer("HTML");
        System.out.println(queue);
        System.out.println("Top Element: " + queue.element());
        System.out.println("remove: " +  queue.remove());
        System.out.println("poll: " + queue.poll());
        System.out.println(queue);
        queue.clear();
        System.out.println(queue);
//        System.out.println("Remove : " + queue.element());

//        System.out.println("Top Element: " + queue.element());
        System.out.println("poll: " + queue.poll());
//        System.out.println("Remove : " + queue.remove());
        System.out.println("Top Element: " + queue.peek());
        queue.removeAll(queue);
        System.out.println(queue.size());
        //   System.out.println("remove: " +  queue.element()); // throw exception, when the queue is empty
        // System.out.println("Top Element: " + queue.peek());// return null if the queue is empty
//        System.out.println("Top Element: " + queue.remove());// Throw NoSuchElement Exception

        // Regular Queue - remove from the front, and add at rear
        Queue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(25);
        pq.add(15);
        pq.add(35);
        pq.add(30);
        pq.add(11);
        //   System.out.println("Priority Queue Elements : " + pq);
        Iterator p = pq.iterator();
        System.out.println("Elements removed according to the priority : ");
        while(p.hasNext()){
            System.out.print(pq.remove() + "  ");
        }

        // Regular Deque(Double ended Queue) - remove from the front, and add at rear
        Deque<String> dq = new LinkedList();
        //Deque<Integer> dq1 = new PriorityQueue();
        dq.add ("Java"); //add element at tail
        dq.addFirst("C#"); //add an element at head

        dq.addLast ("Software Engineering"); //add element at tail
        System.out.println("\nDQueue Elements : " + dq);


        Student s = new Student(1, "Tom", 3.5);
        Student s1 = new Student(2, "Anne", 3.7);
        Student s2 = new Student(3, "Bob", 3.55);
        Student s3 = new Student(4, "Ram", 3.8);
        Student s4 = new Student(5, "Bruce", 3.2);

        Queue<Student> studentQueue = new PriorityQueue<>(Arrays.asList(
                s, s1, s2, s3, s4
        ));

        System.out.println(studentQueue);

        Iterator<Student> it1 = studentQueue.iterator();
        while(it1.hasNext()) {
//            System.out.println(it1.remove());
        }


    }
}