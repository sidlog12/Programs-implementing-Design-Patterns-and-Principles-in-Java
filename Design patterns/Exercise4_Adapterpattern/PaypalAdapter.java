package test;

public class PaypalAdapter implements Paymentprocessor{
	
	 private PaypalGateway payPalGateway;

	    public PaypalAdapter() {
	        this.payPalGateway = new PaypalGateway();
	    }

	    @Override
	    public void processPayment(double amount) {
	        payPalGateway.sendPayment(amount);
	    }

}
