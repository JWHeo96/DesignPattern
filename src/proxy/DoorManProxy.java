package proxy;

public class DoorManProxy {
	
	// 컴포지션
	private DoorMan doorMan;
	
	public DoorManProxy(DoorMan doorMan) {
		this.doorMan = doorMan;
	}
	
	public void getOut(Animal animal) {
		System.out.println("Hello");
		doorMan.getOut(animal);
	}
}
