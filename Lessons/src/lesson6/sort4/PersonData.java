package lesson6.sort4;

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
        System.out.println(Arrays.toString(persons));
        mySort(persons);
    }

    public static void mySort(Person[] persons) {

        class MyLocal implements Comparator<Person> {

            @Override
            public int compare(Person o1, Person o2) {
                // Sort by Salary - primitive double
				// return Double.compare(o1.getSalary(), o2.getSalary());

                if (o1.getSalary() > o2.getSalary()) {
                    return 1;
                } else if (o1.getSalary() < o2.getSalary()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }

        MyLocal ob = new MyLocal();
        Arrays.sort(persons, ob);
        System.out.println("Sorted by Salary: " + Arrays.toString(persons));
    }
}
