package problem3;

public abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;


    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        if(firstName == null || lastName == null || socialSecurityNumber == null){
            System.err.println("One of the fields is null, please input a string");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /*getters & setters */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    

    /*abstract methods */

    //to be implemented by children classes
    public abstract double getPayment();

    @Override
    public String toString() {
        return "Employee:\n\tfirstName=" + firstName + "\n\tLastName=" + lastName + "\n\tsocialSecurityNumber="
                + socialSecurityNumber + "\n";
    }


    

}
