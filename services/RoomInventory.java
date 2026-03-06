package services;

import java.util.HashMap;

/**
 * Centralized inventory management for room availability.
 * Uses HashMap to store and manage room counts by type.
 */
public class RoomInventory {

    private HashMap<String, Integer> availability;

    /**
     * Constructor - Initialize room availability.
     */
    public RoomInventory() {
        availability = new HashMap<>();
        availability.put("Single", 5);
        availability.put("Double", 3);
        availability.put("Suite", 2);
    }

    /**
     * Get current availability for a room type.
     * @param roomType The room type
     * @return Available count
     */
    public int getAvailability(String roomType) {
        return availability.getOrDefault(roomType, 0);
    }

    /**
     * Update availability for a room type.
     * @param roomType The room type
     * @param count New count
     */
    public void updateAvailability(String roomType, int count) {
        availability.put(roomType, count);
    }

    /**
     * Display current inventory state.
     */
    public void displayInventory() {
        System.out.println("\nCurrent Inventory:");
        for (String type : availability.keySet()) {
            System.out.println(type + ": " + availability.get(type) + " available");
        }
    }
}