package org.example.Head03_OOP.example03;

public class Order {
    private String orderId;
    private boolean isPaid;
    private String name;

    public Order(String orderId, boolean isPaid, String name) {
        this.orderId = orderId;
        this.isPaid = isPaid;
        this.name = name;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }
}
