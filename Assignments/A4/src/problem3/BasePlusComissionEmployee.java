package problem3;

public class BasePlusComissionEmployee extends CommissionEmployee{
    public double baseSalary;

    /* Constructors */
    public BasePlusComissionEmployee() {
        this("", "", "", 0.0, 0.0, 0.0);
    }

    //primary full constructor
    public BasePlusComissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    /* Getters & setters for base salary */
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    /* Overriding function */
    //we use the super payment, and simply add the base salary
    @Override
    public double getPayment() {
        return super.getPayment() + baseSalary;
    }



    @Override
    public String toString() {
        return "BasePlusComissionEmployee:\n\tfirstName=" + firstName + "\n\tlastName=" + lastName + "\n\tgrossSales="
                + grossSales + "\n\tbaseSalary=" + baseSalary + "\n\tsocialSecurityNumber=" + socialSecurityNumber
                + "\n\tcommissionRate=" + commissionRate + "\n\tgetPayment()=" + getPayment() + "\n";
    }

    
    

}
