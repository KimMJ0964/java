package test.t240715.object2;

public class T_01 {
	// 2차원 배열에 들어 있는 데이터들의 합계와 평균을 구한다.
	public static void main(String[] args) {
		double sum = 0, evg = 0;	// 합계와 평균 생성 후, 초기화
		int count = 0;		// 배열 내부의 값의 수 세기
		// 2차원 배열
		int [][] array = {{12, 41, 36, 56, 21},		
						  {82, 10, 12, 61, 45},
						  {14, 16, 18, 78, 65},
						  {45, 26, 72, 23, 34}};
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		
		evg = sum / count;
		System.out.printf("합계 : %.2f", sum);
		System.out.printf("평균 : %.2f", evg);
	}
}
