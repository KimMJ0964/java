package test.t240709.object4;

public class Book {
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	Book() {
		this("미입력", "미정", "미입력", 0, 0.0);
	}
	
	Book(String title, String publisher, String author) {
		this(title, publisher, author, 0, 0.0);
	}
	
	Book(String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}

	public String getTitle() {
		return this.title;
	}
	
	public String getPublisher() {
		return this.publisher;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public double getDiscountRate() {
		return this.discountRate;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public void inform() {
		System.out.println("제목 : " + this.title + "\n출판사 : " 
	+ this.publisher + "\n작가 : " + this.author + "\n가격 : " 
	+ this.price + "\n할인율 : " + this.discountRate + "\n");
	}
	
}
