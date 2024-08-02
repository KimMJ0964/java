package test.t240708;

public class T_08 {
	/*
	 * 2차원 배열에 들어있는 데이터들의 합계와 평균을 구한다.
	 * 
	 */
	public static void main(String[] args) {
		int[][] array = {{12,41,36,56}, {82,10,12,61}, {14,16,18,78}, {45,26,72,23}};
		int count = 0;
		double sum = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (sum / count));
	}
}
