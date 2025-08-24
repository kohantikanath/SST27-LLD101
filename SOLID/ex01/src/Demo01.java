
public class Demo01 {
    public static void main(String[] args) {
        NotificationService notificationService = new EmailService();
        TaxCalculator taxCalculator = new DefaultTaxCalculator();
        OrderService orderService = new OrderService(notificationService, taxCalculator);
        orderService.checkout("a@shop.com", 100.0);
    }
}
