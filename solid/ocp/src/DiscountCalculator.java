public class DiscountCalculator {
    public double calculate(Order order, String customerType) {
        if (customerType.equals("regular")) {
            return order.calculateTotal() * 0.05;
        } else if (customerType.equals("vip")) {
            return order.calculateTotal() * 0.1;
        } else {
            return 0;
        }
    }
}