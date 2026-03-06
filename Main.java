import models.*;
import services.*;

/**
 * Hotel Booking System - Entry point for the application.
 * This class demonstrates the basic execution flow of a Java program.
 *
 * @author Your Name
 * @version 1.0
 */
public class Main {

    /**
     * Main method - Entry point of the application.
     * Demonstrates booking request intake and queuing.
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Booking System v1.0");

        // Initialize services
        RoomInventory inventory = new RoomInventory();
        SearchService searchService = new SearchService(inventory);
        BookingRequestQueue requestQueue = new BookingRequestQueue();

        // Perform room search
        searchService.searchAvailableRooms();

        // Add booking requests
        requestQueue.addRequest(new Reservation("Alice", "Single"));
        requestQueue.addRequest(new Reservation("Bob", "Double"));
        requestQueue.addRequest(new Reservation("Charlie", "Suite"));

        // Display queue
        requestQueue.displayQueue();

        // Display inventory
        inventory.displayInventory();
    }
}