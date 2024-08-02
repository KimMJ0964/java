package test.t240704;

import java.util.Scanner;

public class T_03 {
	/*
	 * 사용자로부터 2개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요. 만일 1미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를
	 * 출력해주세요.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자를 입력하시오. : ");
		int firstNum = sc.nextInt();

		System.out.print("두 번째 숫자를 입력하시오. : ");
		int secondNum = sc.nextInt();

		// 둘 중 더 큰 수 구하기
		int maxNum = (firstNum > secondNum) ? firstNum : secondNum;
		int minNum = (firstNum < secondNum) ? firstNum : secondNum;

		if (maxNum > 1 && minNum > 1) {
			for (int i = minNum; i <= maxNum; i++) {
				System.out.println(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}

		sc.close();
	}
}
