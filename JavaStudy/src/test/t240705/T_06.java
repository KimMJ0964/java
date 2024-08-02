package test.t240705;

import java.util.Scanner;

public class T_06 {
		/*
		 * 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력
		 * 평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20% 이뤄져있고
		 * 이 떄, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산
		 * 70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail
		 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 중간고사, 기말고사, 과제점수
		double midTest, finalTest, homework;
		// 출석회수
		int goSchool;
		
		// 점수 입력
		System.out.print("중간 고사 점수 입력 : ");			midTest = sc.nextDouble();
		System.out.print("기말 고사 점수 입력 : ");			finalTest = sc.nextDouble();
		System.out.print("과제 점수 입력 : ");			homework = sc.nextDouble();
		System.out.print("출석 횟수 입력 : ");			goSchool = sc.nextInt();
		System.out.println();
		
		// 평가 비율 계산
		midTest *= 0.2;
		finalTest *= 0.3;
		homework *= 0.3;
		// 출석은 비율과 총 점수가 같아 계산하지 않는다.
		
		// Pass / Fail 계산
		if(((midTest + finalTest + homework + goSchool) >= 70 && (goSchool > 14))) {
			System.out.println("[PASS]");
		} else if((midTest + finalTest + homework + goSchool) < 70) {
			System.err.println("[FAIL]");
			System.out.println("사유 : 합격 점수에 도달하지 못함");
		} else {
			System.err.println("[FAIL]");
			System.out.println("사유 : 일정 출석을 하지 않음");
		}
	}
	/*
	 * Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 : ");
		double mTest = sc.nextDouble();
		mTest *= 0.2;
		
		System.out.print("기말 고사 : ");
		double fTest = sc.nextDouble();
		fTest *= 0.3;
		
		System.out.print("과제 점수 : ");
		double homework = sc.nextDouble();
		homework *= 0.3;
		
		System.out.print("출석 횟수 : ");
		double dayCheck = sc.nextDouble();
		double sum = mTest + fTest + homework + dayCheck;
				
		System.out.println("============ 결과 ============");
		
		System.out.println("중간 고사 점수(20) : " + mTest);
		System.out.println("기말 고사 점수(30): " + fTest);
		System.out.println("과제 점수(30) : " + homework);
		System.out.println("출석 횟수(20) : " + dayCheck);
		System.out.println("총 점수 : " + (sum));
		
		if(sum >= 70 && dayCheck >= 14) {
			System.out.println("PASS");
		} else if (sum < 70){
			System.out.println("FAIL [성적 미달]");
		} else if (dayCheck < 14){
			System.out.println("FAIL [출석 횟수 미달]");
		} else {
			System.out.println("FAIL [성적 및 출석 횟수 미달]");
		}
		
		sc.close();
	 */
}
