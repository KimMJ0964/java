package test.t240704;

import java.util.Scanner;

public class T_01 {
	public static void main(String[] args) {
	/*
	 * 아이디, 비밀번ㅎ를 정해두고 로그인 기능을 작성하세요.
	 * 로그인 성공 시, "로그인 성공"
	 * 아이디가 틀렸을 시, "아이디가 틀렸습니다."
	 * 비밀번호가 틀렸을 시 "비밀번호가 틀렸습니다."를 출력하세여.
	 */
		
	final String ID = "myId";
	final String PWD = "myPassword12";
	
	Scanner sc = new Scanner(System.in);
	String idIp, pwdip;
	
	System.out.print("아이디 : ");
	idIp = sc.nextLine();
	
	System.out.print("비밀번호 : ");
	pwdip = sc.nextLine();
	
	if(idIp.equals(ID) && pwdip.equals(PWD)) {
		System.out.println("로그인 성공");
	} else if (idIp.equals(ID) == false && pwdip.equals(PWD)) {
		System.out.println("아이디가 틀렸습니다.");
	} else if (idIp.equals(ID) && pwdip.equals(PWD) == false) {
		System.out.println("비밀번호가 틀렸습니다.");
	} else {
		System.out.println("아이디와 비밀번호가 틀렸습니다.");
	}
	
	sc.close();
	
	}
}
