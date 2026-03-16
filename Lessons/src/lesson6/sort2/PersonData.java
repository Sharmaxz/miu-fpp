package lesson6.sort2;

import java.util.Arrays;
import java.util.Comparator;
// Sort1-Outside Comparator
/** Processes person data. Makes use of an external NameComparator class */
public class PersonData {
	public static Person[] prepareData() {
		Person[] persons =
			{new Person("Joe","Brown",4566.56),
					new Person("Bob","Roth",3455.23),
			 new Person("Anne","Mary",6788.90),
					new Person("Tim","Cook",2345.67),
			 new Person("Rosy","Cook",4567.88)};
		return persons;
	}

	public static void main(String[] args) {
		Person[] persons = prepareData();

		// Member Inner class Comparator
		// Create an object of Outer class
		PersonData pd = new PersonData();
		System.out.println("Before Sorting: " + Arrays.toString(persons));
//		Arrays.sort(persons, pd.getInner());
		Arrays.sort(persons, getInner());
		System.out.println("After Sorting: " + Arrays.toString(persons));
		
	}

	// Member Inner Class
//	private class MyInnerSort implements Comparator<Person> {
//
//		@Override
//		public int compare(Person o1, Person o2) {
//			// Sort by Last Name
//			return o1.getLname().compareTo(o2.getLname());
//		}
//	}
//
//	public MyInnerSort getInner() {
//		return new MyInnerSort();
//	}

	private static class MyInnerSort implements Comparator<Person> {

		@Override
		public int compare(Person o1, Person o2) {
			// Sort by Last Name
			return o1.getLname().compareTo(o2.getLname());
		}
	}

	public static MyInnerSort getInner() {
		return new MyInnerSort();
	}
}
