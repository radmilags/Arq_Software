public class OrderPrinter {
    public void printOrder(Order order) {
        System.out.println("Order ID: " + order.getOrderId());
        for (Item item : order.getItems()) {
            System.out.println("Item: " + item.getName() + ", Price: " + item.getPrice());
        }
    }
}
