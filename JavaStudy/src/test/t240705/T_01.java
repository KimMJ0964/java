package test.t240705;

import java.util.Scanner;

public class T_01 {
	/*
	 * 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력
	 * 총점과 평균은 정수형으로
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double gukScore, engScore, matScore;	// 국어 점수, 영어 점수, 수학 점수
		int sum, evg;	// 총점, 평균
		
		// 점수 입력
		System.out.print("국어 점수 입력 : ");	gukScore = sc.nextDouble();
		System.out.print("영어 점수 입력 : ");	engScore = sc.nextDouble();
		System.out.print("수학 점수 입력 : ");	matScore = sc.nextDouble();
		
		// 총점 및 평균 계산
		sum = (int)(gukScore + engScore + matScore);
		evg = sum / 3;
		
		// 출력
		System.out.println("국어 점수 : " + gukScore);
		System.out.println("영어 점수 : " + engScore);
		System.out.println("수학 점수 : " + matScore);
		System.out.println("총점수 : " + sum);
		System.out.println("평균 : " + evg);
	}
	/*
	 Scanner sc = new Scanner(System.in);
		
		double guk, eng, math, sum, evg;
		
		System.out.print("국어 점수 : ");
		guk = sc.nextDouble();
		
		System.out.print("영어 점수 : ");
		eng = sc.nextDouble();
		
		System.out.print("수학 점수 : ");
		math = sc.nextDouble();
		
		sum = guk + eng + math;
		
		evg = sum / 3.0;
		
		System.out.println("총점 : " + (int)sum);
		System.out.println("평균 : " + (int)evg);
		
		sc.close();
	 */
}
