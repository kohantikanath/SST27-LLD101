public class ShippingCostCalculator {
    private ShippingStrategy strategy;

    public ShippingCostCalculator(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateShippingCost(Shipment shipment) {
        return strategy.calculateCost(shipment);
    }
}
