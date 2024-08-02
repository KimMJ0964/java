package test.t240711.object1;

import java.util.Scanner;

public class T_01 {
	/*
	 * 정수 n(2~9)를 입력받아 2부터 n까지 중 짝수의 구구단을 출력하는 코드
	 * 만약 2~9사이의 값을 입력하지 않는다면 다시 입력 
	 */

	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 입력 : ");		int num = sc.nextInt();
			
			if(2 <= num && num <= 9) {
				for(int i = 2; i <= num; i++) {
					for(int j = 1; j <=9; j++) {
						if((i * j) % 2 == 0) {
							System.out.print(i + " * " + j + " = " + i*j + "\t");
						}
					}
					System.out.println();
					break;
				}
			}else {
				System.out.println("다시 입력해주세요.");
			}
		}
	}	
}
