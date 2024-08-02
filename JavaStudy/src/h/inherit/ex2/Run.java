package h.inherit.ex2;

public class Run {
	/*
	 * 상속이란?
	 * 부모클래스와 필드와 메소드를 자식클래스에서 그대로 이어받아 사용하는 것
	 * (실제로 상속된 클래스를 통해서 객체 생성시 부모클래스의 객체도 생성이 된다.)
	 * 
	 * 상속의 장점
	 *  - 적은 양의 코드로 새로운 클래스를 정의하고 사용할 수 있다.(생산성이 좋음)
	 *  - 코드를 공통으로 관리하기 때문에 코드의 추가나 변경이 용이하다(유지보수성이 좋음)
	 *  
	 * 상속의 특징
	 *  - 클래스간의 다중상속 불가(부모는 하나)
	 *  - 부모 클래스에 정의되어있는 protected 필드는 자식클래스에서 직접 접근 가능(private는 불가능)
	 *  - 자식 객체는 부모 클래스에 있는 메소드를 마치 내것인것처럼 호출 가능
	 *  - 부모 클래스의 정의된 기능이 마음에 들지 않으면 내 맘대로 수정 가능(오버라이딩)
	 *  - 명시되어있지는 않지만 모든 클래스(자바에서 제공하는 클래스, 직접만든 클래스)는 Object라는 클래스의 후손(상속 받는)
	 *   -> Obejct에 있는 메소드를 마음대로 호출해서 사용할 수 있다.
	 *   -> 오버라이딩도 가능하다.
	 */
	public static void main(String[] args) {
		// Product 클래스 정의
		// String brand, String pCode, String pName, int price
		// Product 클래스를 상속받는 Desktop객체를 생성
		// boolean allinOne
		Desktop d1 = new Desktop("LG", "A001", "사무용pc", 1000000, true);
		System.out.println(d1.information());
		
		// Product를 상속받는 TV클래스 작성
		// 필드에는 int inch정보를 가지고 있고 information을 오버라이딩하여
		// 기본 Product의 정보 + inch 정보 출력
		
		TV tv = new TV("LG", "A001", "사무용pc", 1000000, 16);
		System.out.println(tv.information());
	}
}
