package problem1;

//parent class
public class Product{
    //instnace field for all children
    protected  String productName; 
    protected  double price;


    public Product() {
        this("unnamed item", 0.0);
    }

    public Product(String productName, double price) {
        if(productName == null){
            System.err.println("Invalid input, please input a name as a non-empty String.");
        }
        if(price < 0){
            System.err.println("Invalid input, please input a price as a positive double.");
        }
        this.productName = productName;
        this.price = price;
    }

    /*Getters & setters */
    public void setPrice(double price) {
        this.price = price;
    }


    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    

    /* OVerride string */
    @Override
    public String toString(){
        return String.format("Product: %s\nPrice:%.2f", productName, price);
    }

}

