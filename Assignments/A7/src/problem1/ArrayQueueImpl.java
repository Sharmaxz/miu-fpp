package problem1;

public class ArrayQueueImpl {
    private final int DEFAULT_CAPACITY = 10;
    private int size;
    private Integer[] arr;
    private int front;
    private int rear;

    public ArrayQueueImpl() {
        arr = new Integer[DEFAULT_CAPACITY];
        size = 0;
        front = 0;
        rear = 0;
    }

    public ArrayQueueImpl(int capacity) {
        if (capacity <= 0) {
            capacity = DEFAULT_CAPACITY;
        }
        arr = new Integer[capacity];
        size = 0;
        front = 0;
        rear = 0;
    }

    public Integer peek() {
        return isEmpty() ? null : arr[front];
    }

    public void enqueue(int obj) {
        if (size == arr.length) {
            resize();
        }

        arr[rear] = obj;
        rear = (rear + 1) % arr.length;
        size++;
    }

    public Integer dequeue() {
        if (isEmpty()) {
            return null;
        }

        Integer removed = arr[front];
        arr[front] = null;
        front = (front + 1) % arr.length;
        size--;
        return removed;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void resize() {
        Integer[] newArr = new Integer[arr.length * 2];

        // Copy elements from the old array to the new array
        // The order follows the queue order starting from 'front'
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[(front + i) % arr.length];
        }

        // Replace the old array
        arr = newArr;

        // Reset the queue positions
        front = 0;
        rear = size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        // Pass through the queue in correct order starting from 'front'
        for (int i = 0; i < size; i++) {
            sb.append(arr[(front + i) % arr.length]);

            if (i < size - 1) {
                sb.append(", ");
            }

            // sb.append(arr[(front + i) % arr.length]).append(", ");

            // Get the real index in the circular array
            // int index = (front + i) % arr.length;
            //
            // Integer value = arr[index];
            //
            // sb.append(value);
            //
            // if (i < size - 1) {
            //  sb.append(", ");
            // }
        }

        sb.append("]");
        return sb.toString();
    }


//    public void printDetails(String action) {
//        System.out.println("\n---- " + action + " ----");
//
//        System.out.print("Index:   ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + "   ");
//        }
//
//        System.out.print("\nArray:   ");
//        for (Integer val : arr) {
//            System.out.print((val == null ? "-" : val) + "   ");
//        }
//
//        System.out.println("\nfront = " + front + " | rear = " + rear + " | size = " + size);
//    }
}