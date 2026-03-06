package services;

import models.*;
import java.util.*;

public class BookingService {

    private HashMap<Integer, Room> rooms = new HashMap<>();

    public void addRoom(int number, String type) {
        rooms.put(number, new Room(number, type));
        System.out.println("Room added: " + number);
    }

    public void showRooms() {
        for (Room r : rooms.values()) {
            System.out.println("Room: " + r.getRoomNumber());
        }
    }

    public void bookRoom(Customer customer, int roomNumber) {

        Room room = rooms.get(roomNumber);

        if (room != null && room.isAvailable()) {
            room.bookRoom();
            System.out.println("Room booked for " + customer.getName());
        } else {
            System.out.println("Room not available");
        }
    }

    public void cancelBooking(int id) {
        System.out.println("Booking cancelled: " + id);
    }

    public void processQueues() {
        System.out.println("Processing waiting list...");
    }

    public void undoLastBooking() {
        System.out.println("Undo last booking");
    }
}