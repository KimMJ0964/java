package h.inherit.override2;

public class CircleController {
	public static final double PI = 3.14;
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		// pi 사용 : Math.PI
		double cirarea = Math.PI * c.getRadius() * c.getRadius();
		return c.toString() + " 면적 : " + cirarea;
	}
	
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		// pi 사용 : Math.PI
		double circum = Math.PI * c.getRadius() * 2;
		return c.toString() + " 둘레 : " + circum;
	}
}
