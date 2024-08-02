package test.t240704;

public class T_09 {
	/*
	 * 4행 4열짜리 정수형 배열을 선언 및 할당하고
	 * 1) 1 ~ 16짜리 값을 차례대로 저장
	 * 2) 저장된 값들을 차례대로 출력
	 */
	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		int count = 1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[i][j] = count++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
