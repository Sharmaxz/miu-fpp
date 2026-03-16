package problem4;

public class TicketingSystem {
    private LinkedListQueue ticketQueue;
    private int nextId;

    public TicketingSystem() {
        ticketQueue = new LinkedListQueue();
        nextId = 0;
    }

    public void addTicket(String description) {
        if (description == null || description.isEmpty()) {
            System.out.println("Ticket description cannot be empty");
            return;
        }

        Ticket ticket = new Ticket(nextId, description);
        ticketQueue.enqueue(ticket);
        nextId++;

//        System.out.println("Added: " + newTicket);
    }

    public Ticket processTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets");
            return null;
        }

        Ticket ticket = ticketQueue.dequeue();
//        System.out.println("Processed: " + ticket);
        return ticket;
    }

    // View the first ticket without removing it
    public Ticket viewNextTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets in the queue.");
            return null;
        }

        Ticket nextTicket = ticketQueue.peek();
//        System.out.println("Next ticket: " + nextTicket);
        return nextTicket;
    }

    public boolean isEmpty() {
        return ticketQueue.isEmpty();
    }

    public int size() {
        return ticketQueue.size();
    }

    public void displayAllTickets() {
        if (ticketQueue.isEmpty()) {
            System.out.println("The queue is empty");
            return;
        }

        System.out.println("Current ticket queue:");
        System.out.println(ticketQueue);
    }
}