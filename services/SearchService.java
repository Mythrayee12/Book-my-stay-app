package services;

import models.*;
import java.util.*;

/**
 * Search service for viewing available rooms.
 * Provides read-only access to inventory and room information.
 */
public class SearchService {

    private RoomInventory inventory;
    private List<Room> roomTypes;

    /**
     * Constructor - Initialize with inventory and room types.
     * @param inventory The room inventory
     */
    public SearchService(RoomInventory inventory) {
        this.inventory = inventory;
        this.roomTypes = Arrays.asList(
            new SingleRoom(),
            new DoubleRoom(),
            new SuiteRoom()
        );
    }

    /**
     * Search and display available rooms.
     */
    public void searchAvailableRooms() {
        System.out.println("\nAvailable Rooms:");

        for (Room room : roomTypes) {
            int available = inventory.getAvailability(room.getType());
            if (available > 0) {
                room.displayRoom();
                System.out.println("Available count: " + available);
            }
        }
    }
}