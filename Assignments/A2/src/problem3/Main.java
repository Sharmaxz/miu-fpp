package problem3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //new scanner and input
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while(true){
            System.out.println("""
                Enter F for Flight Booking
                Enter H for Hotel Booking
                Enter C for Car Rental
                """);
            input = scanner.nextLine();
            //continue asking for prompts
            switch (input) {
                case "f", "F" -> {
                    System.out.printf("\nEnter Origin: ");
                    String origin = scanner.nextLine();

                    System.out.printf("\nEnter Destination: ");
                    String destination = scanner.nextLine();

                    System.out.printf("\nEnter Distance in km (number only): ");
                    while(!scanner.hasNextDouble()){
                        // If the input is not a double, inform the user and consume the invalid input
                        System.out.printf("\nInvalid input. Please enter a distance (km).");
                        scanner.nextLine(); // Consume the invalid input to prevent an infinite loop

                    }
                    double distance =  scanner.nextDouble();
                    scanner.nextLine();
                    
                    flightBooking flight = new flightBooking(origin, destination, distance);

                    System.out.printf("\nEnter average speed (km/h, example input: 60.0): ");
                    while(!scanner.hasNextDouble()){
                        // If the input is not a double, inform the user and consume the invalid input
                        System.out.printf("\nInvalid input. Please enter a average speed (km/h) as a single number.");
                        scanner.nextLine(); // Consume the invalid input to prevent an infinite loop

                    }
                    double averageSpeed = scanner.nextDouble();

                    System.out.println("Estimated flight time: " + flight.computeFlightTime(averageSpeed));
                }
                case "h", "H" -> {
                    System.out.printf("\nEnter Hotel Name: ");
                    String hotel = scanner.nextLine();

                    System.out.printf("\nEnter number of nights: ");
                    while(!scanner.hasNextInt()){
                        // If the input is not a double, inform the user and consume the invalid input
                        System.out.printf("\nInvalid input. Please enter the number of nights as a single integer.");
                        scanner.nextLine(); // Consume the invalid input to prevent an infinite loop

                    }
                    int numNights = scanner.nextInt();
                    scanner.nextLine();//you pressed enter after getting the integer

                    System.out.printf("\nEnter price per night: ");
                    while(!scanner.hasNextDouble()){
                        // If the input is not a double, inform the user and consume the invalid input
                        System.out.printf("\nInvalid input. Please enter a price per night $/night as a single number.");
                        scanner.nextLine(); // Consume the invalid input to prevent an infinite loop

                    }
                    double pricePerNight = scanner.nextDouble();

                    hotelBooking bookedHotel = new hotelBooking(hotel, numNights, pricePerNight);
                    System.out.println("Total Hotel Cost: " + bookedHotel.totalCost());
                }
                case "c", "C" -> {
                    System.out.printf("\nEnter car model: ");
                    String model = scanner.nextLine();

                    System.out.printf("\nEnter number of days: ");
                    while(!scanner.hasNextInt()){
                        // If the input is not a double, inform the user and consume the invalid input
                        System.out.printf("\nInvalid input. Please enter the number of days as a single integer.");
                        scanner.nextLine(); // Consume the invalid input to prevent an infinite loop

                    }
                    int numDays = scanner.nextInt();
                    scanner.nextLine();//you pressed enter after getting the integer

                    System.out.printf("\nEnter rate per day: ");
                    while(!scanner.hasNextDouble()){
                        // If the input is not a double, inform the user and consume the invalid input
                        System.out.printf("\nInvalid input. Please enter a rate per day $/day as a single number.");
                        scanner.nextLine(); // Consume the invalid input to prevent an infinite loop

                    }
                    double ratePerDay = scanner.nextDouble();
                    scanner.nextLine();//you pressed enter after entering the double.

                    System.out.printf("Enter miles per day: ");
                    while(!scanner.hasNextDouble()){
                        // If the input is not a double, inform the user and consume the invalid input
                        System.out.printf("\nInvalid input. Please enter a miles per day $/day as a single number.");
                        scanner.nextLine(); // Consume the invalid input to prevent an infinite loop

                    }
                    double milesPerDay = scanner.nextDouble();

                    CarRental rental = new CarRental(model, numDays, ratePerDay, milesPerDay);
                    System.out.println("Total Rental Cost: " + rental.totalRentalCost());
                    System.out.println("Total Miles Allowed: " + rental.totalMilesAllowed());
                }
                default -> {
                    System.out.println("Please enter an option again.");
                    continue;
                }
            }

            scanner.nextLine();

            System.out.printf("\nDo you want to continue (y/n): \n");
            input = scanner.nextLine();

            while(!input.equals("n") && !input.equals("y")){
                System.out.printf("\nInvalid input. Please input 'y' or 'n': \n");
                input = scanner.nextLine();
            }

            if(input.equals("n")){
                break;
            } 


        }

        //close scanner always
        scanner.close();
    }


}
