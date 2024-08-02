package test.t240705;

import java.util.Scanner;

public class T_04 {
		/*
		 * A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
		 * 인센티브 포함 급여가 3000만원 이상이면 "3000 이상", 미만이면 "3000 미만"을 출력
		 * (A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C사원의 인센티브는 0.15)
		 */
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			// A, B, C 사원의 연봉
			double[] worker = new double[3];
			
			System.out.print("A 사원의 연봉 입력 : ");		worker[0] = sc.nextDouble();
			System.out.print("B 사원의 연봉 입력 : ");		worker[1] = sc.nextDouble();
			System.out.print("C 사원의 연봉 입력 : ");		worker[2] = sc.nextDouble();
			
			// 인센티브 계산
			worker[0] *= 1.4;	// 0.4 인센티브
			worker[1] *= 1;		// 인센티브 존재하지 않음
			worker[2] *= 1.15;	// 0.15 인센티브
			
			for(int i = 0; i < worker.length; i++) {
				if(worker[i] >= 3000) {
					System.out.println("연봉 : " + worker[i]+"\t3000 이상");
				} else {
					System.out.println("연봉 : " + worker[i]+"\t3000 미만");
				}
			}
			
		}
		/*
		 * Scanner sc = new Scanner(System.in);
			
			System.out.print("A사원의 연봉 : ");
			double aMoney = sc.nextDouble();
			
			System.out.print("B사원의 연봉 : ");
			double bMoney = sc.nextDouble();
			
			System.out.print("C사원의 연봉 : ");
			double cMoney = sc.nextDouble();
			System.out.println();
			
			System.out.print("A사원의 연봉 / 연봉 + a : " + aMoney + "/" + (aMoney + (aMoney * 0.4)) + "\n");
			System.out.println(aMoney + (aMoney / 0.4) > 3000 ? "3000 이상" : "3000 미만");
			
			
			System.out.print("B사원의 연봉 / 연봉 + a : " + bMoney + "/" + (bMoney + (bMoney * 0.0)) + "\n");
			System.out.println(bMoney + (bMoney * 0.0) > 3000 ? "3000 이상" : "3000 미만");
			
			
			System.out.print("C사원의 연봉 / 연봉 + a : " + cMoney + "/" + (cMoney + (cMoney * 0.15)) + "\n");
			System.out.println(cMoney + (cMoney * 0.15) > 3000 ? "3000 이상" : "3000 미만");
			
			
			sc.close();
		 */
}
