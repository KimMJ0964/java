package test.t240705;

import java.util.Scanner;

public class T_09 {
	/*
	 * 정수를 입력 받아 양수일 때만 1부터 입력 받은 수까지 홀수 / 짝수를 나눠서
	 * 홀수면 '박' 짝수면 '수'를 출력
	 * 단 입력한 수가 양수가 아니면 "양수가 아닌니다" 출력 
	 * 위 행위를 0을 입력할 때까지
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력 받을 정수
		int num;
		
		while(true) {
			// 정수 입력
			System.out.print("정수 입력 : ");		num = sc.nextInt();
			
			if (num >= 1) {
				for(int i = 1; i <= num; i++) {
					if(i % 2 == 1) {
						System.out.print("박");
					} else {
						System.out.print("수");
					}
				}
				System.out.println();
			} else if(num == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("양수가 아닙니다.");
			}
		}
	}
	/*
	 * Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num > 0) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i % 2 == 1 ? "박": "수");
				}
				System.out.println();
			} else if (num == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("정수가 아닙니다.");
			}
		}
		sc.close();
	 */
}
