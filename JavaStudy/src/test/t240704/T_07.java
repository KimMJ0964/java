package test.t240704;

import java.util.Scanner;

public class T_07 {
	/*
	 * 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
	 * 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
	 * 
	 * ex.
	 * 문자열 : application
	 * 문자 : i
	 * application에 i가 존재하는 위치(인덱스) : 4 8
	 * i의 갯수 : 2
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String chrSave = "";
		String str = "";
		int count = 0;
		
		System.out.print("문자열 : ");
		str = sc.nextLine();
		char[] strArr = new char[str.length()];
		for(int i = 0; i < strArr.length; i++) {
			strArr[i] = str.charAt(i);
		}
		
		System.out.print("문자 : ");
		char chr = sc.next().charAt(0);
		System.out.print(str + "에 " + chr + "가 존재하는 위치(인덱스) : ");
		for(int i = 0; i < strArr.length; i++) {
			if (chr == strArr[i]) {
				System.out.print(i + " ");
				count++;
			}
		}
		
		System.out.println("\n" + chr + "의 갯수 : " + count);
		
		
		sc.close();
	}
}
