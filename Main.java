import models.*;
import services.*;
public class Main {

    public static void main(String[] args) {

        BookingService hotel = new BookingService();

        hotel.addRoom(101, "Single");
        hotel.addRoom(102, "Double");
        hotel.addRoom(103, "Suite");

        Customer c1 = new Customer(1, "Amit", 1);
        Customer c2 = new Customer(2, "Neha", 2);
        Customer c3 = new Customer(3, "Rahul", 1);

        hotel.showRooms();

        hotel.bookRoom(c1, 101);
        hotel.bookRoom(c2, 101);
        hotel.bookRoom(c3, 101);

        hotel.cancelBooking(1);

        hotel.processQueues();

        hotel.undoLastBooking();
    }
}