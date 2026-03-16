package problem3;

/**
 * Driver class to test the various implementations of our interface
 */

public class EmployeeTest {
    public static void main(String[] args) {
        
        Employee employee1 = new BasePlusComissionEmployee("Bob", "John", "9999999", 1000000000.0, 2000.0, 100000);
        Employee employee2 = new CommissionEmployee("John", "Kora", "88888888", 1000000000.0, 23058.0);
        Employee employee3 = new hourlyEmployee("Name", "LastName", "66666666", 90000.0, 40);
        Employee employee4 = new SalariedEmployee("Boby", "John", "555555", 900000.00);
        Employee employee5 = new hourlyEmployee("NoName", "SecondName", "3333333", 10.0, 50000);
        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        Employee[] salaryList = findSalaryList(employees, 1000000);
        for(Employee e : salaryList){
            System.out.println(e.toString() + "\n");
        }
    }

    public static Employee[] findSalaryList(Employee[] col, double salary){
        //deal with NPE
        if(col == null){
            System.err.println("Error: Employee list is empty, please input a list of employees");
            return new Employee[0];
        }

        //count to create a new array
        int count = 0;
        for(Employee emp : col){
            //add employee if size is greeater
            if(emp.getPayment() > salary){
                count++;
            }
        }

        //store them in a result the size of the number of employees who earn greater than the salary
        Employee[] result = new Employee[count];
        count = 0;
        for(Employee emp : col){
            //add employee if size is greeater
            if(emp.getPayment() > salary){
                result[count] = emp;
                count++;
            }
        }

        //return this result as an array of employees
        return result;
    }
}
