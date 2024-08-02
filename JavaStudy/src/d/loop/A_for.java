package d.loop;

import java.util.Scanner;

public class A_for {
	/*
	 * <반복문> 프로그램 흐름을 제어하는 제어문 중 하나 어떤 실행코드를 반복적으로 수행
	 * 
	 * 크게 두 종류로 나눔(for / while(do ~while))
	 * 
	 * for문
	 * 
	 * for(초기식; 조건식; 증감식) { // 반복횟수를 지정하기 위해서 제시하는 것들 반복적으로 실행시키고자하는 코드 더미 }
	 * 
	 * - 초기식 : 반복문이 실행될 때, 처음에 단 한번만 실행되는 구문 (반복문 안에서 사용 될 변수를 선언 및 초기화하는 작업)
	 * 
	 * - 조건식 : 반복문이 수행될 조건을 작성하는 구문 조건식이 true일 경우, 해당 반복을 실행, false일 경우, 반복문을 탈출
	 * (초기식에서 제시된 변수를 가지고 조건식을 정함)
	 * 
	 * - 증감식 : 반목문을 제어하는 변수 값을 증감 시키는 구문 (보통 초기식에 제시된 변수를 가지고 증감을 시킴)
	 * 
	 * tip for문 안에 초기식, 조건식, 증감식 각각 생략 가능하다(단, 생략해서 쓰는 경우가 없다. -> while 사용)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 10번 반복하는 반복문
//		for(int i = 0; i < 10; i ++) {
//			System.out.println("안녕하세요.");
//		}
//		for (int i = 1; i < 6; i++) {
//			System.out.println(i);
//		}

		// 5~1까지 순차적으로 출력
//		for (int i = 5; i > 0; i--) {
//			System.out.println(i);
//		}

		// 정수 n을 입력받아 1부터 n까지 1씩 증가시키면서 출력해라
		// 정수 입력 : 6
		// 1 2 3 4 5 6

//		int n;
//		System.out.print("정수 입력 : ");
//		n = sc.nextInt();
//		for (int i = 1; i <= n; i++ ) {
//			System.out.print(i + " ");
//		}

		// 1 ~ 10 숫자 중에 홀수만 출력

//		for(int i = 1; i <= 10; i++) {
//			if(i % 2 != 0)
//				System.out.print(i + " ");
//		}

		// 구구단
//		for(int i = 1; i <= 9; i++) {
//			for(int j = 1; j <=9; j++) {
//				System.out.print(i + " x " + j + " = " + (i * j) + "\t");
//			}
//			System.out.println();
//		}

		// 1부터 100까지의 총 합을 구하라
//		int sum = 0;
//		for(int i = 1; i <= 100; i++) {
//			sum += i;
//		}
//		System.out.println("1부터 100까지의 합 : " + sum);

		// 정수 n을 입력받아 1부터 n까지의 1씩 증가하며 모든 수를 더해서 출력해라
		// 정수 입력 : 5
		// 1부터 5까지의 합 : 15

//		int sum = 0;
//		int n;
//		System.out.print("정수 입력 : ");
//		n = sc.nextInt();
//		
//		for(int i = 1; i <= n; i++) {
//			sum += i;
//		}
//		
//		System.out.println("1부터 " + n + "까지의 합 : " + sum);

		// java.lang.Math 클래스에서 제공하는 random() 메서드 호출하면 매번 다른 무작위 값을 받을 수 있다.
		// Math.random() 호출 시, 0.0 ~ 0.9999999999 실수 중, 무작위 값을 반환한다.
		// 0 <= ~ < 1.0
		// int num = Math.random() double형이라서 int로 무작위 값을 받을 수 없다.
		// int num = (int)(Math.random() * 10) + 1; // 1 ~ 10
		// int num = (int)(Math.random() * ((최댓값+1) - 최소값) + 최소갑;

//		int num = (int)(Math.random() * 10);	// 0 ~ 9
//		System.out.println(num);
//		sc.close();

		// random() 1 ~ 10에서 한 숫자 n을 생성해서 1부터 n까지 모두 더한 값을 출력하세요.
		// random 수 : 5
		// 1 ~ 5까지의 합의 수 : 15

//		int num = (int)(Math.random() * 10) + 1;	// 0 ~ 9
//		System.out.println("random 수 : " + num);
//		int sum = 0;
//		for(int i = 1; i <= num; i++) {
//			sum += i;
//		}
//		System.out.println("1 ~ " + num + "까지의 합의 수 : " + sum);

		// random을 (5~50)까지 숫자 n을 생성해서 1부터 n까지의 숫자를 짝수만 출력해라(50포함)
		int num = (int) (Math.random() * 46) + 5; // 0 ~ 9
		System.out.println("random 수 : " + num);
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
//		String str = "Hello";
//		
//		/*
//		 * 각 인덱스별 문자 출력
//		 * H -> str.charAt(0);
//		 * e -> str.charAt(1);
//		 * l -> str.charAt(2);
//		 * l -> str.charAt(3);
//		 * o -> str.charAt(4);
//		 * 
//		 * 문자열.length() : 문자열의 길이를 구하는 방법
//		 */
//		System.out.println("문자열의 길이 : " + str.length() + "개");
//		for (int i = 0; i < str.length(); i++) {
//			System.out.print(str.charAt(i) + " ");
//		}
		
		// 사용자에게 문자열을 입력받아서 해당 문자열의 짝수자리 글자만 출력
		// 문자열 입력 : Hello
		// e, l
//		System.out.print("문자열 입력 : ");
//		String str = "";
//		str = sc.nextLine();
//		
//		System.out.print("짝수 번째의 글자 : ");
//		for (int i = 0; i < str.length(); i++) {
//			if(i % 2 == 1) {
//				System.out.print(str.charAt(i) + "  ");
//			}
//		}
	
		// 구구단 2단을 출력해보자
		for(int l = 1; l <= 9; l++) {
			System.out.println(2 + " x " + l + " = " + (2 * l));
		}
		
		// 구구단
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <=9; j++) {
				System.out.print(i + " x " + j + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
			sc.close();
		}
}
