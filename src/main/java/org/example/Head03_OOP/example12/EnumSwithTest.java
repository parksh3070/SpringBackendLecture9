package org.example.Head03_OOP.example12;

public class EnumSwithTest {
    public enum OrderStatus {
        ORDERED, READY, DELIVERED
    }

    public static void printStatus(OrderStatus status) {
        switch (status) {
            case ORDERED:
                System.out.println();
                break;
            case READY:
                System.out.println();
                break;
            case DELIVERED:
                System.out.println();
                break;

        }
    }

    public static void main(String[] args) {
        printStatus(OrderStatus.READY);
    }
}
