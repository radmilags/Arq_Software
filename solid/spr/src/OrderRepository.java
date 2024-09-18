public class OrderRepository {
    public void saveToDatabase(Order order) {
        System.out.println("Order " + order.getOrderId() + " saved to database");
    }
}
