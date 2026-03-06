package models;

public class Room {

    private int roomNumber;
    private String type;
    private boolean available;

    public Room(int roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.available = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void bookRoom() {
        available = false;
    }

    public void freeRoom() {
        available = true;
    }

    public String getType() {
        return type;
    }

    public void releaseRoom() {
        available = true;
    }

    public void displayRoom() {
        System.out.println("Room " + roomNumber + " (" + type + ") - " + (available ? "Available" : "Booked"));
    }
}