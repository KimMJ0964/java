package test.t240703;

import java.util.Scanner;

import d.loop.E_continue;

public class T_01 {
	public static void main(String[] args) {
		// 메뉴를 출력하고 메뉴 번호를 누르면 "OO매뉴입니다."를 종료 번호를 누르면 "프로그램이 종료됩니다." 출력하세요.		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("5. 종료");
		System.out.print("메뉴 번호를 입력하시오. : ");
		
		int num = sc.nextInt();
		
		
		switch (num) {
		case 1: {
			System.out.println("입력 메뉴입니다.");
			break;
		}
		case 2: {
			System.out.println("수정 메뉴입니다.");
			break;
		}
		case 3: {
			System.out.println("조회 메뉴입니다.");
			break;
		}
		case 4: {
			System.out.println("삭제 메뉴입니다.");
			break;
		}
		case 7: {
			System.out.println("프로그램이 종료됩니다.");
			break;
		}
		default:
			System.err.println("올바른 입력이 아닙니다.");
		}
		
		sc.close();
		
	}
}

//		if (num == 1) {
//			System.out.println("입력 메뉴입니다.");
//		} else if (num == 2) {
//			System.out.println("수정 메뉴입니다.");
//		} else if (num == 3) {
//			System.out.println("조회 메뉴입니다.");
//		} else if (num == 4) {
//			System.out.println("삭제 메뉴입니다.");
//		} else if (num == 7) {
//			System.out.println("프로그램이 종료됩니다.");
//		} else {
//			System.err.println("올바른 입력이 아닙니다.");
//		}