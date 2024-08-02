package f.object.ex3;

public class Animal {
	int age;
	String gender;
	
	Animal() {}
	
	Animal(int age, String gender) {
		this.age = age;
		this.gender = gender;
	}
	
	
	public void isMammal() {
		
	}
	
	public void introduce(String name) {
		System.out.println(name + "의 나이는 " + this.age + "세이며 성별은 " + this.gender + "입니다.");
	}
}
