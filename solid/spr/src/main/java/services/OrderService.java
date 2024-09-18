package main.java.services;

import entities.Order;

public class OrderService {
    public double calculateTotal(Order order) {
        double total = 0;
        for (Item item : order.getItems()) {
            total += item.getPrice();
        }
        return total;
    }
}