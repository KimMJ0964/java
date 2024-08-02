package h.inherit.override;

public class Run {
	
	/*
	 * 참조 변수를 호출하면 자동으로 .toString()가 호출된다.
	 * 
	 * 오버라이딩 전 : Object 클래스의 toString() 실행 -> 풀클래스명 + @ 객체의 주소를 암호한 16진수값
	 * 오버라이딩 후 : Man 클래스(자식 클래스)의 toString()를 실행
	 *  -> 해당 객체가 가지고 있는 모든 필드의 값을 한 문자열로 반환
	 *  
	 * 오버라이딩
	 *  - 자식 클래스가 상속받고 있는 부모 메소드를 재정의 하는 것
	 *  - 부모가 제공하는 메소드를 자식이 일부 고쳐서 사용하겠다는 의미
	 *  - 자식 객체를 통해 실행시 자식 메소드가 우선권을 가지고 있다.
	 *  
	 * 오버라이딩 성립조건
	 *  - 부모 메소드명과 메소드명이 동일
	 *  - 매개변수의 갯수, 자료형, 순서 동일(매개변수명 x)
	 *  - 반환형이 동일
	 *  - 부모 메소드의 접근 제한자보다 범위가 같거나 커야한다.
	 */
	public static void main(String[] args) {
		Man man = new Man("최지원");
		Object str = new String("안녕");
		System.out.println(man.toString());
		System.out.println(str.toString());
		// 객체가 생성되어있다면 객체정보를 보기위해서 참조변수를 출력하는 순간 무조건
		// toString메소드가 호출된다.
		// 참조변수에 객체가 주소가 없고 null이라면 null을 표시
	}

}
