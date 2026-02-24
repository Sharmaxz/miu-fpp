# 🔎 Problem 5: Finding Second Minimum

Create a Java method to find the **second minimum value** in an array.

------------------------------------------------------------------------

## 🎯 Objective

Write your own logic (without using Java APIs) to determine the second
smallest number in an array of integers.

You must implement the following method inside a class called `Prog6`:

``` java
public static void secondMin(int[] arrayOfInts)
```

The method should:

-   Find the second minimum value
-   Print the result to the console
-   Not modify the original array

------------------------------------------------------------------------

## ⚠️ Restrictions

-   ❌ Do NOT use any sorting tools from Java libraries
-   ❌ Do NOT call `Arrays.sort()`
-   ❌ Do NOT use Collections APIs
-   ✅ You must implement your own logic

(No credit will be given if sorting utilities are used.)

------------------------------------------------------------------------

## 📌 Example

### Input:

    [2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22]

### Expected Output:

    Second minimum = 1

------------------------------------------------------------------------

## 💡 Hint

You may solve this by:

-   Traversing the array once or twice
-   Keeping track of:
    -   The smallest value
    -   The second smallest value
-   Carefully handling duplicate minimum values
