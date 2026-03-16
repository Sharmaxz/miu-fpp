package lesson5;

import lesson5.Employee;

public class TestEmployee {
    static void main() {
        Employee e = new Employee("Tom", 5500);
        Employee e1 = new Employee("Tom", 5500);
        Employee e2 = new Employee("Anne", 6000);

        // If put your object inside sout, invoke toString() automatically
        System.out.println(e1);
        System.out.println(e2.toString()); // Invoking toString() is automatic, inside sout

        System.out.println(e1.equals(e));
        System.out.println(e1.equals(e2));



    }
}
