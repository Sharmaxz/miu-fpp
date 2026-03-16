package lesson7;

import java.util.*;

public class ArrayListDemo {
    static void main() {
        // Default capacity 10, you can also pass the capacity
        // <Type> - Generic Type - Only accepts a reference type, no primitive
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<String>(15);
        // ArrayList<int> list2 = new ArrayList<int>(); // Error - Pass Intenger

        list1.add("C++");

        // To achieve polymorphism - prefer super type (Future can change to Vector, LinkedList)
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(45);

        // What <> remove this happen - Raw type - All elements are an object type
        List ob = new ArrayList();
        ob.add(10);
        ob.add("Hello");

        int pos0 = (int) ob.get(0); // Downcasting - Object
        Object p0 = ob.get(0);

        // var keyword - Java 7
        var list3 = new ArrayList<Integer>();

        // Define list while creating
        ArrayList<String> codeList = new ArrayList<>(Arrays.asList("C++", "Java", "HTML"));
        codeList.add("Python");
        System.out.println(codeList);
        System.out.println("Size: " + codeList.size());
        //codeList.add(7, "Kotlin") // Error - Should in the range of 0 size
        codeList.set(3, "Kotlin");
        System.out.println(codeList);
        System.out.println("Size: " + codeList.size());
        System.out.println("Size: " + codeList.get(1));

        // Sorting - Collections
        Collections.sort(codeList); // Natural order
        System.out.println(codeList);
        Collections.sort(codeList, Collections.reverseOrder());
        System.out.println(codeList);

        // Binary Search
//        int pos = Collections.binarySearch(codeList, "HTML");
        int pos = Collections.binarySearch(codeList, "HTML", Comparator.reverseOrder());
        System.out.println("HTML is at position: " + pos);

    }
}
