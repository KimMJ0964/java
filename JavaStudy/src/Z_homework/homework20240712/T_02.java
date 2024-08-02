package Z_homework.homework20240712;

public class T_02 {
	public static void main(String[] args) {
		// 스플릿을 이용하여 숫자 나누기
		String str = "1.22,4.12,5.93,8.71,9.34";
		
		String[] arr = str.split(",");
		int count = 0;
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += Double.parseDouble(arr[i]);
			count++;
		}
		
		System.out.printf("합계 : %.3f", sum);
		System.out.println();
		System.out.printf("합계 : %.3f", (sum / count));
	}
}
