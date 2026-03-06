package models;

/**
 * Represents a guest's booking request.
 */
public class Reservation {

    private String guestName;
    private String roomType;

    /**
     * Constructor for Reservation.
     * @param guestName Guest name
     * @param roomType Requested room type
     */
    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }
}