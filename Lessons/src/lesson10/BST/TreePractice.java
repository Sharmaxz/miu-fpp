package lesson10.BST;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreePractice {
    static void main() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Java");
        boolean b = treeSet.add("Java");
        System.out.println(b);

        treeSet.add("JavaXF");
        treeSet.add("HTML");
        treeSet.add("Angular");

        // Sorted order
        System.out.println("Set= "+ treeSet);


        Student s = new Student(1, "Tom", 3.5);
        Student s1 = new Student(2, "Anne", 3.7);
        Student s2 = new Student(3, "Bob", 3.55);
        Student s3 = new Student(4, "Ram", 3.8);
        Student s4 = new Student(5, "Bruce", 3.2);
        
        TreeSet<Student> students = new TreeSet<>(
                Arrays.asList(s, s1, s2, s3, s4)
        );
        students.forEach(student -> System.out.println(student));

        TreeSet<Student> students1 = new TreeSet<>(
                (o1, o2) -> Integer.compare(o1.getId(), o2.getId())
        );

        TreeSet<Student> students2 = new TreeSet<>(
                Comparator.comparing(Student::getId)
        );

        students1.add(s);
        students1.add(s1);
        students1.add(s2);
        students1.add(s3);
        students1.add(s4);
        System.out.println(students1);

        TreeMap<String, String> courses = new TreeMap<>();
        courses.put("CS428", "AIE");
        courses.put("CS401", "MPP");
        courses.put("CS423", "Algorithms");
        courses.put("CS390", "FPP");
//        courses.put("CS390", "Fundamental Programming Practice");
        System.out.println(courses);
        String val = courses.get("CS390");
//        System.out.println("CS390=" = val);

    }
}
