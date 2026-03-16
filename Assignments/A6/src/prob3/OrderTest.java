package prob3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrderTest {
    public static void main(String[] args) {
        // a) Create an ArrayList<Order>
        List<Order> orders = new ArrayList<>();

        // b) add() at least five Order objects
        Order o1 = new Order("O100", "Carlos", 45.0);
        Order o2 = new Order("O101", "Ana", 120.0);
        Order o3 = new Order("O102", "Bruno", 75.5);
        Order o4 = new Order("O103", "Daniela", 30.0);
        Order o5 = new Order("O104", "Eduarda", 60.0);

        orders.add(o1);
        orders.add(o2);
        orders.add(o3);
        orders.add(o4);
        orders.add(o5);

        System.out.println("After adding 5 orders:");
        printList(orders);

        // c) Delete an object by instance
        orders.remove(o3);

        System.out.println("\nAfter removing one order by instance:");
        printList(orders);

        // d) Print the size of the list
        System.out.println("\nSize of list: " + orders.size());

        // e) Retrieve an Order by position and print it
        Order retrieved = orders.get(1);
        System.out.println("\nOrder at index 1: " + retrieved);

        // f) Update the details of an Order by position
        orders.set(2, new Order("O105", "Fernanda", 88.0));

        System.out.println("\nAfter updating index 2:");
        printList(orders);

        // h) Sort by totalAmount (ascending) using a Comparator consistent with equals
        // Since equals uses orderId, make comparator compare totalAmount first,
        // then orderId to avoid returning 0 for non-equal objects.
        Comparator<Order> byTotalAmount =
                Comparator.comparingDouble(Order::getTotalAmount) // Primary Key
                        .thenComparing(Order::getOrderId); // Secondary key

        orders.sort(byTotalAmount);

        System.out.println("\nSorted by totalAmount ascending:");
        printList(orders);

        // i) Filter orders with totalAmount > 50.0
        List<Order> moreThan50 = listMoreThan50(orders);

        // sort filtered result by customerName A->Z
        moreThan50.sort(
                Comparator.comparing(Order::getCustomerName)
                        .thenComparing(Order::getOrderId)
        );

        System.out.println("\nFiltered totalAmount > 50 and sorted by customerName:");
        printList(moreThan50);
    }

    public static List<Order> listMoreThan50(List<Order> list) {
        List<Order> result = new ArrayList<>();
        if (list == null) return result;

        for (Order order : list) {
            if (order != null && order.getTotalAmount() > 50.0) {
                result.add(order);
            }
        }
        return result;
    }

    public static void printList(List<Order> list) {
        for (Order order : list) {
            System.out.println(order);
        }
    }
}