package decorator.notification;

public class EmailNotifier implements Notifier {
	
	private Notifier notifier;
	
	public EmailNotifier() {
		
	}
	
	public EmailNotifier(Notifier notifier) {
		this.notifier = notifier;
	}
	
	@Override
	public void send() {
		if (notifier != null)
			notifier.send();
		System.out.println("Email alarm");
	}

}
