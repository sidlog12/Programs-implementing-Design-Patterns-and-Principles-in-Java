package test;
import java.util.Scanner;

public class PaymentProcessingSystem {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount to be paid:");
        double amount = sc.nextDouble();
        
        System.out.println("Choose a payment gateway (1 for Gpay, 2 for PayPal):");
        int choice = sc.nextInt();

        Paymentprocessor paymentProcessor;

        switch (choice) {
            case 1:
                paymentProcessor = new GpayAdapter();
                break;
            case 2:
                paymentProcessor = new PaypalAdapter();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        paymentProcessor.processPayment(amount);
        sc.close();
    }

}
