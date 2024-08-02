package Practice.a04;

import java.util.Scanner;

public class LibraryMenu {
	LibraryController lc = new LibraryController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		// 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
		 // LibraryController의 insertMember() 메소드에 전달
		System.out.print("이름 입력 : "); 	String name = sc.next();
		System.out.print("나이 입력 : "); 	int age = sc.nextInt();
		System.out.print("성별 입력 : "); 	char gender = sc.next().charAt(0);
		
		Member member = new Member(name, age, gender);
		System.out.println("==== 메뉴 ===="); // 무한 반복 실행
		System.out.println("1. 마이페이지"); // LibraryController의 myInfo() 호출하여 출력
		System.out.println("2. 도서 전체 조회"); // LibraryMenu의 selectAll() 호출
		System.out.println("3. 도서 검색"); // LibraryMenu의 searchBook() 호출
		System.out.println("4. 도서 대여하기"); // LibraryMenu의 rentBook() 호출
		System.out.println("9. 프로그램 종료하기");
		System.out.print("메뉴 번호 : ");
	}
	
	public void selectAll() {}
	
	public void searchBook() {}
	
	public void rentBook() {}
}
