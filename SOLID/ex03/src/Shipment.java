public class Shipment {
    public String type;
    public double weightKg;

    public Shipment(String type, double w) {
        this.type = type;
        this.weightKg = w;
    }

    public double getWeight() {
        return weightKg;
    }
}