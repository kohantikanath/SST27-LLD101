public class StandardShipping implements ShippingStrategy {
    @Override
    public double calculateCost(Shipment shipment) {
        // Original: cost = weight * 8.0
        return shipment.weightKg * 8.0;
    }
}