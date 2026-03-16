package problem1;

public class TestClass {
    public static void main(String[] args) {
        Product[] products = {new Clothing("Sweater", 30.50, "Uniqlo", 10), new Electronics("Laptop", 1200, 12, 5), new Furniture("Chair", 12, Material.STEEL, 550),new Electronics("iPhone 20", 2000, 12, 500), new Furniture("Table", 50, Material.WOOD, 10)};
        System.out.println("TOTAL COST: " + sumProducts(products));
    }

    //The getprice is overrided per item, so they should be overridden
    //Now in the test class, we can use this function to sum all the price
    public static double sumProducts(Product[] col) {
        if(col == null || col.length == 0){
            System.err.println("Please input a valid list of products");
            return -1;
        }

        double sum = 0;
        for (Product product : col) {
            sum += product.getPrice();
        }
        
        return sum;
    }
}

/*
• Create an array of type Product, Store 5 different objects.
• Loop through the objects and print the status of the objects(overriding toString()).
• Create a static method that takes the array of products and returns the sum of all
the products. Inside this method deals the logic to avoid
NullPointerException(NPE).
public static double sumProducts(Product[] col) { return 0.0;}
• Print the sum on the console.
 */

