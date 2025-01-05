package templateMethod;

import templateMethod.teacher.JavaTeacher;
import templateMethod.teacher.PythonTeacher;
import templateMethod.teacher.Teacher;

public class App {
	
	public static void start(Teacher t) {
		t.startTeach();
	}

	public static void main(String[] args) {
		JavaTeacher t1 = new JavaTeacher();
		start(t1);
		
		PythonTeacher t2 = new PythonTeacher();
		start(t2);
	}

}
