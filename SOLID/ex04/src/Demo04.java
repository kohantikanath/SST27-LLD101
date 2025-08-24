
public class Demo04 {
    public static void main(String[] args) {
        PaymentMethod upi = new UpiPayment();
        PaymentMethod wallet = new WalletPayment(); 
        PaymentMethod card = new CardPayment();
        upi.pay(200.00);
        wallet.pay(300.00);
        card.pay(499.00);
    }
}
