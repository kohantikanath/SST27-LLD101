public class DefaultTaxCalculator implements TaxCalculator {
    private final double taxRate = 0.18;

    @Override
    public double calculate(double subtotal) {
        return subtotal + subtotal * taxRate;
    }
}
