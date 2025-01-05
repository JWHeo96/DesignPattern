package strategy;

public class App {

	public static void main(String[] args) {
		
		Mouse m = new Mouse();
		Cat c = new Cat();
		DoorMan dm = new DoorMan();

		dm.getOut(m);
		dm.getOut(c);
	}

}
