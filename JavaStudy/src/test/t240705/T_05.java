package test.t240705;

import java.util.Scanner;

public class T_05 {
		/*
		 * 키, 몸무게를 double로 입력 받고 BMI 지수를 계산하여 계산 결과에 따라
		 * 저체중 / 정상체중 / 과제중 / 비만을 출력
		 * BMI = 몸무게 / (키(m) * 키)
		 * BMI가 18.5 미만일 경우, 저체중 
		 * 18.5 이상 23미만일 경우 정상체중
		 * 23 이상 25 미만일 경우 과제충
		 * 25 이상 30 미만일 경우 비만
		 * 30 이상 고도 비만
		 * 
		 */
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			// 키(m 단위), 몸무게(kg 단위)
			double height, weight;
			
			// 키, 몸무게 입력
			System.out.print("키(m 단위) 입력 : ");		height = sc.nextDouble();
			System.out.print("몸무게(kg 단위) 입력 : ");		weight = sc.nextDouble();
			
			// BMI 계산
			double bmi;
			bmi = weight / (height * height);
			
			// 출력
			if (bmi < 18.5) {
				System.out.println("저체증");
			} else if (bmi < 23) {
				System.out.println("정상체증");
			} else if (bmi < 25) {
				System.out.println("과체증");
			} else if (bmi < 30) {
				System.out.println("비만");
			} else {
				System.out.println("고도비만");
			}
			
			sc.close();
		}
		/*
		 * Scanner sc = new Scanner(System.in);
			
			System.out.print("키(m)를 입력해 주세요 : ");
			double height = sc.nextDouble();
			
			System.out.print("몸무게를 입력해 주세요 : ");
			double weight = sc.nextDouble();
			
			double ccBmi = weight / (height * height);
			
			System.out.printf("Bmi : %.3f\n", ccBmi);
			
			if(ccBmi < 18.5) {
				System.out.println("저체중");
			} else if(ccBmi < 23) {
				System.out.println("정상체중");
			} else if(ccBmi < 25) {
				System.out.println("과체중");
			} else if(ccBmi < 30) {
				System.out.println("비만");
			} else {
				System.out.println("고도 비만");
			}
			
			sc.close();
		 * 
		 */
}
