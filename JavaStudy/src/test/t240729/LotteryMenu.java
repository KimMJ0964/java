package test.t240729;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class LotteryMenu {
	Scanner sc = new Scanner(System.in);
	LotteryController lc = new LotteryController();
	
	public int choiceNum = 0;
	public void mainMenu() {
		System.out.println("========== KH 추첨 프로그램 ==========");
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 추첨 대상 추가"); 		// insertObject() 실행
			System.out.println("2. 추첨 대상 삭제"); 		// deleteObject()
			System.out.println("3. 당첨 대상 확인"); 		// winObject()
			System.out.println("4. 정렬된 당첨 대상 확인"); 	// sortedWinObject()
			System.out.println("5. 당첨 대상 검색"); 		// searchWinner()
			System.out.println("9. 종료"); 				// “프로그램 종료.” 출력 후 main()으로 리턴
			System.out.print("메뉴 번호 선택 : ");		choiceNum = sc.nextInt();
			sc.nextLine();
			
			switch (choiceNum) {
			case 1: insertObject(); break;
			case 2: deleteObject(); break;
			case 3: winObject(); break;
			case 4: sortedWinObject(); break;
			case 5: searchWinner(); break;
			case 9: System.out.println("프로그램 종료");	return;
			
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력하십시오.");
			}
		}
	}
	
	public void insertObject() {
		System.out.print("추첨 대상 수 : ");	int num = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<num; i++) {
			System.out.print("추첨자 이름 : ");	String name = sc.nextLine();
			System.out.print("핸드폰 번호 : ");	String phoneNum = sc.nextLine();
			
			Lottery l = new Lottery(name, phoneNum);
			boolean check = lc.insertObject(l);
			
			// check가 false일때
			if(!check) {
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
				i--;
			}
			System.out.println();
		}
		System.out.println(num + "명 추가 완료되었습니다.");
	}
	
	public void deleteObject() {
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");			String name = sc.nextLine();
		System.out.print("핸드폰 번호 : ");	String phoneNum = sc.nextLine();
		
		Lottery l = new Lottery(name, phoneNum);
		
		if(lc.deleteObject(l)) {
			System.out.println("삭제가 완료되었습니다.");
		} else {
			System.out.println("존재하지 않는 대상입니다.");
		}
	}
	
	public void winObject() {
		HashSet win = lc.winObject();
		
		if(win != null) {
			System.out.println(win);
		} else {
			System.out.println("당첨결과가 없습니다.");
		}
		
	}
	
	public void sortedWinObject() {
		TreeSet sortedList = lc.sortedWinObject();
		if(sortedList.isEmpty()) {
			System.out.println("당첨 결과가 없습니다.");
		} else {
			for(Object obj : sortedList) {
				System.out.println(obj);
			}
		}
	}
	
	public void searchWinner() {
		System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");			String name = sc.nextLine();
		System.out.print("핸드폰 번호 : ");	String phone = sc.nextLine();
		
		if(lc.searchWinner(new Lottery(name, phone))) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		} else {
			System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
		}
	}
}
