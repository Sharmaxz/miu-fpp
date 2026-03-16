package problem1;

public class Clothing extends Product{
    private String brand;
    private double discount; //as percent

    public Clothing() {
        this("unnamed item", 0.0, "unlabeled brand", 0.0);
    }

    public Clothing(String productName, double price, String brand, double discount) {
        super(productName, price);
        //validate input
        if(brand == null){
            System.err.println("Invalid input, please input a brand name as a non-empty String.");
        }
        if(discount < 0){
            System.err.println("Invalid input, please input a discount as a positive double. Discount = 10, is a 10% discount.");
        }
        this.brand = brand;
        this.discount = discount;
    }

    
//      Clothing class: Apply the discount percentage to the original price and return discounted price.
    @Override
    public double getPrice() {
        return this.price - (discount * this.price / 100);//discount as percentage. 
    }

    @Override
    public String toString(){
        return String.format("Product: %s\nOriginal Price:%.2f\nBrand: %s\nDiscount: %.2f%%\nTotal Price: %.2f\n", productName, price, brand, discount,this.getPrice());
    }
    
}