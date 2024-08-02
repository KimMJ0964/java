package d.loop;

import java.util.Scanner;

public class C_do_while {
	/*
	 * do ~while
	 * 
	 * do {
	 * 		실행할 코드
	 * 
	 * } while(조건식);
	 *
	 * 처음에 무조건 실행 코드 한번 실행하고 조건문 검사
	 * 
	 * 기존의 for / while 문과의 차이점
	 * for / while 문은 처음 수행될 때, 조건 검사 후 true일 경우, 반복 코드를 실행
	 * 하지만 do ~while일 경우, 첫 실행은 조건 검사 없이 무조건 실행
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 사용자가 입력한 수를 계속해서 다하는 프로그램을 작성
		// 단, 사용자가 0을 입력하면 종료
		System.out.print("수 입력 : ");
		int num;
		int sum = 0;
		
		do {
			num = sc.nextInt();
			sum += num;
		}while(num != 0);
		
		System.out.println("입력한 수의 모든 합계 : " + sum);
	}
}
