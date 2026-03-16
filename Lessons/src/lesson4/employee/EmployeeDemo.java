//package lesson4.employee;
//
//public class EmployeeDemo {
//
//    static void main() {
//        Employee e1 = new Employee("Tom", 4500.66, 2000, 12, 28);
//        Employee e2 = new Manager("Tommy", 5500.00, 1999, 12, 28);
//        Manager e3 = new Manager("Renuka", 8500.00, 1988, 12, 28);
//
//        Employee[] employees = {e1, e2, e3};
//
//        Employee employee = findMaxSalary(employees);
//        System.out.println(employee.getName());
//    }
//
//    static Employee findMaxSalary(Employee[] employees) {
//        double maxSalary = 0;
//        Employee employeeWithMaxSalary = null;
//        for(Employee e : employees) {
//            if(e.getSalary() > maxSalary) {
//                maxSalary = e.getSalary();
//                employeeWithMaxSalary = e;
//            }
//        }
//
//        return employeeWithMaxSalary;
//    }
//}
