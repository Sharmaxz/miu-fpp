# 🔁 Problem 4: Practice Loops

------------------------------------------------------------------------

## 🅐 Part A

Write a Java program to calculate the first **N terms** of the series:

    1 – 1/3 + 1/5 – 1/7 + 1/9 - …..

### 📌 Pattern Explanation

-   The numerator is always **1**
-   The denominator follows the sequence of **odd numbers**:
    `1, 3, 5, 7, 9, ...`
-   The signs alternate:
    `+  -  +  -  +  - ...`

------------------------------------------------------------------------

### ✅ Example (n = 5)

Series:

    1 – 1/3 + 1/5 – 1/7 + 1/9

Breakdown:

-   Term 1: 1/1 = 1
-   Term 2: -1/3
-   Term 3: 1/5
-   Term 4: -1/7
-   Term 5: 1/9

### 🎯 Output:

    Sum = 0.832

------------------------------------------------------------------------

## 🅑 Part B

Write a Java program to calculate the first **N terms** of the series:

    1/2 - 2/4 + 3/8 – 4/16 + 5/32 - …..

### 📌 Pattern Explanation

-   The numerator increases sequentially:
    `1, 2, 3, 4, 5, ...`
-   The denominator follows powers of 2:
    `2, 4, 8, 16, 32, ...`
-   The signs alternate:
    `+  -  +  -  +  - ...`

------------------------------------------------------------------------

### 🎯 Requirement

-   Use loops to calculate the sum.
-   Allow the user to input **N**.
-   Display the final calculated sum.
