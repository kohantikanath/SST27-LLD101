public class Demo03 {
    public static void main(String[] args) {
        Shipment shipment = new Shipment("STANDARD", 10);
        ShippingCostCalculator calculator = new ShippingCostCalculator(new StandardShipping());
        double cost = calculator.calculateShippingCost(shipment);
        System.out.println("Shipping Cost: " + cost);
    }
}
