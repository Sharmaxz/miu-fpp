package problem1;

public class Furniture extends Product {
    private Material material; //three types of mateirals
    private double shippingCost;

    public Furniture() {
        this("unnamed item", 0.0, Material.WOOD, 0.0);
    }

    public Furniture(String productName, double price, Material material, double shippingCost) {
        super(productName, price);
        //validate input
        if(material == null){
            System.err.println("Invalid input, please input a proper material.");
        }
        if(shippingCost < 0){
            System.err.println("Invalid input, please input a shipping cost as a positive double.");
        }
        this.material = material;
        this.shippingCost = shippingCost;
    }


// • Furniture class: Add the shipping cost to the original price and return the updated
// price.
    @Override
    public double getPrice() {
        return this.price + this.shippingCost;
    }

    @Override
    public String toString(){
        return String.format("Product: %s\nOriginal Price:%.2f\nMaterial: %s\nShipping Cost: %.2f\nTotal Price: %.2f", productName, price, material.name(), shippingCost, this.getPrice());
    }
}
