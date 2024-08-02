package test.t240717.object1;

import java.util.Scanner;

public class LibraryMenu {
	LibraryController lc = new LibraryController();
	Scanner sc = new Scanner(System.in);
	
	int choseNum = 0;
	public void mainMenu() {
		System.out.print("이름 : ");		String name = sc.next();
		System.out.print("나이 : ");		int age = sc.nextInt();
		System.out.print("성별 : ");		char gender = sc.next().charAt(0);
		
		Member mb = new Member(name, age, gender, 0);
		lc.insertMember(mb);
		// 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
		 // LibraryController의 insertMember() 메소드에 전달
		while(true) {
			System.out.println("\n==== 메뉴 ====");
			System.out.println("1. 마이페이지"); 
			System.out.println("2. 도서 전체 조회"); 
			System.out.println("3. 도서 검색"); 
			System.out.println("4. 도서 대여하기"); 
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");		choseNum = sc.nextInt();
			
			switch (choseNum) {
			case 1:
				Member m = lc.myInfo();
				System.out.println(m);
				break;
			case 2:
				this.selectAll();
				break;
			case 3:
				this.searchBook();
				break;
			case 4:
				this.rentBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못입력하였습니다. 다시 입력하십시오.");
			}
		}
	}
	
	public void selectAll() {
		Book[] bList = lc.selectAll();
		
		this.printBookList(bList);
	}
	
	public void searchBook() {
		sc.nextLine();
		System.out.print("검색할 제목 키워드 : ");	String keyword = sc.nextLine();
		Book[] bookList = lc.searchBook(keyword);
		
		this.printBookList(bookList);
	}
	
	
	public void rentBook() {
		this.selectAll();
		System.out.print("대여할 도서 번호 선택 : "); 	choseNum = sc.nextInt();
		int result = lc.rentBook(choseNum);
		switch(result) {
		case 0:
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1:
			System.out.println("나이 제한으로 대여가 불가능합니다.");
			break;
		case 2:
			System.out.println("성공적으로 대여완료 요리 쿠폰이 지급되어 마이페이지에서 확인하십시오.");
}
	}
	
	public void printBookList(Book[] bList) {
		for(int i = 0; i < bList.length; i++) {
			if(bList[i] == null) {
				break;
			}
			System.out.println(i + "번 도서 : " + bList[i].toString());
		}
	}
}
