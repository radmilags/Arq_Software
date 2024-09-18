package services;

import entities.Item;
import java.util.List;

public class CalcOrder {

    private List<Item> items; 
    private double total = 0;

    // Construtor
    public CalcOrder(List<Item> items) {
        this.items = items;
    }

    // Método para calcular o total
    public double calculateTotal() {
        for (Item item : items) {
            total += item.getPreco();
        }
        return total;
    }
    
}