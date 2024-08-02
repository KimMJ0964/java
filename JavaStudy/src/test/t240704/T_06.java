package test.t240704;

import java.util.Scanner;

public class T_06 {
	/*
	 * 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 1부터 입력받은 값까지 배열에 초기화한 후 출력하세요.
	 */
	public static void main(String[] args) {
		System.out.print("양의 정수 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num > 0) {
			int[] arr = new int[num];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = i + 1;
				System.out.println("arr[" + i + "]" + " = " + arr[i]);
			}
		} else {
			System.out.println("양의 정수가 아닙니다.");
		}
	}
}
