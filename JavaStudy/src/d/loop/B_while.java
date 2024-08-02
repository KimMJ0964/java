package d.loop;

import java.util.Scanner;

public class B_while {
	/*
	 * while문
	 * 
	 * [표현법]
	 * 
	 * [초기식;]
	 * while(조건식) {
	 * 		반복할 코드
	 * 		증감식;
	 * }
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//사용자가 0을 입력할 때까지 반복해서 숫자를 입력받아 그대로 출력
//		while(true) {
//			int n = sc.nextInt();
//			if(n == 0) {
//				break;	// 가장 가까운 반복문 같은 것을 탈출
//			} else { 
//				System.out.println(n);
//			}
//		}
		
		// 1부터 10000사이의 홀수만을 출력
		// while문을 이용해서 출력
//		int i = 1;
//		while(i <= 10000) {
//			if(i % 2 == 1)
//				System.out.println(i);
//			i++;
//		}
		
		// 1부터 랜덤값(1~100)까지의 합계를 구하자
		// 1에서부터 xx까지의 총 합계 : xxxx
//		int num = (int)(Math.random() * 100) + 1;
//		int sum = 0;
//		int i = 0;
//		
//		while(i <= num) {
//			sum += i;
//			i++;
//		}
//		System.out.println("1에서부터 " + num + "까지의 총 합계 : " + sum);
		
		// 사용자가에게 문자열을 입력받아 해당 문자열의 짝수자리 글자만 출력
		// 문자열 입력 : Hello
		
		System.out.print("문자열 입력 : ");
		String str;
		str = sc.nextLine();
//		int i = 0;
		
//		while(i < str.length()) {
//			if(i % 2 == 1) {
//				System.out.print(str.charAt(i) + " ");
//			}
//			i++;
//		}
		
		int i = 1;
		
		while(i < str.length()) {
			System.out.println(str.charAt(i));
			i += 2;
		}
		
		sc.close();
	}
}
