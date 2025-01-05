package templateMethod.teacher;

public class JavaTeacher extends Teacher {

	// 재정의
	void teach() { // 동적 바인딩
		System.out.println("teach JAVA@@");
	}
}
