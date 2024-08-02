package test.t240704;

import java.util.Scanner;

public class T_04 {
	/*
	 * 사용자로부터 입력 받은 숫자의 단 부터 9단까지 출력하시오. 단, 9를 초과하는 숫자가 들어오면 "9 이하의 숫자만 입력해주세요."
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		if (dan <= 9) {
			for (int j = dan; j <= 9; j++) {
				System.out.println("\n===== " + j + "단 =====");
				for (int i = 1; i <= 9; i++) {
					System.out.print(j + " * " + i + " = " + (j * i) + "\t");
				}
			}
		} else {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}
	}
}
