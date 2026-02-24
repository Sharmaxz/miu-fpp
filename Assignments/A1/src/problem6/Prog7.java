
import java.util.Scanner;

class Prog7{
    public static void main( String [] args) {

        //scanner
        Scanner scanner = new Scanner(System.in);

        boolean nextBill = true;
        do{
            //intake user type, and validate input.
            System.out.print("Enter user Type (R/C/I)");
            while(!scanner.hasNext("[RCI]")){
                System.out.println("Invalid input, please enter R, C, or I");
                scanner.nextLine();
            }
            String userType = scanner.next();

            //intake integer, ensure it's integer
            System.out.print("Enter units consumed: ");
            while(!scanner.hasNextInt()){
                System.out.println("Invalid input, please enter an integer for units consumed");
                scanner.nextLine();
            } 
            int unitsConsumed = scanner.nextInt();

            //utilize switch to determine values:
            double cost;
            switch (userType) {
                case "R" -> cost = 0.12 * (double) unitsConsumed;
                case "C" -> cost = 0.20 * (double) unitsConsumed;
                case "I" -> cost = 0.35 * (double) unitsConsumed;
                default -> {
                    cost = 0.00;
                    System.out.println("Invalid input, please ctrl+c, and try again");
                }
            }

            //print report
            System.out.println("=== Electricity Bill ===\n");
            System.out.println("User Type: " + userType + "\n");  
            System.out.println("Units: " + unitsConsumed + "\n");
            System.out.printf("Bill Amount: $%.2f\n\n",cost);


            //clear buffer
            scanner.nextLine();

            //ask if they want to calculate another bill.
            System.out.print("Do you want to calculate another bill? (y/n)\n");
            String response = scanner.nextLine();
            while(!response.toLowerCase().equals("y") && !response.toLowerCase().equals("n")){
                System.out.println("Invalid input, please enter y or n");
                response = scanner.nextLine();
            }

            if(response.toLowerCase().equals("n")){
                nextBill = false;
            }

        } while (nextBill) ;

        //close scanner after done.
        scanner.close();
        System.out.println("Goodbye! Thanks for using the Electricity Bill Generator.");
    }


}