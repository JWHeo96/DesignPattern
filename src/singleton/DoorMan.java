package singleton;

/*
 * 문지기를 딱 한명만 만들고 싶다.
 */
public class DoorMan {
	
	// 자바에서 static은 메인메서드를 호출하기 전에 메모리에 올라오는 객체
	private static DoorMan doorMan = new DoorMan();
	
	public static DoorMan getInstance() { // heap이 관리하는 메서드
		return doorMan;
	}
	
	private DoorMan() {
		
	}
	
	public void getOut(Animal animal) {
		System.out.println(animal.getName() + " 쫓아내");
	}
}
