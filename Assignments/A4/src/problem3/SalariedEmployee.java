package problem3;

public class SalariedEmployee extends Employee{
    public double weeklySalary;
    /* Constructors */
    public SalariedEmployee(double weeklySalary) {
        this("", "", "", weeklySalary);
        this.weeklySalary = weeklySalary;
    }

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }
    
    /* Getter & setter */
    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    

    /*Override functions */
    @Override
    public double getPayment() {
        return this.weeklySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee:\n\tfirstName=" + firstName + "\n\tweeklySalary=" + weeklySalary + "\n\tlastName=" + lastName
                + "\n\tsocialSecurityNumber=" + socialSecurityNumber + "\n\tgetPayment()=" + getPayment() + "\n";
    }

    
}
