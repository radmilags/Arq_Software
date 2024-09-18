package main.java.services;

import entities.Order;

public class OrderRepository {
    public void saveToDatabase(Order order) {
        // Simulando a gravação no banco de dados
        System.out.println("Order " + order.getOrderId() + " saved to database");
    }
}