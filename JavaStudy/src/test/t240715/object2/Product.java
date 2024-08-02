package test.t240715.object2;

public class Product {
	private String name;
	private int price;
	private int quantity;
	
	public Product() {}
	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String information() {
		return "이름 : " + this.name + "\n가격 : " 
	+ this.price + "\n개수 : " + this.quantity;
	}
	
}
