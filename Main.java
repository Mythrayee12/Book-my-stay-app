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
     * Creates room objects and displays their details with centralized inventory.
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Booking System v1.0");

        // Create room objects
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Initialize centralized inventory
        RoomInventory inventory = new RoomInventory();

        // Display room details and availability
        System.out.println("\nRoom Details:");
        singleRoom.displayRoom();
        System.out.println("Available: " + inventory.getAvailability("Single"));

        doubleRoom.displayRoom();
        System.out.println("Available: " + inventory.getAvailability("Double"));

        suiteRoom.displayRoom();
        System.out.println("Available: " + inventory.getAvailability("Suite"));

        // Display full inventory
        inventory.displayInventory();
    }
}