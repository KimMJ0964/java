package test.t240705;

import java.util.Scanner;

public class T_07 {
	/*
	 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력 만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요."를
	 * 출력 다시 사용자가 값을 입력하도록 하세요.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력 받을 두 수
		int num1, num2;
		// 두 수 중 큰 값, 작은 값 대입
		int min, max;
		
		while(true) {
			// 정수 입력
			System.out.print("첫 번째 정수 입력 : ");			num1 = sc.nextInt();
			System.out.print("두 번째 정수 입력 : ");			num2 = sc.nextInt();
			
			// 숫자가 1미만인지 확인
			if((num1 < 1) || (num2 < 1)) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			} else if(num1 == num2) {
				System.out.println("두 수는 같은 값입니다.");
				break;
			} else {
				 max = (num1 > num2) ? num1 : num2;
				 min = (num1 < num2) ? num1 : num2;
				 
				 for(int i = min; i <= max; i++) {
					 System.out.print(i + " ");
				 }
				 break;
			}
		}
	}
}
/*
 * Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.print("첫 번째 숫자 : ");
				int firstNum = sc.nextInt();
				
				System.out.print("두 번째 숫자 : ");
				int secondNum = sc.nextInt();
				
				if(firstNum < 1 || secondNum < 1) {
					System.out.println("1 이상의 숫자를 입력해주세요.");
					continue;
				} 
				else if(firstNum > secondNum) {
					for (int i = secondNum; i <= firstNum; i++) {
						System.out.print(i + " ");
					} 
					break; 
				} 
				else {
					for (int i = firstNum; i <= secondNum; i++) {
						System.out.print(i + " ");
					}
					break;
				}
			}
			*/
