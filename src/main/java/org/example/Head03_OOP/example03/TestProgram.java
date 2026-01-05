package org.example.Head03_OOP.example03;

import java.awt.*;

public class TestProgram {
    public  static  void main(String[] args) {
      //  Order order = new Order();

        Order order = new Order("1212", true, "피자");
        System.out.println(order.getOrderId());
        System.out.println(order.isPaid());
        System.out.println(order.getName());

        order.setOrderId("김김김");
        order.setPaid(false);
        order.setName("피자");

        System.out.println(order.getOrderId());
        System.out.println(order.isPaid());
        System.out.println(order.getName());
    }
}
