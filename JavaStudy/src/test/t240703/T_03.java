package test.t240703;

import java.util.Scanner;

public class T_03 {
	public static void main(String[] args) {
		/*
		 * 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		 * 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		 * (합격 조건 : 세 과목의 점수가 각 각 40점 이상 이상이면서 평균이 60점 이상일 경우)
		 * 합격 했을 경우, 과목 별 점수와 합계, 평균, "축하합니다. 합격입니다!"를 출력하고
		 * 불합격인 경우, "불합격입니다."를 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int gukScore, engScore, matScore, scoreSum = 0;
		double sumAve;
		System.out.println("국어 점수를 입력하시오. : ");
		gukScore = sc.nextInt();
		
		System.out.println("영어 점수를 입력하시오. : ");
		engScore = sc.nextInt();
		
		System.out.println("수학 점수를 입력하시오. : ");
		matScore = sc.nextInt();
		
		scoreSum = gukScore + engScore + matScore;
		sumAve = (double)scoreSum / 3.0;
		
		if (sumAve >= 60 && gukScore >= 40 && engScore >= 40 && matScore >= 40) {
			System.out.println("국어 점수 : " + gukScore);
			System.out.println("영어 점수 : " + engScore);
			System.out.println("수학 점수 : " + matScore);
			System.out.println("과목 점수 합계 : " + scoreSum);
			System.out.printf("평균 : %.2f\n",sumAve);
			System.out.println("축하합니다. 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
		sc.close();
	}
}
