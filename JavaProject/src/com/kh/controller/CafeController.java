package com.kh.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.vo.Drink;

public class CafeController {
	Scanner sc = new Scanner(System.in);
	
	private Drink[] dk = {
					new Drink("커피", 5000),
					new Drink("체리콕", 4000),
					new Drink("케이크", 6500)
					};
	
	public void showCafeMenu() {
		System.out.println("\n====================================");
		for(int i = 0; i < dk.length; i++) {
			System.out.printf("[%d번] 상품명 : %s \t 가격 : %s",(i), dk[i].getName(), dk[i].getPrice());
			System.out.println();
		}
		System.out.println("====================================");
	}
	
	public void buyCafeMenu() {
		showCafeMenu();
		int count = 0;
		while(true) {
			System.out.println("상품의 구매를 원하시면 y 아니면 n을 입력하시오.");
			char chose = sc.next().charAt(0);
			if(chose == 'Y' || chose == 'y') {
				while(true) {
					System.out.print("구매하고 싶은 상품의 번호를 입력하시오. 입력 : ");		int num = sc.nextInt();
					if(0 <= num && num <= dk.length) {
						while(true) {
							System.out.print("해당 상품의 사이즈(S/M/L)를 입력하시오. 입력 : ");	char chr = sc.next().charAt(0);
							if((chr == 'M' || chr == 'm' || chr == 'S' || chr == 's' || chr == 'L' || chr == 'l')) {
								dk[num].setSize(chr);
								while(true) {
									sc.nextLine();
									try {
										System.out.print("구매하고 싶은 상품의 갯수를 입력하시오. 입력 : ");
										count = sc.nextInt();
										break;
									} catch(InputMismatchException e) {
										System.out.println("잘못 입력하였습니다. 다시 입력하십시오.");
									}
								}
								dk[num].setCount(count);
								System.out.println(dk[num].toString());
								return;
							} else {
								System.out.println("잘못 입력하였습니다. 다시 입력하십시오.");
							}
						}
					} else {
						System.out.println("잘못 입력하였습니다. 다시 번호를 입력하십시오.");
					}
				}
			} else if(chose == 'N' || chose == 'n') {
				System.out.println("상품 구매를 취소하였습니다.");
				return;
			} else {
				System.out.println("잘못 입력하였습니다.");
			}
		}
	}
}
