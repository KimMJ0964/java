package test.t240703;

import java.util.Scanner;

public class T_05 {
	/*
	 * 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 구하라
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하시오. : ");
		int num = sc.nextInt();
		int sum = 0;

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i);
				sum += i;
				if (i < num) {
					System.out.print(" + ");
				} else {
					System.out.println(" = " + sum);
					break;
				}
			}
		} else if (num == 0) {
			System.out.println(0);
		} else {
			num = num * -1;
			for (int i = 1; i <= num; i++) {
				System.out.print("(-" + i + ")");
				sum += i;
				if (i < num) {
					System.out.print(" + ");
				} else {
					System.out.println(" = -" + sum);
					break;
				}
			}
		}

	}
}
