package problem1;
// Electronics class has additional fields warranty (in months), warranty Cost.

public class Electronics extends Product{
    public int warranty; //in months
    public double warrantyCost; //cost in dollars + cents
    
    public Electronics() {
        this("unnamed item", 0.0, 0, 0.0);
    }

    public Electronics(String productName, double price, int warranty, double warrantyCost) {
        super(productName, price);
        //validate input
        if(warranty < 0){
            System.err.println("Invalid input, please input the number of months name as a non-negative number.");
        }
        if(warrantyCost < 0){
            System.err.println("Invalid input, please input a discount as a positive double.");
        }

        this.warranty = warranty;
        this.warrantyCost = warrantyCost;
    }

    //Electronics class: Add the warranty cost to the original price and return the updated price.
    @Override
    public double getPrice() {
        return this.price + this.warrantyCost;
    }

    @Override
    public String toString(){
        return String.format("Product: %s\nOriginal Price:%.2f\nWarranty: %d months\nWarranty Cost: %.2f\nTotal Price: %.2f", productName, price, warranty, warrantyCost, this.getPrice());
    }
    
}
