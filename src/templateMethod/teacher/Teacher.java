package templateMethod.teacher;

public abstract class Teacher {

	private void enter() {
		System.out.println("Enter!");
	}
	
	private void checkPerson() {
		System.out.println("checkPerson");
	}
	
	// 오버라이드(부모의 메서드를 무효화하다)
	abstract void teach();
	
	private void exit() {
		System.out.println("exit!");
	}
	
	public void startTeach() {
		enter();
		checkPerson();
		teach();
		exit();
	}
}
