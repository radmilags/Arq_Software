import java.util.List;

public class Order {
    private int orderId;
    private List<Item> items;

    public Order(int orderId, List<Item> items) {
        this.orderId = orderId;
        this.items = items;
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPreco();
        }
        return total;
    }

    public void printOrder() {
        System.out.println("Order ID: " + orderId);
        for (Item item : items) {
            System.out.println("Item: " + item.getNome() + ", Preco: " + item.getPreco());
        }
    }

    public void saveToDatabase() {
        // Simulando a gravação no banco de dados
        System.out.println("Order " + orderId + " saved to database");
    }
}