package test.t240708;

public class T_03 {
	/*
	 * 1부터 100까지의 모든 정수들의 합과 평균을 구하는 프로그램 단, while문이나 do-while문을 작성
	 */
	
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		while(i < 101) {
			sum += i;
			i++;
		}
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (sum / 100.0));
	} 
}
