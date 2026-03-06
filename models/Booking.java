package models;

public class Booking {

    private int bookingId;
    private Customer customer;
    private Room room;

    public Booking(int bookingId, Customer customer, Room room) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.room = room;
    }

    public int getBookingId() {
        return bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Room getRoom() {
        return room;
    }
}