package lesson5;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee Name=" + name + "\n" + "Salary=" + salary;
    }

    @Override
    public boolean equals(Object obj) {
        // 1. Make sure the object is null or not
        if(obj == null) {
            return false;
        }

        if(this == obj) {
            return true; // Compare itself is always true - Optional
        }

        // 2. Type check getclass() or instanceof
//        if(this.getClass() != obj.getClass()) return false;
        if(!(obj instanceof Employee)) return false;

        Employee emp = (Employee) obj;
        return this.name.equals(emp.getName()) && this.salary == emp.getSalary();
    }
}
