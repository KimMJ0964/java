package com.kh.vo;

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
		return "주문하신 " + this.size + "사이즈의 " + this.name + " " +this.count + " 개 나왔습니다."
				+ "가격은 " + (this.price * this.count) + "입니다." ;
	}
}
