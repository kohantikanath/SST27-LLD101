public class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculateCost(Shipment shipment) {
        return shipment.weightKg * 9.6;
    }
}