package e.array;

import java.util.Scanner;

public class A_Array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
//		// 1. 크기가 10인 정수형 배열 생성 후
//		int[] num = new int[10];
//		
//		// 2. 반복문을 통해서 0번 인덱스부터 마지막 인덱스까지 모든 값을 1로 초기화
//		for(int i = 0; i < num.length; i++) {
//			num[i] = 1;
//		}
//		
//		// 3. 반복문을 통해서 0 ~ 마지막 인덱스까지 출력
//		for(int i = 0; i < num.length; i++) {
//			System.out.println(i + "번째 인덱스의 값 : " + num[i]);
//		}
		
		// 4. 사용자에게 배열의 길이를 입력받아 해당 크기의 문자열 배열을 생성하라		
//		int num;
//		
//		System.out.print("길이 입력 : ");
//		num = sc.nextInt();
//		
//		String[] str = new String[num];
//		System.out.print("문자열 배열의 길이 : " + str.length + "\n");
//	
//		// 5. 반복문을 활용하여 매번 사용자에게 과일명을 입력하여 그 값을 strArr에 대입하라(0 ~ 마지막 인덱스)
//		String fruitName;
//		
//		for(int i = 0; i < str.length; i++) {
//			System.out.print("과일을 입력 : ");
//			fruitName = sc.next();
//			str[i] = fruitName;
//		}
//		
//		// 6. 반복문을 이용해서 str에 있는 모든 값들을 출력
//		for(int i = 0; i < str.length; i++) {
//			System.out.println((i)+ "의 인덱스의 과일 이름 : " + str[i]);
//		}
		
		// 7. 사용자에게 문자열 하나 입력받은 후, 각 각의 인덱스에 있는 문자들을 char배열에 옮겨담기
//		System.out.print("문자열을 입력 : ");
//		String str;
//		str = sc.next();
//		char[] chArr = new char[str.length()];
//		
//		for(int i = 0; i < chArr.length; i++) {
//			chArr[i] = str.charAt(i);
//		}
//		
//		for(int i = 0; i < chArr.length; i++) {
//			System.out.println(i + "번째 인덱스 : [" + chArr[i] + "]");
//		}
		
		// 8. 사용자에게 배열의 길이를 입력받아 해당 길이의 정수형배열 arr을 생성한다.
		// arr에 모든 인덱스 값에 1 ~ 100 사이의 랜덤값을 할당해주고 이 중, 짝수인 값의 총 합을 구해라
		
		System.out.print("배열의 길이를 입력 : ");
		int arrNum = sc.nextInt();
		int[] arr = new int[arrNum];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
			System.out.println(i + "번째의 인덱스의 값 : " + arr[i]);
			if(arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("인덱스의 짝수 값의 합 : " + sum);
		
		
		sc.close();
	
	}
}
