package problem1;

public class Main {
    /**In the main method of a Main class, create three instances of Customer (be sure to create
instances of Address to populate their billingAddress and shippingAddress fields using
setters). Add these instances to an array. Then loop through the array and print to the
console all those Customers whose billingAddress is located in the city of Chicago (when
you create instances of Customer initially, be sure to create at least one Customer whose
billing address is in Chicago). 
     */
    public static void main(String[] args) {
        Address chicagoAddress = new Address("6400 S Dr. Martin Luther King Jr. Dr", "Chicago", "Illinois", 60637);
        Address appleAddress = new Address("1 Apple Park Way", "Cupertino", "California", 95014);
        Address nycAddress = new Address("350 5th Ave", "New York City", "New York", 10118);

        Customer huyDinh = new Customer("Huy", "Hoang", 000000000, appleAddress, chicagoAddress);
        Customer joaoSilva = new Customer("Joao", "Silva", 13573559, chicagoAddress, nycAddress);
        Customer rahul = new Customer("Rahul", "Lama", 12305812, nycAddress, appleAddress);
        Customer[] customers = {huyDinh, joaoSilva, rahul};
        for(Customer c : customers){
            if(c.getBillingAddress().getCity().equals("Chicago")){
                String str = c.toString();
                System.out.println(str);
            }
        }
        
    }
    
}
