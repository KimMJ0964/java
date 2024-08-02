package test.t240715.object1;

import java.util.Scanner;

public class Run {
	/*
	 * 정수 num1, num2, num3을 입력받아 홀짝을 출력하라
	 * 입력 : 6 4 7
	 * 짝 짝 홀
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==================================================");
		
		System.out.print("정수1 입력 : ");	 int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");	 int num2 = sc.nextInt();
		System.out.print("정수3 입력 : ");	 int num3 = sc.nextInt();
		
		System.out.print((num1 % 2 == 0 ? "짝" : "홀") + " ");
		System.out.print((num2 % 2 == 0 ? "짝" : "홀") + " ");
		System.out.print((num3 % 2 == 0 ? "짝" : "홀"));
		
		System.out.println();
		System.out.println("==================================================");
		
		/*
		 * 정수(0 ~ 100)을 입력받아 0부터 입력받은 수까지 출력
		 */
		
		System.out.println("정수 입력(0 ~ 100) : "); 		num1 = sc.nextInt();
		
		if(num1 >= 0 && num1 <= 100) {
			for(int i = 0; i <= num1; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("정수 범위가 0~100을 벗어났습니다.");
		}
		
		System.out.println();
		System.out.println("==================================================");
		
		/*
		 * 번호를 입력한 횟수를 구하는 프로그램
		 * 번호 (1 ~ 20)까지를 무작위로 10번 입력받는다.
		 * 입력받은 1 ~ 20까지의 수가 각각 몇번 입력되었는지를 출력한다.
		 */
		
		int count = 0;
		int[] numArr = new int[10];
		
		System.out.print("번호(무작위로 10번 입력 1 ~ 20) : ");
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = sc.nextInt();
			if(numArr[i] < 1 || numArr[i] > 20) {
				System.out.println("1 ~ 20 숫자가 아닙니다.");
				return;
			}
		}
		
		System.out.println("입력횟수 : ");
		for(int i=1; i<=20; i++) {
			for(int j = 0; j < numArr.length; j++ ) {
				if(i == numArr[j]) {
					count++;
				}
			}
			System.out.print(count + " ");
			count = 0;
		}

		System.out.println();
		System.out.println("==================================================");
		sc.nextLine();
		// 학생성적 관리 프로그램
		Student[] student01 = new Student[10];
		for(int i = 0; i < student01.length; i++) {
			student01[i] = new Student();
			System.out.print("이름 : ");			student01[i].setName(sc.next());
			System.out.print("반 : ");			student01[i].setClassRoom(sc.nextInt());
			System.out.print("자바 점수 : ");		student01[i].setJavaScore(sc.nextDouble());
			System.out.print("sql 점수 : ");		student01[i].setSqlScore(sc.nextDouble());
			System.out.print("연습 점수 : ");		student01[i].setPracticeScore(sc.nextDouble());
			
			System.out.println(student01[i].toString());
			
			System.out.println(student01[i].isPassed() ? "통과입니다." : "떨어졌습니다.");
			
			// *** 점수 랜덤 ***
			
			student01[i].reTest();
		}
		
		for(int i = 0; i < student01.length; i ++) {
			System.out.println((i+1) + "번째의 학생의 정보 : " + student01[i]);
			
			System.out.println(student01[i].isPassed() ? "통과입니다." : "떨어졌습니다.");
		}
		
	}
}
