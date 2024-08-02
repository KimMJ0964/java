package c.control;

import java.util.Scanner;

public class A_if2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 나이를 입력받아
		// 13세 이하 : 어린이
		// 13세 초과 19세 이하 : 청소년
		// 19세 초과 : 성인
		
		// 나이를 입력해주세요.
		// xx세는 xxx에 속합니다.
		
//		System.out.print("나이를 입력해주세요. : ");
//		int age;
//		age = sc.nextInt();
//		sc.nextLine();
		
//		if (age <= 13) {
//			System.out.println(age + "세는 어린이에 속합니다.");
//		} else if (13 < age && age <= 19) {
//			System.out.println(age + "세는 청소년에 속합니다.");
//		} else {
//			System.out.println(age + "세는 성인에 속합니다.");
//		}
		
		// 성별을 M/F (대소문자 상관없이)을 입력받아 남학생인지 여학생인지 출력하는 프로그램을 작성하세요.
//		System.out.print("성별(m / f) : ");
//		char gender;
//		String result = null;
//		
//		gender = sc.next().charAt(0);
//
//		if(gender == 'M' || gender == 'm') {
//			result = "남학생";
//		} else if (gender == 'F' || gender == 'f'){
//			result = "여학생";
//		} else {
//			System.out.println("잘못 입력하였습니다.");
//			return;
//		}
//		
//		System.out.println(result + "입니다.");
		
		// 정수(양수)를 입력받아 짝수인지 홀수인지 출력하는 프로그램을 작성하라
		System.out.print("정수 입력 : ");
		int num;
		String numResult = " ";
		num = sc.nextInt();
		
		if (num <= 0) {
			numResult = "양수가 아닙";
		} else if(num % 2 == 0) {
			numResult = "짝수입";
		} else {
			numResult = "홀수입";
		}
		
		System.out.println(numResult + "니다.");
		
		sc.close();
	}
}
