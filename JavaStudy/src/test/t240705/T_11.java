package test.t240705;

import java.util.Scanner;

public class T_11 {
	/*
	 * 1부터 100 사이의 정수 중 임의의 난수가 정해지고 사용자는 정해진 난수를 맞추는데
	 * 몇 번 만에 맞췄는지 출력하세요.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, count = 1;
		int hideNum = (int)(Math.random() * 100)+1;
		
		while(true) {
			System.out.print("1 ~ 100 사이의 난수를 입력하시오. : ");
			num = sc.nextInt();
			if ((num < 1 || 100 < num)) {
				System.err.println("1부터 100까지의 수를 입력하시오.");
				continue;
			} else if(num == hideNum) {
				System.out.println("정답입니다.");
				System.out.println(count + "번만에 맞추셨습니다.");
				break;
			} else if(num > hideNum) {
				System.err.println("DOWN!");
				count++;
			} else {
				System.err.println("UP!");
				count++;
			}
		}
		sc.close();
	}
}
