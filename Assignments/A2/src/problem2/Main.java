package problem2;

import problem2.models.Event;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

class EventScheduler {
    private static boolean running = true;
    private static ArrayList<Event> events = new ArrayList<>();

    static void main(String[] args) {
        System.out.println("==== Welcome to the Event Scheduler ====");

        Scanner scanner = new Scanner(System.in);

        while (running) {
            mainMenu(scanner);
        }

        System.out.println("See ya next time ;)");
        scanner.close();
    }

    public static void mainMenu(Scanner scanner) {
        String message = "Choose an option below: \n1- Create a new event\n2- Check an event \n0- Exit";
        String[] options = new String[] {"0", "1", "2"};

        String option = getValidStringInput(scanner, message, options);

        switch (option) {
            case "1":
                createEventMenu(scanner);
                break;
            case "2":
                checkEventMenu(scanner);
                break;
            case "0":
                running = false;
                break;
        }
    }

    private static void createEventMenu(Scanner scanner) {
        System.out.println("=== Create a New Event ===");

        System.out.print("Event name: ");
        String name = scanner.nextLine().trim();

        LocalDate date = readValidDate(scanner, "Event date (yyyy-MM-dd): ");
        LocalTime time = readValidTime(scanner, "Event time (HH:mm): ", date);

        LocalDateTime eventDate = LocalDateTime.of(date, time);

        ZoneId timezone = ZoneId.systemDefault();

        Event event = new Event(name, eventDate, timezone);
        events.add(event);

        event.displayDetails();
        System.out.println();
    }

    public static void checkEventMenu(Scanner scanner) {
        if (events.isEmpty()) {
            System.out.println("No events created yet.\n");
            return;
        }

        StringBuilder message = new StringBuilder("Choose an event below: \n0- Return");

        ArrayList<String> options = new ArrayList<>();
        options.add("0");

        for (int i = 0; i < events.size(); i++) {
            message.append(String.format("\n%d- %s", i + 1, events.get(i).getName()));
            options.add(Integer.toString(i + 1));
        }

        String option = getValidStringInput(scanner, message.toString(), options.toArray(new String[0]));
        if (option.equals("0")) {
            System.out.println();
            return;
        }

        int index = Integer.parseInt(option) - 1;
        Event event = events.get(index);

        System.out.println("\n=== Event (System Time Zone) ===");
        event.display();

        System.out.println("\nSample Time Zones:");
        System.out.println("- America/Panama");
        System.out.println("- America/Chicago");
        System.out.println("- America/Indiana/Indianapolis");
        System.out.println("- America/Santiago");
        System.out.println("- America/Phoenix");

        ZoneId targetZone = readValidZoneId(scanner, "\nEnter a time zone to convert (or 0 to return): ");
        if (targetZone == null) {
            System.out.println();
            return;
        }

        System.out.println("\n=== Event (Converted Time Zone) ===");
        event.displayInTimeZone(targetZone);
        System.out.println();
    }

    //region UTILS

    private static String getValidStringInput(Scanner scanner, String prompt, String[] options) {
        if (options.length == 0) {
            throw new RuntimeException("Error(getValidStringInput): Options need to have at least one value.");
        }

        while (true) {
            System.out.println(prompt);
            String userChoice = scanner.nextLine();

            for (String option : options) {
                if (option.equals(userChoice)) {
                    return userChoice;
                }
            }

            System.out.println("Please, select a valid option: " + Arrays.toString(options));
        }
    }

    private static LocalDate readValidDate(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                LocalDate date = LocalDate.parse(input, DateTimeFormatter.ISO_LOCAL_DATE);

                LocalDate today = LocalDate.now();
                if (date.isBefore(today)) {
                    System.out.println("Date must be today or in the future.");
                    continue;
                }

                return date;

            } catch (DateTimeParseException e) {
                System.out.println("Invalid date. Use yyyy-MM-dd (example: 2000-01-30).");
            }
        }
    }

    private static LocalTime readValidTime(Scanner scanner, String prompt, LocalDate eventDate) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                LocalTime time = LocalTime.parse(input, DateTimeFormatter.ofPattern("HH:mm"));

                if (eventDate.isEqual(LocalDate.now())) {
                    LocalTime now = LocalTime.now();
                    if (time.isBefore(now)) {
                        System.out.println("Time must be later than the current time (for today).");
                        continue;
                    }
                }

                return time;

            } catch (DateTimeParseException e) {
                System.out.println("Invalid time. Use HH:mm.");
            }
        }
    }

    private static ZoneId readValidZoneId(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            if (input.equals("0")) return null;

            try {
                return ZoneId.of(input);
            } catch (DateTimeException e) {
                System.out.println("Invalid time zone. Example: America/Chicago");
            }
        }
    }

    //endregion UTILS
}