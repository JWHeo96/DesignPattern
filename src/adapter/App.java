package adapter;

/*
 * 어댑터 패턴
 * 1. 외부 요소를 기존 시스템에 재사용하고 싶지만 아직 만들어지지 않은 경우 - OuterTiger가 만들어지지 않음.
 * 2. 외부 요소를 기존 시스템에 재사용하고 싶지만 호환되지 않는 경우 (실습)
 */
public class App {

	public static void main(String[] args) {
		
		Mouse m = new Mouse();
		Cat c = new Cat();
		
		TigerAdapter ot = new TigerAdapter(new OuterTiger());
		
		DoorMan dm = new DoorMan();

		dm.getOut(m);
		dm.getOut(c);
		dm.getOut(ot);
	}

}
