# ⚡ Problem 6: Electricity Bill Generator

The Electricity Board wants a simple console program that allows
operators to generate bills for multiple customers.

------------------------------------------------------------------------

## 🎯 Requirements

### 1️⃣ Ask the User For:

-   **User type**
    -   `R` = Residential
    -   `C` = Commercial
    -   `I` = Industrial
-   **Units consumed** (integer)

------------------------------------------------------------------------

### 2️⃣ Use a Single `switch` Expression to Compute the Bill

Billing rates:

-   Residential → **\$0.12 per unit**
-   Commercial → **\$0.20 per unit**
-   Industrial → **\$0.35 per unit**
-   Invalid code → **\$0.00**

------------------------------------------------------------------------

### 3️⃣ Display the Bill Details Neatly Formatted

Example format:

    === Electricity Bill ===
    User Type: R
    Units: 250
    Bill Amount: $30.00

------------------------------------------------------------------------

### 4️⃣ Ask After Each Bill

    Do you want to calculate another bill? (y/n):

-   If user enters `y` or `Y` → Continue
-   If user enters `n` or `N` → Exit program

------------------------------------------------------------------------

### 5️⃣ Use a `do–while` Loop

The program must use a **do--while loop** to control repetition.

------------------------------------------------------------------------

## 🖥️ Sample Output

    Enter user type (R/C/I): R
    Enter units consumed: 250

    === Electricity Bill ===
    User Type: R
    Units: 250
    Bill Amount: $30.00

    Do you want to calculate another bill? (y/n): y

    Enter user type (R/C/I): C
    Enter units consumed: 100

    === Electricity Bill ===
    User Type: C
    Units: 100
    Bill Amount: $20.00

    Do you want to calculate another bill? (y/n): n

    Goodbye! Thanks for using the Electricity Bill Generator.
