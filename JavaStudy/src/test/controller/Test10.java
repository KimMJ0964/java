package test.controller;

public class Test10 {
	/*
	 * 2차원 배열에 들어있는 데이터들 중 3의 배수만 골라내서 새로운 1차원배열에 기록하고 출력한다. 단 중복 값은 하나만 기록되게 한다.
	 */
	public static void main(String[] args) {
		int[][] array = { { 12, 41, 36, 56 }, { 82, 10, 12, 61 }, { 14, 16, 18, 78 }, { 45, 26, 72, 23 } };
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				count++;
			}
		}

		int[] copyAr = new int[count];
		count = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i][j] % 3 == 0) {
					copyAr[count] = array[i][j];
				}
				count++;
			}
		}

		System.out.print("copyAr : ");
		for (int i = 0; i < copyAr.length; i++) {
			if (copyAr[i] != 0)
				System.out.print(copyAr[i] + " ");
		}
	}
}
