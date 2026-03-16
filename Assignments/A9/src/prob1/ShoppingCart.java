package prob1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity = 0;
        boolean validInput = false;

        /*
            3. Graceful retry
                o After catching an exception, prompt the user again until valid input is
                entered. (Use While loop)
         */
        while (!validInput) {
            try {
                System.out.print("Enter quantity of items to add (1-50): ");
                String input = sc.nextLine();

                // Extra validation for empty or blank input
                if (input.isBlank()) {
                    throw new IllegalArgumentException("Input cannot be empty or blank.");
                }

                // Check if input is a valid integer
                // matches method allows creating a regex to check my input
                if (!input.matches("-?\\d+")) {
                    throw new InputMismatchException("Invalid input. Please enter a whole number.");
                }

                quantity = Integer.parseInt(input);

                if (quantity < 1 || quantity > 50) {
                    throw new IllegalArgumentException("Quantity must be between 1 and 50.");
                }

                validInput = true;
            } catch (InputMismatchException e) {
                /*
                    1. Handle wrong input type
                        o If the user enters a string, decimal, or symbol instead of an integer,
                        catch InputMismatchException and display a user-friendly message.
                */
                System.out.println("Invalid input. Please enter a whole number.");
            } catch (IllegalArgumentException e) {
                /*
                    2. Handle invalid range
                        o If the quantity entered is less than 1 or greater than 50, throw and
                        handle IllegalArgumentException with a proper message.
                 */
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Successfully added " + quantity + " items to your cart!");
        sc.close();
    }
}