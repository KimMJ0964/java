package test.controller;

import java.util.Scanner;

public class Test4 {
	/*
	 * main의 argument로 1자리 정수형(1부터 9까지만) 값을 2개 입력받아 4칙연산 결과를 출력한다. 입력값은 모두 int 형으로 처리한다. 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("첫 번째 정수 입력 : ");	 		num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");	 		num2 = sc.nextInt();
		
		System.out.println("합 : " + (num1 + num2));
		System.out.println("차 : " + (num1 - num2));
		System.out.println("곡 : " + (num1 * num2));
		
		if(num2 >= 1) {
			System.out.println("나누기 : " + (num1 / num2));
		} else {
			System.out.println("나누기 : 0");
		}
	}

}
