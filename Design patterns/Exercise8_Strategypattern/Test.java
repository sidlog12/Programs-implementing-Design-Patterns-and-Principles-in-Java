package strategypatternmanagement;

public class Test {
	public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.executePayment(100.0);

        context.setPaymentStrategy(new PayPalPayment());
        context.executePayment(200.0);
	}
}
