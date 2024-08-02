package b.operator;

import java.util.Scanner;

public class Operator6 {
	/*
	 * 삼항 연산자
	 * [표현식] 
	 * 조건식 ? 조건식이 참일 경우, 결과값 : 조건식이 거짓일 경우, 결과값
	 * 
	 * 이때, 조건식은 반드시 true 또는 false가 나오는 논리값이어야한다.
	 * 주로 비교, 논리연산자를 통해서 작성
	 * 중첩을 많이 하면 가독성이 떨어짐
	 */
	public static void main(String[] args) {
//		int num = (3 < 10) ? 10 : 20;	// true인 경우 왼쪽 값, false인 경우 오른쪽 값
//		System.out.println(num);
		
		// 입력 받은 정수 값이 양수인지 아닌지 판별 후, 출력하라
		// 정수값 입력 : 
		// 양수 or 음수
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num1;
		num1 = sc.nextInt();
		System.out.println((num1 > 0) ? "양수" : "음수");
		sc.close();
	}
}
