package strategypatternmanagement;

public interface PaymentStrategy {
	   void pay(double amount);
	}

	class CreditCardPayment implements PaymentStrategy {
	    public void pay(double amount) {
	        System.out.println("Paying " + amount + " using Credit Card.");
	    }
	}

	class PayPalPayment implements PaymentStrategy {
	    public void pay(double amount) {
	        System.out.println("Paying " + amount + " using PayPal.");
	    }
	}

	class PaymentContext {
	    private PaymentStrategy paymentStrategy;

	    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
	        this.paymentStrategy = paymentStrategy;
	    }

	    public void executePayment(double amount) {
	        paymentStrategy.pay(amount);
	    }

}
