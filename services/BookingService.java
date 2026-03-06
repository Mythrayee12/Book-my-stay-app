package services;

import models.*;
import java.util.*;

/**
 * Handles booking confirmations and room allocations.
 * Ensures no double booking through unique room ID assignment.
 */
public class BookingService {

    private RoomInventory inventory;
    private BookingRequestQueue requestQueue;
    private HashMap<String, Set<String>> allocatedRooms;
    private int roomIdCounter;

    /**
     * Constructor - Initialize booking service.
     * @param inventory The room inventory
     * @param requestQueue The booking request queue
     */
    public BookingService(RoomInventory inventory, BookingRequestQueue requestQueue) {
        this.inventory = inventory;
        this.requestQueue = requestQueue;
        this.allocatedRooms = new HashMap<>();
        this.roomIdCounter = 100;

        // Initialize sets for each room type
        allocatedRooms.put("Single", new HashSet<>());
        allocatedRooms.put("Double", new HashSet<>());
        allocatedRooms.put("Suite", new HashSet<>());
    }

    /**
     * Process booking requests and allocate rooms.
     */
    public void processBookings() {
        System.out.println("\nProcessing Booking Requests:");

        while (!requestQueue.isEmpty()) {
            Reservation reservation = requestQueue.getNextRequest();

            if (inventory.getAvailability(reservation.getRoomType()) > 0) {
                // Generate unique room ID
                String roomId = reservation.getRoomType().substring(0, 1) + roomIdCounter++;
                allocatedRooms.get(reservation.getRoomType()).add(roomId);

                // Update inventory
                int current = inventory.getAvailability(reservation.getRoomType());
                inventory.updateAvailability(reservation.getRoomType(), current - 1);

                System.out.println("Confirmed: " + reservation.getGuestName() + " - Room " + roomId);
            } else {
                System.out.println("Unavailable: " + reservation.getGuestName() + " - " + reservation.getRoomType());
            }
        }
    }

    /**
     * Display allocated rooms.
     */
    public void displayAllocations() {
        System.out.println("\nAllocated Rooms:");
        for (String type : allocatedRooms.keySet()) {
            System.out.println(type + ": " + allocatedRooms.get(type));
        }
    }
}