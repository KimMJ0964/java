package b.operator;

public class Operator1 {
	/*
	 * 1. 논리 부정 연산자
	 * 
	 * 논리값(true / false)을 반대로 바꾸는 연산자이다.
	 * 
	 * 결과도 논리값으로 나온다.
	 */
	public static void main(String[] args) {
		System.out.println("true의 부정 : " + !true);
		System.out.println("false의 부정 : " + !false);
		
		boolean b1 = !(5 > 3);
		System.out.println("b1의 값은 " + b1);
	}
}
