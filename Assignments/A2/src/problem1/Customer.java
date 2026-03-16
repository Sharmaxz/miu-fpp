package problem1;


public class Customer {
    private String firstName;
    private String lastName;
    private int socialSecurityNumber;
    private Address billingAddress;
    private Address shippingAddress;

    public Customer() {
        this("", "", 0);
    }

    public Customer(String firstName, String lastName, int socialSecurityNumber){
        this(firstName, lastName, socialSecurityNumber, new Address(), new Address());
    }

    public Customer(String firstName, String lastName, int socialSecurityNumber, Address billingAddress, Address shippingAddress){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
    }

    /*getters & Setters */
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getSocialSecurityNumber(){
        return this.socialSecurityNumber;
    }

    public Address getBillingAddress(){
        return this.billingAddress;
    }
    
    public Address getShippingAddress(){
        return this.shippingAddress;
    }
    
    /* setters */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setSocialSecurityNumber(int socialSecurityNumber){
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public void setBillingAddress(Address billingAddress){
        this.billingAddress = billingAddress;
    }
    public void setShippingAddress(Address shippingAddress){
        this.shippingAddress = shippingAddress;
    }

    //to string function
    @Override
    public String toString() {
        String str = String.format("[%s, %s, %09d]", firstName, lastName, socialSecurityNumber);
        return str;
    }
    
}
