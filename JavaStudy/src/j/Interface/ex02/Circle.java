package j.Interface.ex02;

public class Circle implements Shape{
	private double radius;
	
	public Circle() {}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * this.radius * this.radius;
	}
}
