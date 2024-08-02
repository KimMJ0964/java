package h.inherit.override2;

public class RectangleController {
	Rectangle r = new Rectangle();
	
	public RectangleController() {
		this.r = new Rectangle();
	}
	
	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		// pi 사용 : Math.PI
		double calcarea = r.getHeight() * r.getWidth();
		return r.toString() + " 면적 : " + calcarea;
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		// pi 사용 : Math.PI
		double perimeter = 2 * (r.getHeight() + r.getWidth());
		return r.toString() + " 둘레 : " + perimeter;
	}
}
