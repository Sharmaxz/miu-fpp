package problem4;

public class Pizza{
    /* two enum fields of object pizza */
    public PizzaSize size;
    public PizzaType type;
    //quantity is int
    public int quantity;

    //calculated based on size and type
    private double cost;
    private double tax;

    /* enums so we can choose the different values */
    //make public 
    
    /* Constructor */
    public Pizza(PizzaSize size, PizzaType type, int quantity){
        this.size = size;
        this.type = type;
        this.quantity = quantity;
        calculateCost();// sets cost based on these values
    }

    private void calculateCost(){
        double total = 0;
        switch (this.size) {
            case SMALL-> {
                total += 8;
            }
            case MEDIUM-> {
                total += 10;
            }
            case LARGE-> {
                total += 12;
            }
        }

        switch (this.type) {
            case VEGGIE-> {
                total += 1;
            }
            case PEPPERONI-> {
                total += 2;
            }
            case CHEESE-> {
                total += 1.5;
            }
            case BBQ_CHICKEN-> {
                total += 2;
            }
        }

        this.cost = this.quantity * total;
        this.tax = this.cost * 0.03;
    }

    public String printOrderSummary(){
        /*format:
        Pizza Order:
        Size: SMALL
        Type: VEGGIE
        Qty: 2
        Price: $18.00
        Tax: $0.54
        Total Price: $18.54
        */

       return String.format("\nPizza Order:\nSize: %s\nType: %s\nQty: %d\nPrice: $%.2f\nTax: $%.2f\nTotal: $%.2f", this.size, this.type, this.quantity, this.cost, this.tax, this.cost + this.tax);

    }

    

}