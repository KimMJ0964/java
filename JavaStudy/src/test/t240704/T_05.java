package test.t240704;

public class T_05 {
	/*
	 * 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용해서 순서대로 배열 인덱스에 넣은 후, 그 값을 출력하세요.
	 */
	public static void main(String[] args) {
		int[] intArr = new int[10];

		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = i + 1;
			System.out.println("intArr[" + i + "]의 인덱스 값은 " + intArr[i] + "입니다.");
		}

		/*
		 * 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반목문을 이용하여 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		 */
		System.out.println("================== 배열 역순 ==================");
		int[] intArr2 = new int[10];

		for (int i = 0; i < intArr2.length; i++) {
			intArr2[i] = intArr2.length - i;
			System.out.println("intArr2[" + i + "]의 인덱스 값은 " + intArr2[i] + "입니다.");
		}
	}
}
