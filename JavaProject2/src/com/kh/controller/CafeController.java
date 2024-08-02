package com.kh.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.vo.Drink;

public class CafeController {
	private Scanner sc = new Scanner(System.in);
	private List<Drink> list = new ArrayList<>(); 	// 고객 상품 구매 목록
	private List<Drink> menuList = new ArrayList<>();	// 상품 목록
	
	public void createMenu() {
		menuList.add(new Drink("커피", 5000));
		menuList.add(new Drink("체리콕", 4000));
		menuList.add(new Drink("쉐이크", 6500));
	}
	
	
	public void showCafeMenu() {
		System.out.println("\n===========================================");
		System.out.println("***[해당 상품들의 가격은 사이즈 S 기준입니다.]***");
		System.out.println("***[사이즈가 증가할 수록 가격이 500원 증가합니다.]***");
		for(int i = 0; i < menuList.size(); i++) {
			System.out.printf("[%d번] 상품명 : %s \t 가격 : %s",(i), menuList.get(i).getName(), menuList.get(i).getPrice());
			System.out.println();
		}
		System.out.println("===========================================");
	}
	
	//-----------------------------------------------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------------------------------------
	
	public int buyCafeMenu(int customerMoney) {
		showCafeMenu();
		int count = 0;
		// 상품 구매 여부
		while(true) {
			System.out.println("상품의 구매를 원하시면 y 아니면 n을 입력하시오.");
			char chose = sc.next().charAt(0);
			if(chose == 'Y' || chose == 'y') {
				return buyCafeMenu2(customerMoney, count);
			} else if(chose == 'N' || chose == 'n') {
				System.err.println("상품 구매를 취소하였습니다.");
				return 0;
			} else {
				System.err.println("잘못 입력하였습니다.");
			}
		}
	}
	
	public int buyCafeMenu2(int customerMoney, int count) {
		// 구매하고 싶은 상품 번호
		while(true) {
			System.out.print("구매하고 싶은 상품의 번호를 입력하시오. 입력 : ");		int num = sc.nextInt();
			if(0 <= num && num <= menuList.size()-1) {
				// 상품 사이즈
				while(true) {
					return buyCafeMenu3(customerMoney, count, num);
				}
			} else {
				System.err.println("잘못 입력하였습니다. 다시 번호를 입력하십시오.");
			}
		}
	}
	
	public int buyCafeMenu3(int customerMoney, int count, int num) {
		System.out.print("해당 상품의 사이즈(S/M/L)를 입력하시오. 입력 : ");	char chr = sc.next().charAt(0);
		if((chr == 'M' || chr == 'm' || chr == 'S' || chr == 's' || chr == 'L' || chr == 'l')) {
			menuList.get(num).setSize(chr);
			int sizeNum = 0;
			
			// 사이즈 증가에 따른 가격 추가
			if((chr == 'M' || chr == 'm')) {
				sizeNum = 500;
			} else if ((chr == 'L' || chr == 'l')) {
				sizeNum = 1000;
			}
			
			// 상품 갯수
			while(true) {
				sc.nextLine();
				try {
					System.out.print("구매하고 싶은 상품의 갯수를 입력하시오. 입력 : ");
					count = sc.nextInt();
					if(customerMoney >= ((menuList.get(num).getPrice() + sizeNum) * count)) {
						break;
					} else {
						System.err.println("돈이 부족합니다.");
						count = 0;
						break;
					}
				} catch(InputMismatchException e) {
					System.err.println("잘못 입력하였습니다. 다시 입력하십시오.");
				}
			}
			
			if(count > 0) {
				list.add(new Drink(menuList.get(num).getName(), chr,((menuList.get(num).getPrice() + sizeNum) * count) , count));
				menuList.get(num).setCount(count);
				System.out.println(menuList.get(num).toString());
				return ((menuList.get(num).getPrice() + sizeNum) * count);									
			} else {
				System.err.println("갯수가 0개 이하입니다. 주문을 종료합니다.");
				return 0;
			}
			
			
		} else {
			System.err.println("잘못 입력하였습니다. 다시 입력하십시오.");
		}
		return 0;
	}
	
	//-----------------------------------------------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------------------------------------
	
	public void showCustomerBuyList() {
		System.out.println("\n\n============= 구매 내역 =============");
		System.out.println("===================================");
		for(int i = 0; i < list.size(); i++) {
			list.get(i).showBuyList();
		}
		System.out.println("\n");
 	}
	
	public void addMenu(String menuName, int menuCost) {
		menuList.add(new Drink(menuName , menuCost));
		System.out.println(menuCost + "원의 " + menuName + "이(가) 추가되었습니다.");
	}
	
	public void deleteMenu(String menuName) {
		for(int i = 0; i < menuList.size(); i++) {
			if(menuList.get(i).getName().equals(menuName)) {
				menuList.remove(i);
				System.out.println(menuName + "은(는) 상품 목록에서 삭제되었습니다.");
			}
		}
	}
}

/*
 * public int buyCafeMenu(int customerMoney) {
		showCafeMenu();
		int count = 0;
		// 상품 구매 여부
		while(true) {
			System.out.println("상품의 구매를 원하시면 y 아니면 n을 입력하시오.");
			char chose = sc.next().charAt(0);
			if(chose == 'Y' || chose == 'y') {
				// 구매하고 싶은 상품 번호
				while(true) {
					System.out.print("구매하고 싶은 상품의 번호를 입력하시오. 입력 : ");		int num = sc.nextInt();
					if(0 <= num && num <= menuList.size()-1) {
						// 상품 사이즈
						while(true) {
							System.out.print("해당 상품의 사이즈(S/M/L)를 입력하시오. 입력 : ");	char chr = sc.next().charAt(0);
							if((chr == 'M' || chr == 'm' || chr == 'S' || chr == 's' || chr == 'L' || chr == 'l')) {
								menuList.get(num).setSize(chr);
								// 상품 갯수
								while(true) {
									sc.nextLine();
									try {
										System.out.print("구매하고 싶은 상품의 갯수를 입력하시오. 입력 : ");
										count = sc.nextInt();
										if(customerMoney >= (menuList.get(num).getPrice() * count)) {
											break;
										} else {
											System.err.println("돈이 부족합니다.");
											count = 0;
											break;
										}
									} catch(InputMismatchException e) {
										System.err.println("잘못 입력하였습니다. 다시 입력하십시오.");
									}
								}
								
								if(count > 0) {
									list.add(new Drink(menuList.get(num).getName(), chr,(menuList.get(num).getPrice() * count) , count));
									menuList.get(num).setCount(count);
									System.out.println(menuList.get(num).toString());
									return (menuList.get(num).getPrice() * count);									
								} else {
									System.err.println("갯수가 0개 이하입니다. 주문을 종료합니다.");
									return 0;
								}
								
								
							} else {
								System.err.println("잘못 입력하였습니다. 다시 입력하십시오.");
							}
						}
					} else {
						System.err.println("잘못 입력하였습니다. 다시 번호를 입력하십시오.");
					}
				}
			} else if(chose == 'N' || chose == 'n') {
				System.err.println("상품 구매를 취소하였습니다.");
				return 0;
			} else {
				System.err.println("잘못 입력하였습니다.");
			}
		}
	}
 * 
 */