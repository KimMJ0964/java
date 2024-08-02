package test.t240708;

import java.util.Scanner;

public class T_05 {
	/*
	 * 키보드로 두 개의 정수형 데이터를 입력받아, 두 수의 곱이 한자리인지, 두자리인지 출력(1 ~9까지의 수 중)
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");	int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");	int num2 = sc.nextInt();
		
		 if(num1 >= 1 && num2 <= 9 && num2 >= 1 && num1 <= 9) {
			 System.out.println((num1 * num2 >= 10) ? "두 자리입니다." : "한 자리입니다.");
		 } else {
			 System.out.println("정수의 값이 1보다 작거나 9보다 큽니다.");
		 }
	}
}
