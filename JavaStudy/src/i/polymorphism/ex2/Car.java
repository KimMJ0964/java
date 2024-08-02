package i.polymorphism.ex2;

public class Car {
	private String color;
	private String fuel;
	private int year;
	
	public Car(String color, String fuel, int year) {
		super();
		this.color = color;
		this.fuel = fuel;
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [year=" + year + ", color=" + color + ", fuel=" + fuel + "]";
	}
	
	public void drive() {
		System.out.println("부릉 부릉~");
	}
}
