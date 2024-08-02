package Library;

import java.util.Scanner;

// 사용자와의 소통을 위한 입출력을 담당하는 클래스
public class BookMenu {
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("*** WelCome Kh Library! ***");
			System.out.println("**** 메인 메뉴 ****");
			System.out.println("1. 새 도서 등록");
			System.out.println("9. 종료");
			System.out.print("\n번호 입력 : ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1:
				this.insertBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력하십시오.");
			}
		}
	}
	
	public void insertBook() {
		// 도서 정보를 저장
		System.out.println("*** 새 도서 추가 ***");
		System.out.println("책 정보를 입력해주세요.");
		System.out.print("도서명 : ");	String title = sc.nextLine();
		System.out.print("저자명 : ");	String author = sc.nextLine();
		System.out.print("장르 : ");		String genre = sc.nextLine();
		System.out.print("값 : ");		int price = sc.nextInt();
		sc.nextLine();
		
		Book newBook = new Book(title, author, genre, price);
		bc.insertBook(newBook);
	}
}
