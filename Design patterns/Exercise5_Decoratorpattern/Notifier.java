package decoratorpattern;

public interface Notifier {
	void send(String message);
	}

	class EmailNotifier implements Notifier {
	    public void send(String message) {
	        System.out.println("Sending email: " + message);
	    }
	}

	abstract class NotifierDecorator implements Notifier {
	    protected Notifier notifier;

	    public NotifierDecorator(Notifier notifier) {
	        this.notifier = notifier;
	    }

	    public void send(String message) {
	        notifier.send(message);
	    }
	}

	class SMSNotifierDecorator extends NotifierDecorator {
	    public SMSNotifierDecorator(Notifier notifier) {
	        super(notifier);
	    }

	    public void send(String message) {
	        super.send(message);
	        System.out.println("Sending SMS: " + message);
	    }


}
