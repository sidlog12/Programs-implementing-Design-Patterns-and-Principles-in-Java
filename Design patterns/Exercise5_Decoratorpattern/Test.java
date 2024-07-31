package decoratorpattern;

public class Test {
	 public static void main(String[] args) {
	        Notifier notifier = new EmailNotifier();
	        notifier = new SMSNotifierDecorator(notifier);
	        notifier.send("Hi guys!");
	    }
}
