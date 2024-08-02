package e.array;

public class B_Array_Copy {
	public static void main(String[] args) {
//		int[] origin = {1, 2, 3, 4, 5};
//		System.out.println("== 원본 배열 출력==");
//		for(int i = 0; i < origin.length; i++) {
//			System.out.print(origin[i] + " ");
//		}
//		
//		// 단순하게 origin을 다시 대입시킨 copy 배열을 생성
//		int[] copy = origin;
//		System.out.println("\n== 복사 배열 출력==");
//		for(int i = 0; i < copy.length; i++) {
//			System.out.print(copy[i] + " ");
//		}
//		
//		copy[2] = 99;
//		System.out.println("\n\n----------== 복사본 값 변경 후 ==----------\n\n");
//		System.out.println("== 원본 배열 출력==");
//		for(int i = 0; i < origin.length; i++) {
//			System.out.print(origin[i] + " ");
//		}	// copy의 값만 수정해도 원본의 값이 함께 변경된다.
			// -> origin과 copy가 같은 메모리를 참조하고 있기 때문(참조 변수의 주소값이 동일) origin, copy : 참조 변수(블로그에 쓴다면 참조변수*)
			// 얕은복사 : 주소 값 복사
		
		// 배열 복사 방법
		/*
		 * 1. for문을 활용한 방법
		 * 
		 * 새로운 배열을 만들어서 반복문을 통해 원본 배열의 값들을 새로운 배열에 대입한다.
		 */
		
//		int[] origin = {1 ,2 ,3 ,4 ,5 };
//		
//		int[] copy = new int[origin.length];	// origin과 같은 크기의 copy배열 생성
//		
//		// origin배열에 있는 모든 값을 copy배열로 전달
//		for(int i = 0; i < origin.length; i++) {
//			copy[i] = origin[i];
//		}
//		
//		copy[2] = 99;
//		
//		System.out.println("== 원본 배열 출력==");
//		for(int i = 0; i < origin.length; i++) {
//			System.out.print(origin[i] + " ");
//		}
//		
//		// 단순하게 origin을 다시 대입시킨 copy 배열을 생성
//		System.out.println("\n== 복사 배열 출력==");
//		for(int i = 0; i < copy.length; i++) {
//			System.out.print(copy[i] + " ");
//		}
		
		// 2. 새로운 배열 생성 후, arraycopy() 메소드를 이용해서 복사하기
		int[] origin = {1, 2, 3, 4, 5};
		// int[] copy = origin.clone();
		int[] copy = new int[10];	// 0 0 0 0 0 0 0 0 0 0

		// System.arraycopy(원본 배열, 복사 시작 인덱스, 복사본 배열, 복사본 배열의 시작 인덱스, 복사할 갯수)
		System.arraycopy(origin, 2, copy, 4, 3);	// orgin의 2인덱스를 copy의 4인덱스부터 3개 복사
		// 0 0 0 0 0 0 0 0 0 0 -> 0 0 0 0 3 4 5 0 0 0
		
		System.out.println("=== 복사본 배열 출력 ===");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
	}
}
