package f.object.ex4;

// 이름, 나이, 수학점수, 영어점수, 국어점수를 데이터를 가지고 있는 객체를 만들어라
// 데이터는 직접 접근을 허용하지 않으며 모두 간접적으로 set / get을 해 줄 수 있도록 작성해라
// 모든 데이터를 매개변수로 받아 초기화하면서 객체를 생성할 수 있는 생성자를 작성
public class Student {
	
	// 필드 영역(데이터)
	private String name;
	private int age;
	private int matScore;
	private int engScore;
	private int gukScore;
	
	// 생성자
	public Student() {}
	
	public Student(String name, int age, int matScore, int engScore, int gukScore) {
		this.name = name;
		this.age = age;
		this.matScore = matScore;
		this.engScore = engScore;
		this.gukScore = gukScore;
	}
	
	// 메소드 영역(기능)
	// getter, setter
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if(age < 1) {
			this.age = 1;
			return;		// 메소드 종료
		}
		this.age = age;
	}

	public int getMatScore() {
		return this.matScore;
	}

	public void setMatScore(int matScore) {
		if(matScore < 1) {
			this.matScore = 1;
			return;		// 메소드 종료
		}
		this.matScore = matScore;
	}

	public int getEngScroe() {
		return this.engScore;
	}

	public void setEngScroe(int engScore) {
		if(engScore < 0) {
			this.engScore = 0;
			return;		// 메소드 종료
		}
		this.engScore = engScore;
	}

	public int getGukScore() {
		return this.gukScore;
	}

	public void setGukScore(int gukScore) {
		if(gukScore < 0) {
			this.gukScore = 0;
			return;		// 메소드 종료
		}
		this.gukScore = gukScore;
	}
	
	public double getEvg() {
		double evg = (this.matScore + this.engScore + this.gukScore) / 3.0;
		return evg;
	}
	
	public void printEvg() {
		System.out.println(this.getName() + "님의 평균은 " + this.getEvg() + "입니다.");
	}
	
}
