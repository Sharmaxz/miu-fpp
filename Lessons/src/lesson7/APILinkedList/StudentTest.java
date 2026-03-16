package lesson7.APILinkedList;

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

        // I want to filter the student who got more than 3.5 GPA
        // 1. Regular Approach
        System.out.println("1. Regular Approach");
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (s.getGpa() > 3.5) {
                System.out.println(student);
            }
        }

        // 2. For each Lambda
        System.out.println("2. For each Approach");
        for (Student student : studentList) {
            if (student.getGpa() > 3.5) {
                System.out.println(student);
            }
        }

        // 3. For each Lambda
        System.out.println("3. For each - Lambda Approach");
        studentList.forEach(student -> {
            if (student.getGpa() > 3.5) {
                System.out.println(student);
            }
        });

        // 4. Stream
        System.out.println("4. Stream");
        studentList.stream()
                .filter(student -> student.getGpa() > 3.5)
                .forEach(System.out::println);

        // 5. Iterator
        Iterator<Student> it = studentList.iterator();
        while(it.hasNext()) {
            Student student = it.next();
            if (student.getGpa() > 3.5) {
                System.out.println(student);
            }
        }

    }
}
