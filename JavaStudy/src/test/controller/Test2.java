package test.controller;

public class Test2 {
	/*
	 * 2단에서 5단까지의 구구단의 결과 중 홀수인 것만 출력한다. 단, for문을 이용한다.
	 */
	public static void main(String[] args) {
		
		int sum;
		
		for(int i = 2; i <= 5; i++) {
			for(int j = 1; j <= 9; j++) {
				sum = i * j;
				if(sum % 2 != 0) {
					System.out.println(i + " x " + j + " = " + sum);
				}
			}
		}
	}

}
