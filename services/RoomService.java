package services;

import models.*;
import java.util.*;

public class RoomService {

    private HashMap<Integer, Room> rooms;

    public RoomService() {
        rooms = new HashMap<>();
    }

    // Add a new room
    public void addRoom(int roomNumber, String type) {

        if (rooms.containsKey(roomNumber)) {
            System.out.println("Room already exists.");
            return;
        }

        Room room = new Room(roomNumber, type);
        rooms.put(roomNumber, room);

        System.out.println("Room " + roomNumber + " added.");
    }

    // Get room by number
    public Room getRoom(int roomNumber) {
        return rooms.get(roomNumber);
    }

    // Show all rooms
    public void showAllRooms() {

        System.out.println("\nAll Rooms:");

        for (Room room : rooms.values()) {
            room.displayRoom();
        }
    }

    // Show available rooms
    public void showAvailableRooms() {

        System.out.println("\nAvailable Rooms:");

        for (Room room : rooms.values()) {
            if (room.isAvailable()) {
                room.displayRoom();
            }
        }
    }

    // Search rooms by type
    public void searchRoomByType(String type) {

        System.out.println("\nRooms of type: " + type);

        for (Room room : rooms.values()) {

            if (room.getType().equalsIgnoreCase(type)) {
                room.displayRoom();
            }

        }
    }

    // Mark room booked
    public boolean bookRoom(int roomNumber) {

        Room room = rooms.get(roomNumber);

        if (room != null && room.isAvailable()) {
            room.bookRoom();
            return true;
        }

        return false;
    }

    // Release room
    public void releaseRoom(int roomNumber) {

        Room room = rooms.get(roomNumber);

        if (room != null) {
            room.releaseRoom();
        }
    }

    // Get all rooms collection
    public Collection<Room> getAllRooms() {
        return rooms.values();
    }
}