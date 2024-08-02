package test.t240716.object1;

public class Student extends Human{
	private String number;
	private String major;
	
	Student() {
		super();
	}

	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return super.toString() + " 학번 : " + this.number + " 전공 : " + this.major;
	}
	
	public void test() {
		System.out.println( this.getName()+ " 테스트");
	}
	
}
