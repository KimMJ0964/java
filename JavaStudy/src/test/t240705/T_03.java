package test.t240705;

import java.util.Scanner;

public class T_03 {
	/*
	 * 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력 받을 3개의 수
		int num1, num2, num3;
		
		System.out.print("첫 번째 정수 입력 : ");		num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");		num2 = sc.nextInt();
		System.out.print("세 번째 정수 입력 : ");		num3 = sc.nextInt();
		
		// 비교 후, 출력
		System.out.println((num1 == num2) && (num1 == num3) ? true : false);
	
	}
	/*
	 Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int first = sc.nextInt();
		
		System.out.print("입력2 : ");
		int second = sc.nextInt();
		
		System.out.print("입력3 : ");
		int third = sc.nextInt();
	
		System.out.println(first == second && first == third);
		
		sc.close();
	 */
}
