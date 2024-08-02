package test.t240709.object3;

public class Student {
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	public Student() {}
	
	public Student(int grade, int classroom, String name, double height, char gender) {
		super();
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.height = height;
		this.gender = gender;
	}
	
	public int getGrade() {
		return this.grade;
	}
	
	public int getClassroom() {
		return this.classroom;
	}
	
	public String getName() {
		return this.name;
	}
	

	public double getHeight() {
		return this.height;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void information() {
		System.out.println(this.grade + "학년 " + this.classroom + "반의 이름은 " + this.name +
				"이며 키는 " + this.height + "이며 " + this.gender + "입니다.");
	}
}
