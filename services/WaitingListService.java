package services;

import models.*;
import java.util.*;

public class WaitingListService {

    private Queue<Customer> normalQueue;
    private PriorityQueue<Customer> vipQueue;

    public WaitingListService() {
        normalQueue = new LinkedList<>();
        vipQueue = new PriorityQueue<>();
    }

    // Add customer to appropriate queue
    public void addCustomer(Customer customer) {

        if (customer.getPriority() > 1) {
            vipQueue.add(customer);
            System.out.println(customer.getName() + " added to VIP waiting list.");
        } 
        else {
            normalQueue.add(customer);
            System.out.println(customer.getName() + " added to normal waiting list.");
        }
    }

    // Get next customer (VIP first)
    public Customer getNextCustomer() {

        if (!vipQueue.isEmpty())
            return vipQueue.poll();

        if (!normalQueue.isEmpty())
            return normalQueue.poll();

        return null;
    }

    // Check if waiting list empty
    public boolean isEmpty() {
        return vipQueue.isEmpty() && normalQueue.isEmpty();
    }

    // Display waiting list
    public void showWaitingList() {

        System.out.println("\nVIP Waiting List:");
        for (Customer c : vipQueue)
            System.out.println(c.getName());

        System.out.println("\nNormal Waiting List:");
        for (Customer c : normalQueue)
            System.out.println(c.getName());
    }
}