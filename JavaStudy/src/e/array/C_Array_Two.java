package e.array;

public class C_Array_Two {
	/*
	 * 2차원 배열
	 * 자료형이 같은 1차원 배열의 묶음으로 배열안에 다른 배열이 존재한다.
	 * 2차원 배열은 할당된 공간마다 인덱스 번호를 두개 부여(앞 번호는 몇번째 1차원배열인지(행), 뒷번호는 1차원배열의 몇번째 인덱스인지(열) 
	 */
	public static void main(String[] args) {
		/*
		 * 1. 2차원 배열 선언(1차원 배열의 묶음을 참조하는 2차원 배열 참조 변수를 만든다.)
		 * 자료형[][] 배열명;
		 */
//		int[][] arr;
		
		/*
		 * 2. 배열 할당(실제 m크기의 1차원 배열 n개를 만들어서 참조)
		 * 배열명 = new 자료형[n][m];
		 * 
		 * 1차원 배열의 참조 변수 묶음 먼저 생성할 수 있다.
		 * 배열명 = new 자료형[n][];
		 * 배열명[0] = new 자료형[m];
		 * 배열명[1] = new 자료형[m];
		 * 			....
		 * 배열명[n] = new 자료형[m];
		 */
		// arr = new int[3][4];		// 4개짜리 1차원배열 3개 묶음 생성
//		arr = new int[3][];		// 1차원 배열 3개 묶음 생성
//		arr[0] = new int[4];
//		arr[1] = new int[4];
//		arr[2] = new int[4];
		
		// 배열 선언과 동시에 할당하는 것이 일방적
//		int[][] arr = new int[3][4];
//		
//		// 3. 배열의 값 대입
//		// 배열명[배열 순번][인덱스] = 값;
//		
//		arr[0][0] = 1;
//		arr[1][1] = 2;
//		arr[2][3] = 3;
		
		// 3행 3열짜리 문자열 배열을 선언하고 0행 0열부터 2행 2열까지 차례대로 접근하여 (행, 열) 값을 저장하기
		String[][] strArr = new String[3][3];
		
		//첫번째 for문은 .length, 두번째 for문은 [i].length
		for(int i = 0; i < strArr.length; i++) {	
			System.out.println();
			for(int j=0; j < strArr[i].length; j++) {
				strArr[i][j] = i + "행" + j + "열";
				System.out.print(strArr[i][j] + "\t");
			}
		}
	}
}
