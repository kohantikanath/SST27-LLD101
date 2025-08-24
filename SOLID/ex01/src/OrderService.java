public class OrderService {
    private NotificationService notificationService;
    private TaxCalculator taxCalculator;

    public OrderService(NotificationService notificationService, TaxCalculator taxCalculator) {
        this.notificationService = notificationService;
        this.taxCalculator = taxCalculator;
    }

    void checkout(String customerEmail, double subtotal) {
        double total = taxCalculator.calculate(subtotal);
        notificationService.send(customerEmail, "Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
    }
}