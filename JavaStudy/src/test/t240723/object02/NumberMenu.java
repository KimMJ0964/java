package test.t240723.object02;

import java.util.Scanner;

public class NumberMenu {
	// 사용자에게 두 정수를 입력 받아 NumberController의 checkDouble()에
	// 매개변수로 넘겨주어 반환 값을 출력함
	// 이 때 checkDouble()메소드를 호출하는 부분부터 try~catch를 이용하여 예외 처리
	public void menu() {
		Scanner sc = new Scanner(System.in);
		NumberController nc = new NumberController();
		
		System.out.print("첫 번째 정수 입력 : "); int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : "); int num2 = sc.nextInt();
		
		try {
		boolean check = nc.checkDouble(num1, num2);
		System.out.println(num1 + "은(는) " + num2 + "의 배수인가 ? " + check);
		} catch (Exception e) {
			System.out.println("1 부터 100 사이의 값이 아닙니다.");
			e.printStackTrace();
		} finally {
			System.out.println("프로그램을 종료합니다.");
		}
	}
}
