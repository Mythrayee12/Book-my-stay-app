package models;

public class Customer {
    private int id;
    private String name;
    private int priority;

    public Customer(int id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getPriority() {
        return priority;
    }
}