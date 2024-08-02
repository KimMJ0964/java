package com.kh.view;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.kh.controller.CafeController;
//★☆

public class CafeMenu {
	Scanner sc = new Scanner(System.in);
	int choseNum = 0;
	CafeController cc = new CafeController();
	
	public void menu() {
		while(true) {
			System.out.println("★☆★☆★☆★ Kh 카페 ★☆★☆★☆★");
			System.out.println("\n=======================");
			System.out.println("1. 메뉴 고르기");
			System.out.println("2. 메뉴 보기");
			System.out.println("3. 구매 내역 확인");
			System.out.println("9. 종료하기");
			System.out.println("\n=======================");
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
				break;
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
		cc.buyCafeMenu();
	}
}
