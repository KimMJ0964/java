package test.t240708;

public class T_02 {
	/*
	 * 2단에서 5단까지의 구구단의 결과 중 홀수인것만 출력한다. for문을 사용한다.
	 */
	
	public static void main(String[] args) {
		for(int i = 2; i <= 5; i++) {
			for(int j = 1; j <= 9; j++) {
				if(((i * j)%2) == 1) {
					System.out.println(i + " X " + j + " = " + (i*j));
				}
			}
		}
	}
}
