package test.t240715.object2;

public class T_02 {
	public static void main(String[] args) {
		// 스플릿을 이용하여 숫자 나누기
		
		// 배열에 들어있는 모든 요소를 가져와서 사용하는 경우가 매우많다.
		// for(자료형 변수명 : 배열) {
		//		변수명 -> 배열에 있는 모든 요소가 한번씩 들어와서 반복
		//}
		String str = "1.22,4.12,5.93,8.71,9.34";
		String[] arr = str.split(",");
		double[] dArr = new double[arr.length];
		for(int i = 0; i < arr.length; i++) {
			dArr[i] = Double.parseDouble(arr[i]);
		}
		
		double sum = 0;
		for(int i = 0; i < dArr.length; i++) {
			sum += dArr[i];
		}
		
//		for(double d : dArr) {
//			sum +=d;
//		}
		
 		System.out.printf("합계 : %.3f", sum);
		System.out.println();
		System.out.printf("합계 : %.3f", (sum / dArr.length));
	}
}
