package j.Interface.ex02;

public class Rectangle implements Shape{
	private double width;
	private double height;
	
	public Rectangle() {}
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return this.width * this.height;
	}
	
	
}
