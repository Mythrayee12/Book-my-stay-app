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
     * Creates room objects and displays available rooms through search service.
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Booking System v1.0");

        // Initialize centralized inventory
        RoomInventory inventory = new RoomInventory();

        // Initialize search service
        SearchService searchService = new SearchService(inventory);

        // Perform room search
        searchService.searchAvailableRooms();

        // Display full inventory
        inventory.displayInventory();
    }
}