package decorator.notification;

// 레퍼가 없는 Decorator
public class BasicNotifier implements Notifier {
	
	// 의존하면 안된다 (생성자 필요 x)
	
	@Override
	public void send() {
		System.out.println("default alarm");
	}

}
