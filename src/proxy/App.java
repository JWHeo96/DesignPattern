package proxy;

public class App {

	public static void main(String[] args) {
		
		Mouse m = new Mouse();
		Cat c = new Cat();
		DoorManProxy dm = new DoorManProxy(new DoorMan());

		dm.getOut(m);
		dm.getOut(c);
	}

}
