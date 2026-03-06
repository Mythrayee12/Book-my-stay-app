package models;

/**
 * Abstract class representing a hotel room.
 * Defines common attributes and behavior for all room types.
 */
public abstract class Room {

    protected int numberOfBeds;
    protected double size; // in square meters
    protected double price; // per night
    protected String type;

    /**
     * Constructor for Room.
     * @param numberOfBeds Number of beds in the room
     * @param size Room size in square meters
     * @param price Price per night
     * @param type Room type
     */
    public Room(int numberOfBeds, double size, double price, String type) {
        this.numberOfBeds = numberOfBeds;
        this.size = size;
        this.price = price;
        this.type = type;
    }

    /**
     * Get room type.
     * @return Room type
     */
    public String getType() {
        return type;
    }

    /**
     * Get price per night.
     * @return Price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Display room details.
     */
    public abstract void displayRoom();
}