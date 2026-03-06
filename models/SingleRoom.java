package models;

/**
 * Single room implementation.
 */
public class SingleRoom extends Room {

    public SingleRoom() {
        super(1, 20.0, 100.0, "Single");
    }

    @Override
    public void displayRoom() {
        System.out.println("Single Room - " + numberOfBeds + " bed, " + size + " sqm, $" + price + " per night");
    }
}