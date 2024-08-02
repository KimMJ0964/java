package test.t240731.object1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class FarmMenu {
	Scanner sc = new Scanner(System.in);
	FarmController fc = new FarmController();
	
	public void mainMenu() {
		System.out.println("========== KH 마트 ==========");
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 직원메뉴"); // adminMenu() 실행
			System.out.println("2. 손님"); // customerMenu()
			System.out.println("9. 종료"); // “프로그램 종료.” 출력 후 main()으로 리턴
			System.out.print("메뉴 번호 선택 : ");	int num = sc.nextInt();
			sc.nextLine();
			
			switch (num) {
				case 1: this.adminMenu(); break;
				case 2: this.customerMenu(); break;
				case 9: System.out.println("프로그램을 종료"); return;
				default: System.out.println("잘못 입력하였습니다. 다시 입력하십시오.");
			}
		}
	}
	
	public void adminMenu() {
		while(true) {
			System.out.println("******* 직원 메뉴 *******");
			System.out.println("1. 새 농산물 추가"); // addNewKind() 실행
			System.out.println("2. 종류 삭제"); // removeKind()
			System.out.println("3. 수량 수정"); // changeAmount()
			System.out.println("4. 농산물 목록"); // printFarm()
			System.out.println("9. 메인으로 돌아가기"); // mainMenu()로 리턴
			System.out.print("메뉴 번호 선택 : ");  int num = sc.nextInt();
			sc.nextLine();
			
			switch (num) {
				case 1: this.addNewKind(); break;
				case 2: this.removeKind(); break;
				case 3: this.changeAmount(); break;
				case 4: this.printFarm(); break;
				case 9: return;
				default: System.out.println("잘못입력하였습니다. 다시 입력하십시오.");
			}
		}
	}
	
	public void customerMenu() {
		System.out.println("현재 KH마트 농산물 수량");
		this.printFarm();
		while(true) {
			System.out.println("******* 고객 메뉴 *******");
			System.out.println("1. 농산물 사기"); // buyFarm() 실행
			System.out.println("2. 농산물 빼기"); // removeFarm()
			System.out.println("3. 구입한 농산물 보기"); // printBuyFarm()
			System.out.println("9. 메인으로 돌아가기"); // mainMenu()로 리턴
			System.out.print("메뉴 번호 선택 : "); 		int num = sc.nextInt();
			sc.nextLine();
			
			switch (num) {
				case 1: this.buyFarm(); break;
				case 2: this.removeFarm(); break;
				case 3: this.printBuyFarm(); break;
				case 9: return;
				default: System.out.println("잘못 입력하였습니다. 다시 입력하십시오.");
			}
		}		
	}
	
	public void addNewKind() {
		while(true) {
			System.out.println("1. 과일  /  2. 채소  /  3. 견과");
			System.out.print("추가할 종류 번호 입력 : ");	int num = sc.nextInt();
			sc.nextLine();
			
			if(num != 1 && num != 2 && num != 3) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하십시오.");
				continue;
			}
			
			System.out.print("농산물 이름 입력 : ");  String name = sc.nextLine();
			System.out.print("농산물 수량 입력 : ");	 int amount = sc.nextInt();
			sc.nextLine();
			
			Farm newItem = null;
			switch (num) {
				case 1:
					newItem = new Fruit("과일", name);
					break;
				case 2:
					newItem = new Vegetable("채소", name);
					break;
				case 3:
					newItem = new Nut("견과", name);
					break;
			}
			
			if(fc.addNewKind(newItem, amount)) {
				System.out.println("새 농작물이 추가되었습니다.");
				break;
			} else {
				System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void removeKind() {
		while(true) {
			System.out.println("1. 과일  /  2. 채소  /  3. 견과");
			System.out.print("삭제할 종류 번호 입력 : ");	int num = sc.nextInt();
			sc.nextLine();
			
			if(num != 1 && num != 2 && num != 3) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하십시오.");
				continue;
			}
			
			System.out.print("농산물 이름 입력 : ");  String name = sc.nextLine();
			sc.nextLine();
			
			Farm removeItem = null;
			switch (num) {
				case 1:
					removeItem = new Fruit("과일", name);
					break;
				case 2:
					removeItem = new Vegetable("채소", name);
					break;
				case 3:
					removeItem = new Nut("견과", name);
					break;
			}
			
			if(fc.removeKind(removeItem)) {
				System.out.println("농작물 삭제에 성공하셨습니다.");
				break;
			} else {
				System.out.println("농산물 삭제에 실패하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void changeAmount() {
		while(true) {
			System.out.println("1. 과일  /  2. 채소  /  3. 견과");
			System.out.print("수량 변경할 종류 번호 입력 : ");	int num = sc.nextInt();
			sc.nextLine();
			
			if(num != 1 && num != 2 && num != 3) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하십시오.");
				continue;
			}
			
			System.out.print("농산물 이름 입력 : ");  String name = sc.nextLine();
			System.out.print("농산물 수량 입력 : ");	 int amount = sc.nextInt();
			sc.nextLine();
			
			Farm replaceItem = null;
			switch (num) {
				case 1:
					replaceItem = new Fruit("과일", name);
					break;
				case 2:
					replaceItem = new Vegetable("채소", name);
					break;
				case 3:
					replaceItem = new Nut("견과", name);
					break;
			}
			
			if(fc.changeAmount(replaceItem, amount)) {
				System.out.println("농작물 수량 변경에 성공되었습니다.");
				break;
			} else {
				System.out.println("농산물 수량 변경에 실패하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void printFarm() {
		HashMap<Farm, Integer> map = new HashMap<>(fc.printFarm());
		for(Farm f : map.keySet()) {
			System.out.printf("%s(%d개)\n", f.toString(), map.get(f));
		}
	}
	
	public void buyFarm() {
		while(true) {
			System.out.println("1. 과일  /  2. 채소  /  3. 견과");
			System.out.print("구매할 종류 번호 입력 : ");	int num = sc.nextInt();
			sc.nextLine();
			
			if(num != 1 && num != 2 && num != 3) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하십시오.");
				continue;
			}
			
			System.out.print("농산물 이름 입력 : ");  String name = sc.nextLine();
			sc.nextLine();
			
			Farm buyItem = null;
			switch (num) {
				case 1:
					buyItem = new Fruit("과일", name);
					break;
				case 2:
					buyItem = new Vegetable("채소", name);
					break;
				case 3:
					buyItem = new Nut("견과", name);
					break;
			}
			
			if(fc.buyFarm(buyItem)) {
				System.out.println("농작물 구매에 성공하셨습니다.");
				break;
			} else {
				System.out.println("농산물 구매에 실패하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void removeFarm() {
		while(true) {
			System.out.println("1. 과일  /  2. 채소  /  3. 견과");
			System.out.print("구매취소할 종류 번호 입력 : ");	int num = sc.nextInt();
			sc.nextLine();
			
			if(num != 1 && num != 2 && num != 3) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하십시오.");
				continue;
			}
			
			System.out.print("농산물 이름 입력 : ");  String name = sc.nextLine();
			sc.nextLine();
			
			Farm removeItem = null;
			switch (num) {
				case 1:
					removeItem = new Fruit("과일", name);
					break;
				case 2:
					removeItem = new Vegetable("채소", name);
					break;
				case 3:
					removeItem = new Nut("견과", name);
					break;
			}
			
			if(fc.removeFarm(removeItem)) {
				System.out.println("농작물 구매 취소에 성공하셨습니다.");
				break;
			} else {
				System.out.println("농산물 구매 취소에 실패하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void printBuyFarm() {
		ArrayList<Farm> list = fc.printBuyFarm();
		Iterator<Farm> iter = list.iterator();
		while (iter.hasNext()) {
			Farm f = iter.next();
			if (f instanceof Fruit) {
				Fruit tmp = (Fruit)f;
				System.out.printf(" %s: %s\n", tmp.getKind(), tmp.getName());
			} else if (f instanceof Vegetable) {
				Vegetable tmp = (Vegetable)f;
				System.out.printf(" %s: %s\n",  tmp.getKind(), tmp.getName());
			} else if (f instanceof Nut) {
				Nut tmp = (Nut)f;
				System.out.printf(" %s: %s\n",  tmp.getKind(), tmp.getName());
			}
		}
	}
}
