package f.object.ex4;

import java.util.Scanner;

public class Run {
		// choi 객체 생성 최지원, 15살, 영어 : 60, 수학 : 70, 국어 : 80
		// kim 객체 생성 김도한, 18살, 영어 : 95, 수학 : 50, 국어 : 70
	public static void main(String[] args) {
		/*
		Student choi = new Student("최지원", 15, 70, 60, 80);
		Student kim = new Student("김도원", 18, 50, 95, 70);
		
		// choi의 모든 과목의 평균을 출력
		System.out.println(choi.getName() + "님의 평균은 " + choi.getEvg() + "입니다.");
		// kim의 모든 과목의 평균을 출력
		System.out.println(kim.getName() + "님의 평균은 " + kim.getEvg() + "입니다."); 
		 */
		
		// 사용자로부터 이름, 나이, 영어점수, 수학점수, 국어점수를 입력받아
		// 평균을 구하고 출력하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : "); 		String name = sc.next();
		System.out.print("나이 입력 : "); 		int age = sc.nextInt();
		System.out.print("영어점수 입력 : "); 		int eS = sc.nextInt();
		System.out.print("수학점수 입력 : "); 		int mS = sc.nextInt();
		System.out.print("국어점수 입력 : "); 		int gS = sc.nextInt();
		
		Student student = new Student(name, age, mS, eS, gS);
		student.printEvg();
		
		sc.close();
	}

}
