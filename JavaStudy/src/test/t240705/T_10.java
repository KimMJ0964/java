package test.t240705;

import java.util.Scanner;

public class T_10 {
	/*
	 * 사용자로부터 문자열을 입력 받고 문자열에서 검색될 문자를 입력 받아 해당 문자열에 그 문자가
	 * 몇 개 있는지 개수를 출력, "더 하시겠습니까?"라고 추가로 물어보고
	 * 이 떄, N이나 n이 나오면 프로그램을 끝내고 Y나 y면 계속 진행하며 Y,N이 아닌
	 * 다른 문자를 입력했을 경우 "잘못된 대답입니다. 다시 입력해주세요."를 출력
	 * 를 반복
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			// 입력 받을 문자열
			String str;
			System.out.print("문자열 입력 : ");		str = sc.next();
			
			// 검색할 문자 입력
			char word;
			System.out.print("문자열 입력 : ");		word = sc.next().charAt(0);
			
			// 문자열에 검색할 문자 갯수
			int count = 0;
			System.out.print("해당 문자열에 검색한 문자의 인덱스 위치 : ");
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == word) {
					count++;
					System.out.print(i + "번 ");
				}
			}
			System.out.println("\n문자열에 원하는 문자는 " + count + "개 있습니다.");
			// 좀 더 진행할지 물음
			System.out.println("좀 더 하시겠습니까?");
			
			// 검색할 문자 이제 안쓰니 재활용
			word = sc.next().charAt(0);
			
			if((word != 'Y') || (word != 'y') || (word != 'N') || (word != 'n')) {
				System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
			} else if((word == 'Y') || (word == 'y')) {
				System.out.println("프로그램을 계속합니다.\n\n");
			}else if((word == 'N') || (word == 'n')) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
	}
	/*Scanner sc = new Scanner(System.in);
		while(true) {
			String chrSave = "";
			String str = "";
			int count = 0;
			
			System.out.print("문자열 : ");
			str = sc.next();
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
			
			while(true) {
				System.out.println("더 하시겠습니까?");
				chr = sc.next().charAt(0);
			
				if((chr !='n' && chr !='N' && chr !='M' && chr !='m')) {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
				} else {
					break;
				}
			}
			
			if(chr == 'y' || chr == 'Y') {
				System.out.println("프로그램을 계속 진행합니다.");
			} else if(chr == 'N' || chr == 'n') {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
			}
		}
		sc.close();
	 * 
	 * 
	 */
}
