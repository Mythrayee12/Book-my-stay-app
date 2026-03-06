package models;

/**
 * Suite room implementation.
 */
public class SuiteRoom extends Room {

    public SuiteRoom() {
        super(2, 50.0, 250.0, "Suite");
    }

    @Override
    public void displayRoom() {
        System.out.println("Suite Room - " + numberOfBeds + " beds, " + size + " sqm, $" + price + " per night");
    }
}