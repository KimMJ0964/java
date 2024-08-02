package j.Interface.ex01;

//Baby 같은 인터페이스로 체크용도로 사용가능
public class Rabbit implements Animal, Baby{

	@Override
	public void move() {
		
	}

	@Override
	public void eat() {
		System.out.println("냠냠 먹습니다.");
	}

	@Override
	public void makeSound() {
		System.out.println("삐익");
	}

}
