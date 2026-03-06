package models;

/**
 * Double room implementation.
 */
public class DoubleRoom extends Room {

    public DoubleRoom() {
        super(2, 30.0, 150.0, "Double");
    }

    @Override
    public void displayRoom() {
        System.out.println("Double Room - " + numberOfBeds + " beds, " + size + " sqm, $" + price + " per night");
    }
}