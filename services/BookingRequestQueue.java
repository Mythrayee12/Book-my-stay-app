package services;

import models.*;
import java.util.*;

/**
 * Manages booking requests in FIFO order.
 * Uses Queue to preserve arrival order.
 */
public class BookingRequestQueue {

    private Queue<Reservation> requestQueue;

    /**
     * Constructor - Initialize the queue.
     */
    public BookingRequestQueue() {
        requestQueue = new LinkedList<>();
    }

    /**
     * Add a booking request to the queue.
     * @param reservation The reservation request
     */
    public void addRequest(Reservation reservation) {
        requestQueue.add(reservation);
        System.out.println("Request added for " + reservation.getGuestName() + " - " + reservation.getRoomType());
    }

    /**
     * Get the next request in FIFO order.
     * @return Next reservation or null if empty
     */
    public Reservation getNextRequest() {
        return requestQueue.poll();
    }

    /**
     * Check if queue is empty.
     * @return True if no requests
     */
    public boolean isEmpty() {
        return requestQueue.isEmpty();
    }

    /**
     * Display current queue status.
     */
    public void displayQueue() {
        System.out.println("\nCurrent Booking Requests:");
        for (Reservation res : requestQueue) {
            System.out.println(res.getGuestName() + " - " + res.getRoomType());
        }
    }
}