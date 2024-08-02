package test.t240709.object2;

public class Product {
	private String pName;
	private int price;
	private String brand;
	
	public Product() {}
	
	public String getPName() {
		return this.pName;
	}
	
	public Product(String pName, int price, String brand) {
		super();
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}

	public int getPrice() {
		return this.price;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public void setPName(String pName) {
		this.pName = pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void information() {
		System.out.println("이름 : " + this.pName);
		System.out.println("가격 : " + this.price);
		System.out.println("브랜드 : " + this.brand);
	}
}
