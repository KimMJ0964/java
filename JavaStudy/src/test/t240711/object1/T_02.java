package test.t240711.object1;

import java.util.Scanner;

public class T_02 {
	/* 
	 * 정수 num을 입력받아 크기가 num인 정수형 배열을 만들고 1 ~ 100사이의 랜덤값을 모든 배열의 인덱스값을 대입합니다.
	 * 이후 모든 배열의 값을 출력하고 홀수 인덱스의 값을 더한 값을 출력하세요.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 크기 입력 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)((Math.random()*100)+1);
			System.out.println("인덱스" + i + "의 값은 " + arr[i]);
			if(i % 2 == 1) {
				count += arr[i];
			}
		}
		
		System.out.println("홀수 인덱스 값 합계 : " + count);
	}
}
