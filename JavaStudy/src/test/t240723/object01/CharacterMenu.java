package test.t240723.object01;

import java.util.Scanner;

public class CharacterMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		CharacterController cc = new CharacterController();
		
		try {
			System.out.print("문자열 입력 : ");	String str = sc.nextLine();
			int length = cc.countAlpha(str);
			System.out.println(str + "에 포함된 영문자 갯수 : " + length);
		} catch(CharCheckException e) {
			System.out.println("문자열에 공백이 포함되었습니다.");
			e.printStackTrace();
		} finally {	// finally : 예외가 발생하든 말든 무조건 발생하게 해주는 것
			sc.close();
			System.out.println("잘 종료되었습니다.");
		}
	}
}
