package lesson7.A;

import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        // Create 5 student objects and store into an arraylist
        Student s = new Student(1, "Tom", 3.5);
        Student s1 = new Student(2, "Anne", 3.7);
        Student s2 = new Student(3, "Bob", 3.55);
        Student s3 = new Student(4, "Ram", 3.8);
        Student s4 = new Student(5, "Bruce", 3.2);

        List<Student> studentList = new ArrayList<>(Arrays.asList(
                s, s1, s2, s3, s4
        ));

        System.out.println(studentList);

        for(Student student : studentList) {
            System.out.println(student);
        }

        System.out.println("Size: " + studentList.size());

        Student look = new Student(1, "Tom", 3.5);
        boolean b = studentList.contains(look);
        System.out.println("Contains: " + b);

        // Sorting
        System.out.println("Before Sorting: " + studentList);
        // Print using lambdas
        studentList.forEach(student -> System.out.println(student));
        System.out.println("After Sorting: " + studentList);

        // Print using lambdas
        Collections.sort(studentList);
        studentList.forEach(student -> System.out.println(student));

        // Comparator Consist equals
        // equals method says true if all the fields status are the same
        // Some way your comparator must check all the fields
        Collections.sort(studentList,
                Comparator.comparing(Student::getName). // Primary Key
                        thenComparing(Student::getGpa). // Secondary Key
                        thenComparing(Student::getId).reversed()); // Secondary key // .reversed()

        System.out.println("After Consist sorting: ");
        studentList.forEach(student -> System.out.println(student));
    }
}
