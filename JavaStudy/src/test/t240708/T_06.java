package test.t240708;

import java.util.Scanner;

public class T_06 {
	/*
	 * 키보드로 1개의 정수를 입력받아 1부터 5까지 일때만 해당 숫자에 헤당하는 결과를 출력 (Switch문) 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		
		switch (num1) {
		case 1: System.out.println("** 입력이 정상적으로 되었습니다. **"); break;
		case 2: System.out.println("** 조회가 시작되었습니다. **"); break;
		case 3: System.out.println("** 수정이 정상적으로 되었습니다. **"); break;
		case 4: System.out.println("** 삭제가 정상적으로 되었습니다. **"); break;
		case 5: System.out.println("** 정상적으로 종료되었습니다. **"); break;
		default:
			System.out.println("다시 입력해주세요.");
		}
		
		sc.close();
	}
}
