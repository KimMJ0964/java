package test.controller;

import java.util.Scanner;

public class Test5 {
	/*
	 * 키보드로 2개의 정수형 데이터를 입력 받아, 두 수가 모두 1부터 9까지의 수일 때만 두 수의 곱이 한자리 수인지 두자리 수인지를 출력한다. 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("첫 번째 정수 : ");  		num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");  		num2 = sc.nextInt();
		
		if((0 < num1 && num1 < 10) && (0 < num2 && num2 < 10)) {
			if(((num1 * num2) / 10) > 0) {
				System.out.println("두자리 수 입니다.");
			} else {
				System.out.println("한자리 수 입니다.");
			}
		} else {
			System.out.println("입력한 정수가 1부터 9의 수가 아닙니다.");
		}
	}

}
