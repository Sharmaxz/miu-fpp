package problem3;

public class hourlyEmployee extends Employee{
    public double wages;
    public double hours;


    /* Constructors */
    public hourlyEmployee(double wages, double hours) {
        this("", "", "", wages, hours);
    }

    //primary constructor
    public hourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wages, double hours) {
        //super automatically checks if the names are null. a empty sring is okay!
        super(firstName, lastName, socialSecurityNumber);
        if(wages < 0 || hours < 0){
            System.err.println("Error: Wages or hours cannot be below 0. Please input a valid value");
        }
        this.wages = wages;
        this.hours = hours;
    }

    /* getters & setters */
    public double getWages() {
        return wages;
    }


    public void setWages(double wages) {
        this.wages = wages;
    }


    public double getHours() {
        return hours;
    }


    public void setHours(double hours) {
        this.hours = hours;
    }


    /* Overriding functinos */
    @Override
    public double getPayment() {
        return this.wages * this.hours;
    }


    @Override
    public String toString() {
        return "hourlyEmployee:\n\tfirstName=" + firstName + "\n\twages=" + wages + "\n\tlastName=" + lastName
                + "\n\tsocialSecurityNumber=" + socialSecurityNumber + "\n\thours=" + hours + "\n\tgetPayment()="
                + getPayment() + "\n";
    }

    
}
