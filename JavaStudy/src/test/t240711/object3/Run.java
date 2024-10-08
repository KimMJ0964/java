package test.t240711.object3;

import java.util.Scanner;

public class Run {
	/*
	 * 우리는 도서관에서 책을 관리하는 프로그램을 만들려고한다.
	 * 해당 클레스는 도서관에 책을 등록할 떄, 사용하는 book객체를 생성할 Book클래스이다.
	 * 필요하다고 생각하는 데이터와 기능을 구현
	 * 
	 * 사용자로부터 제목, 장르, 저자, 책번호를 입력받아
	 * b1이라는 객체를 생성하고 생성된 객체의 toString메서드로 호출해 모든 정보 확인
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		Book[] bArr = new Book[10];
		
		int menu = 0;
		while(menu != 9) {
			System.out.println(" ***** 도서 관리 프로그램 ***** ");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 목록 출력");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 삭제");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");		menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1:
				System.out.println(" ** 책 등록 ** ");
				System.out.print("제목 : ");		String title = sc.nextLine();
				System.out.print("장르 : ");		String genre = sc.nextLine(); 
				System.out.print("저자 : ");		String author = sc.nextLine(); 
				System.out.print("번호 : ");		int no = sc.nextInt();
				
				for(int i = 0; i < bArr.length; i++) {
					if(bArr[i] == null) {					
						bArr[i] = new Book(title, genre, author, no);;
						System.out.println(bArr[i]);
						break;
					} else if(i == (bArr.length - 1)){
						System.out.println("이미 등록할 수 있는 책이 가득 찼습니다.");
						break;
					}
				}
				break;
			case 2:
				System.out.println(" ***** 등록 도서 목록 ***** ");
				
				for(int i = 0; i < bArr.length; i++) {
					if(bArr[i] == null) {
						break;
					}
					System.out.println(bArr[i]);
				}
					
				break;
			case 3:
				System.out.println(" ***** 도서 검색 ***** ");
				System.out.println("검색할 책 이름을 입력 : "); 		String findName = sc.nextLine();
				int check = 1;
				for(int i = 0; i < bArr.length; i++) {
					if(bArr[i] == null) {
						break;
					} else if (findName.equals(bArr[i].getTitle())) {
						System.out.println(bArr[i]);
						check = 0;
						break;
					}
				}
				if(check ==1 ) {
					System.out.println("입력하신 도서는 존재하지 않습니다.");
				}
				break;
			case 4:
				System.out.println(" ***** 도서 삭제 ***** ");
				
				for(int i = 0; i < bArr.length; i++) {
					if(bArr[i] == null) {
						break;
					}
					System.out.println(bArr[i]);
				}
				
				System.out.print("삭제할 도서의 번호 입력 : ");	int num = sc.nextInt();
				
				for(int i = 0; i < bArr.length; i++) {
					if(bArr[i] == null) {
						System.out.println("삭제할 도서의 번호를 찾지 못했습니다.");
						break;
					}else if(num == bArr[i].getNo()) {
						System.out.println("삭제 데이터 : " + bArr[i]);
						// 찾음
						// 앞으로 하나씩 옮기는 알고리즘
						for(int j = i; i < bArr.length - 1; j++) {
							bArr[j] = bArr[j+1];
						}
						bArr[bArr.length+1] = null;
						
						break;
					}
				}
				
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
			
			}
		}
		
		
		
		sc.close();
	}
}
