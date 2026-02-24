# 📦 Problem 2: Extract Product Code

The records of a database table **Product** have been stored in text
format as a `String` using the delimiters `":"` and `","` in the
following way:

-   Different rows are separated by `":"`
-   Within a record, different column entries are separated by `","`
-   In each record, the **first column is always `productId`**

------------------------------------------------------------------------

## 🎯 Objective

Write a program called `Prog3` that:

1.  Reads from the `records` string
2.  Extracts **all product IDs** from the string
3.  Outputs **ALL product IDs** to the console in the following format:

```
    231A
    113D
    521W
    009G
    ...
```

------------------------------------------------------------------------

## 💻 Starter Code

``` java
public class Prog2 {
    public static void main(String[] args){
        // column names: productId, name, numInStock, provider, pricePerUnit
        String records =
            "231A,Light Bulb,123,Wilco,1.75:" +
            "113D,Hairbrush,19,Aamco,3.75:" +
            "521W,Shampoo,24,Acme,6.95:" +
            "440Q,Dishwashing Detergent,20,Wilco,1.75:" +
            "009G,Toothbrush,77,Wilco,0.85:" +
            "336C,Comb,34,Wilco,0.99:" +
            "523E,Paper Pad Set,109,Congdon and Chrome,2.45:" +
            "888A,Fake Diamond Ring,111,AmericusDiamond,3.95:" +
            "176A,Romance Nove1 1,20,Barnes and Noble,3.50:" +
            "176B,Romance Nove1 2,20,Barnes and Noble,3.50:" +
            "176C,Romance Nove1 3,20,Barnes and Noble,3.50:" +
            "500D,Floss,44,Wilco,1.25:" +
            "135B,Ant Farm,5,Wilco,8.00:" +
            "211Q,Bicycle,9,Schwinn,75.95:" +
            "932V,Pen Set,50,Congdon and Chrome,9.95:" +
            "678Q,Pencil 50,123,Congdon and Chrome,9.95:" +
            "239A,Colored Pencils,25,Congdon and Chrome,4.75:" +
            "975B,Shower Curtain,25,Wilco,6.50:" +
            "870K,Dog Bowl,15,Wilco,4.75:" +
            "231S,Cat Bowl,15,Wilco,4.75:" +
            "562M,Kitty Litter,15,Wilco,3.25:" +
            "777X,Dog Bone,15,Wilco,4.15:" +
            "933W,Cat Toy,15,Wilco,2.35:" +
            "215A,Hair Ball,0,Little Jimmy,0.00:";

        // Implement the code here
    }
}
```
