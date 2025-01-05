package decorator;

import decorator.notification.BasicNotifier;
import decorator.notification.EmailNotifier;
import decorator.notification.Notifier;
import decorator.notification.SmsNotifier;

/*
 * 데코레이터 패턴 (장식하다)
 * (A) -> B(A) -> C(B(A))
 */
public class App {

	public static void main(String[] args) {
//		Notifier notifier = new BasicNotifier();
//		notifier.send();
//		System.out.println("...end");
		
//		Notifier emailNotifier = new EmailNotifier(new BasicNotifier());
//		emailNotifier.send();
//		System.out.println("...end");
		
//		Notifier smsNotifier = new SmsNotifier(new BasicNotifier());
//		smsNotifier.send();
//		System.out.println("...end");
		
		// 1. 전체 알림 (기본 알림 -> 문자 알림 -> 이메일 알림)
		Notifier allNotifier = new EmailNotifier(new SmsNotifier(new BasicNotifier()));
		allNotifier.send();
		System.out.println("...end");
		
		// 2. 전체 알림 (기본 알림 -> 이메일 알림 -> 문자 알림)
		Notifier allNotifier2 = new SmsNotifier(new EmailNotifier(new BasicNotifier()));
		allNotifier2.send();
		System.out.println("...end");
		
		// 3. 전체 알림 (기본 알림 -> ~~~~~~)
		Notifier allNotifier3 = new SmsNotifier(new EmailNotifier(new EmailNotifier(new BasicNotifier())));
		allNotifier3.send();
		System.out.println("...end");
		
		// 4. 기본 알림
		Notifier basicNotifier = new BasicNotifier();
		basicNotifier.send();
		System.out.println("....end");
		
		// 5. 기본 알림 + 문자 알림
		Notifier smsNotifier = new SmsNotifier(new BasicNotifier());
		smsNotifier.send();
		System.out.println("....end");
		
		// 6. 기본 알림 + 이메일 알림
		Notifier emailNotifier = new EmailNotifier(new BasicNotifier());
		emailNotifier.send();
		System.out.println("....end");
		
		// 7. 이메일 알림
		Notifier onlyEmailNotifier = new EmailNotifier();
		onlyEmailNotifier.send();
		System.out.println("....end");
		
		// 8. 문자 알림
		Notifier onlySmsNotifier = new SmsNotifier();
		onlySmsNotifier.send();
		System.out.println("....end");
	
		// 9. 문자 알림 + 이메일 알림
		Notifier smsEmailNotifier = new EmailNotifier(new SmsNotifier());
		smsEmailNotifier.send();
		System.out.println("...end");
	}

}
