package test;

public class GpayAdapter implements Paymentprocessor{
	 private GpayGateway gpayGateway;

	    public GpayAdapter() {
	        this.gpayGateway = new GpayGateway();
	    }

	    @Override
	    public void processPayment(double amount) {
	        gpayGateway.makePayment(amount);
	    }

}
