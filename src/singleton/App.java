package singleton;

public class App {

	public static void main(String[] args) {
		
		DoorMan dm = DoorMan.getInstance();

		dm.getOut(new Cat());
	}

}
