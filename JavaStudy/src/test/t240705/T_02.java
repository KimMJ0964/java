package test.t240705;

import java.util.Scanner;

public class T_02 {
	/*
	 * 주민번호를 입력해서 남자인지, 여자인지 구분하여 출력하라
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 주민번호
		String peopleNum = "";
		char genderNum = '1';
		
		while(true) {
		System.out.println("주민번호 입력 : ");
			peopleNum = sc.next();
			genderNum = peopleNum.charAt(7);
			
			// 남녀 구문 switch문
			switch (genderNum) {
			case '1': 
				System.out.println("남자입니다.");
				break;
			case '3': 
				System.out.println("남자입니다.");
				break;
			case '2': 
				System.out.println("여자입니다.");
				break;
			case '4': 
				System.out.println("여자입니다.");
				break;
			default:
				System.out.println("잘못 입력하였습니다.");
				continue;
			}
		}
	}
	/*
	 * Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하시오 : ");
		String ctNum = sc.nextLine();
		char gender = ctNum.charAt(7);
		
		switch (gender) {
		case '1': 
		case '3': {
			System.out.println("남자입니다.");
			break;
		}
		case '2':
		case '4': {
			System.out.println("여자입니다.");
			break;
		}
		default:
			System.out.println("잘못 입력하였습니다.");
		}
		
		sc.close();
	 */
}
