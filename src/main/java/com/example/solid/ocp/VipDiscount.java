public class VipDiscount implements DiscountStrategy {
    public double calculate(double price) {
        return price * 0.20;
    }
}