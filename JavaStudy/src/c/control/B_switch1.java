package c.control;

import java.util.Scanner;

public class B_switch1 {
	/*
	 * switch문 또한, if문과 동일한 조건문이다.
	 * 
	 * 다만, if문과의 "차이점"이라면 if문은 조건식을 자유롭게 기술할 수 있다. switch문은 동등비교로 밖에 수행되지 않는다. 실행할
	 * 구문만 실행하고 자동으로 빠져나올 수 없다. (직접 빠져나오도록 설정이 필요하다.)
	 * 
	 * [표현식] switch(비교대상(정수, 문자, 문자열)) { case 값1 : 실행코드 ; break; case 값2 : 실행코드 ;
	 * break; case 값3 : 실행코드 ; break; .... default: 위에 값들이 모두 일치하지 않았을 경우, 실행되는 코드 }
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 정수를 입력받아 1일 경우, "빨간색입니다." 2일 경우, "파란색입니다." 3일 경우, "초록색입니다." 다른 경우,
		 * "잘못 입력하였습니다."
		 */
//		int num;
//		
//		System.out.print("정수 입력 : ");
//		num = sc.nextInt();
//		
//		switch(num) {
//		case 1:
//			System.out.println("빨간색입니다.");
//			break;
//		case 2:
//			System.out.println("파란색입니다.");
//			break;
//		case 3:
//			System.out.println("초록색입니다.");
//			break;
//		default:
//			System.out.println("잘못 입력했습니다.");
//		}

		// 과일을 구매하는 프로그램
		// 구매하고하는 과일을 입력하면
		// 그에 맞는 가격이 출력이 되는 프로그램
		// 구매하고자하는 과일(사과(2000), 바나나(3000), 딸기(5000)) 입력 :
		// xx의 가격은 x000원입니다. / 잘못 입력하였습니다.
//		System.out.print("구매하고자하는 과일(사과(2000), 바나나(3000), 딸기(5000)) 입력 : ");
//		String fruit = " ";
//		int price = 0;
//
//		fruit = sc.nextLine();
//
//		switch (fruit) {
//		case "사과": {
//			price = 2000;
//			break;
//		}
//		case "바나나": {
//			price = 3000;
//			break;
//		}
//		case "딸기": {
//			price = 5000;
//			break;
//		}
//		default:
//			System.out.println("잘못 입력하였습니다.");
//		}
//		
//		System.out.println(fruit + "의 가격은 " + price + "원입니다.");
//		
//		if(fruit.equals("사과")) {
//			price = 2000;
//		} else if(fruit.equals("바나나")) {
//			price = 3000;
//		} else if(fruit.equals("딸기")) {
//			price = 5000;
//		} else {
//			System.out.println("잘못 입력하였습니다.");
//		}
//		System.out.println(fruit + "의 가격은 " + price + "원입니다.");
		
		// 월을 입력받아 해당월에 말일이 며칠까지 있는지를 출력하는 프로그램
		
		// 월을 입력하시오 : 
		// xx월은 xx일까지입니다.
		// 1,3,5,7,8,10,12 -> 31일
		// 4,6,9,11 -> 30일
		// 2 -> 28일
		
		int month;
		int day;
		
		System.out.print("월을 입력하시오. : ");
		month = sc.nextInt();
		
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12: {
			day = 31;
			break;
		}
		case 4, 6, 9, 11: {
			day = 30;
			break;
		}
		case 2: {
			day = 28;
			break;
		}
		default:
			System.out.println("잘못된 월을 입력하였습니다.");
			return;
		}
		
		System.out.println("해당 " + month + "월은 " + day + "일까지 있습니다.");
	}
}
