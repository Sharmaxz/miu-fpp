package lesson6.sort1;

import java.util.Arrays;
public class Person {
	private String fname;
	private String lname;
	private double salary;
	
	public Person(String n, String l, double salary) {
		fname = n;
		lname = l;
		this.salary = salary;
	}
	public String getFname() {
		return fname;
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getLname() {
		return lname;
	}
	@Override
	public String toString() {
		return fname + " " + lname;
	}
}
