package com.kh.view;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.kh.controller.CafeController;
import com.kh.vo.Customer;
//★☆

public class CafeMenu {
	// 필드
	Scanner sc = new Scanner(System.in);
	CafeController cc = new CafeController();
	Customer cm = new Customer();
	
	int choseNum = 0;
	int money = 0;
	int power = 0;
	
	// 메소드
	public void menu() {
		cc.createMenu(); 	// 메뉴 생성
		// 사용자 이름
		System.out.print("이름 입력 : ");		String name = sc.next();
		
		// 사용자 금액 입력
		while(true) {
			try {
				System.out.print("보유 금액 입력 : ");	 money = sc.nextInt();
				sc.nextLine();
				break;
			} catch (InputMismatchException e) {
				System.err.println("잘못 입력하였습니다. 다시 입력하십시오.");
				sc.nextLine();
			}
		}
		
		// 사용자 권한 입력 -> 관리자면 0, 고객이면 1
		while(true) {
			try {
				System.out.print("권한 입력 (관리자 : 0, 고객 : 1) : ");	 power = sc.nextInt();
				sc.nextLine();
				
				if(power == 0 || power == 1) {
					break;
				} else {
					System.err.println("잘못 입력하였습니다. 다시 입력하십시오.");
				}
			} catch (InputMismatchException e) {
				System.err.println("잘못 입력하였습니다. 다시 입력하십시오.");
				sc.nextLine();
			}
		}
		
		cm = new Customer(name, money, power);
		
		while(true) {
			System.out.println("★☆★☆★☆★ Kh 카페 ★☆★☆★☆★");
			System.out.println("\n=======================");
			System.out.println("1. 메뉴 고르기");
			System.out.println("2. 메뉴 보기");
			System.out.println("3. 구매 내역 확인");
			if(power == 0) {	// 권한이 관리자인 경우에만 출력
				System.out.println("4. 상품 추가");
				System.out.println("5. 상품 삭제");
			}
			System.out.println("9. 종료하기");
			System.out.println("=======================");
			System.out.print("번호 입력 : ");
			
			try {
				choseNum = sc.nextInt();
			} catch (InputMismatchException e){
				choseNum = 0;
			}
			sc.nextLine();
			
			switch (choseNum) {
			case 1:
				this.choseDrink();
				break;
			case 2:
				cc.showCafeMenu();
				break;
			case 3:
				this.showCustomerBuyList();
				break;
			case 4:
				if(power == 0) {
					this.addMenu();
					break;
				} else {
					System.err.println(name + "님은 이용 권한이 없습니다.");
					break;
				}
			case 5:
				if(power == 0) {
					this.deleteMenu();
					break;
				} else {
					System.err.println(name + "님은 이용 권한이 없습니다.");
					break;
				}
			case 9:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력하십시오.");
			}
		}
	}
	
	public void choseDrink() {
		int money = cm.getMoney();
		int cost = cc.buyCafeMenu(money);
		cm.costMoney(cost);
		System.out.println(cm.toString() + "\n");
	}
	
	public void showCustomerBuyList() {
		cc.showCustomerBuyList();
	}
	
	public void addMenu() {
		System.out.println("======= 추가할 메뉴 정보 입력 =======");
		System.out.print("메뉴 이름 : ");		String menuName = sc.nextLine();
		System.out.print("메뉴 가격 : ");		int menuCost = sc.nextInt();
		cc.addMenu(menuName, menuCost);
	}
	
	public void deleteMenu() {
		System.out.println("======= 삭제할 메뉴 정보 입력 =======");
		System.out.print("메뉴 이름 : ");		String menuName = sc.nextLine();
		cc.deleteMenu(menuName);
	}
}
