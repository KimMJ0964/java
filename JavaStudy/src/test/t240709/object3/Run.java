package test.t240709.object3;

public class Run {
	public static void main(String[] args) {
		Student student01 = new Student();
		student01.setGrade(1);
		student01.setClassroom(3);
		student01.setName("김민재");
		student01.setHeight(172.5);
		student01.setGender('남');
		
		Student student02 = new Student(3, 2, "이영희", 160.5, '여');
		
		student01.information();
		student02.information();
	}
}
