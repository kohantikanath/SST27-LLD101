public class OvernightShipping implements ShippingStrategy {
    @Override
    public double calculateCost(Shipment shipment) {
        // Original: cost = weight * 12.0
        return shipment.weightKg * 12.0;
    }
}