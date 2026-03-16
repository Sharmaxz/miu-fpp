package problem4;

public class TestTicketingSystem {
     static void main() {
        TicketingSystem system = new TicketingSystem();

        system.addTicket("Cannot login to account");
        system.addTicket("Payment issue");
        system.addTicket("Website is too slow");

        system.viewNextTicket();
        system.processTicket();
        system.viewNextTicket();

        system.addTicket("I forgot my password");

        system.displayAllTickets();

        System.out.println("Queue size: " + system.size());

        system.processTicket();
        system.processTicket();
        system.processTicket();
        system.processTicket(); // No Tickets!

        System.out.println("Is queue empty? " + system.isEmpty());
    }
}