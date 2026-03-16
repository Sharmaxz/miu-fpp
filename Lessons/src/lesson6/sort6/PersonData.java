package lesson6.sort6;

import java.util.Arrays;
import java.util.Comparator;
// Sort1-Outside Comparator

/**
 * Processes person data. Makes use of an external NameComparator class
 */
public class PersonData {
    public static Person[] prepareData() {
        Person[] persons =
                {new Person("Joe", "Brown", 4566.56),
                        new Person("Bob", "Roth", 3455.23),
                        new Person("Anne", "Mary", 6788.90),
                        new Person("Tim", "Cook", 2345.67),
                        new Person("Rosy", "Cook", 4567.88)};
        return persons;
    }

    public static void main(String[] args) {
        Person[] persons = prepareData();

        // Static inner class with Comparator
        System.out.println("Before Sorting: " + Arrays.toString(persons));

        // Lambda Implementation
        Arrays.sort(persons, (o1, o2) -> o1.getFname().compareTo(o2.getFname()));
        System.out.println("After Sorting Reversed Salary: " + Arrays.toString(persons));
    }
}
