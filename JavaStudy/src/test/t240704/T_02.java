package test.t240704;

import java.util.Scanner;

public class T_02 {
	/*
	 * 사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요. 단, 관리자는 회원관리, 게시글 관리,
	 * 게시글 작성, 게시글 조회, 댓글 작성이 가능하고 회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고 비회원은 게시글 조회만
	 * 가능합니다.
	 * 
	 * ex. 권한을 확인하고자 히는 회원 등급 : 가능한 권한
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = 0;
		while (loop < 1) {
			System.out.print("권한을 확인하고자 하는 회원 등급 : ");
			String power = sc.nextLine();
			switch (power) {
			case "관리자": {
				System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
				loop = 1;
				break;
			}
			case "회원": {
				System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
				loop = 1;
				break;
			}
			case "비회원": {
				System.out.println("게시글 조회");
				loop = 1;
				break;
			}
			default:
				System.out.println("해당 회원 등급은 존재하지 않습니다.");
				continue;
			}
		}
	}
}
