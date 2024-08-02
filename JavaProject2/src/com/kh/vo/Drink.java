package com.kh.vo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Drink {
	private String name;	// 상품명
	private char size;		// 크기(S, M, L)
	private int price;		// 가격
	private int count;		// 갯수
	
	public Drink() {}
	public Drink(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Drink(String name, char size, int price, int count) {
		super();
		this.name = name;
		this.size = size;
		this.price = price;
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSize() {
		return size;
	}
	public void setSize(char size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		int sizeNum = 0;
		
		// 사이즈 증가에 따른 가격 추가
		if((this.size == 'M' || this.size == 'm')) {
			sizeNum = 500;
		} else if ((this.size == 'L' || this.size == 'l')) {
			sizeNum = 1000;
		}
		
		return "주문하신 " + this.size + "사이즈의 " + this.name + " " +this.count + " 개 나왔습니다."
				+ "가격은 " + ((this.price + sizeNum) * this.count) + "입니다." ;
	}
	
	public void showBuyList() {
		System.out.printf("상품명 \t 사이즈 \t 가격 \t 갯수\n");
		System.out.println("-----------------------------------");
		System.out.printf("%s \t %s \t %d \t %d\n", this.name, this.size, this.price, this.count);
		System.out.println("===================================");
		
		try(FileWriter fw = new FileWriter("receipt.txt");
				BufferedWriter bw = new BufferedWriter(fw);     ) {
				
				bw.write("영수증\n");
				bw.write("상품명 \t 사이즈 \t 가격 \t 갯수\n");
				bw.write("-----------------------------------");
				bw.write(this.name +" \t "+ this.size +" \t " + this.price +" \t "+ this.count + "\n");
				bw.write("-----------------------------------");
				bw.flush();
				
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
