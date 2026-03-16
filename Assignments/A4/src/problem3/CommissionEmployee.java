package problem3;

public class CommissionEmployee extends Employee{
    public double grossSales;
    public double commissionRate;

    

    /* Constructors */
    public CommissionEmployee() {
        this(0.0, 0.0);
    }

    public CommissionEmployee(double grossSales, double commissionRate) {
        this("", "", "", grossSales, commissionRate);
    }


    //primary constructor 
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        //check sales
        if(grossSales < 0){
            System.err.println("Gross sales cannot be a negative number. Please input a positive number.");
        }
        if(commissionRate < 0){
            System.err.println("Commission rate cannot be a negative number. Please input a positive number.");
        }

        //use the super default constructor to set these three fields
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }


    /*getters & setters */
    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    
    /*Overriding */
    @Override
    public double getPayment() {
        return this.grossSales * this.commissionRate;
    }

    @Override
    public String toString() {
        return "CommissionEmployee:\n\tfirstName=" + firstName + "\n\tlastName=" + lastName + "\n\tgrossSales=" + grossSales
                + "\n\tsocialSecurityNumber=" + socialSecurityNumber + "\n\tcommissionRate=" + commissionRate
                + "\n\tgetPayment()=" + getPayment() + "\n";
    }
    
}
