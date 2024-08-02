package test01;

public class Food {
	private String name;
	private int kcal;
	
	public Food() {}
	public Food(String name, int kcal) {
		super();
		this.name = name;
		this.kcal = kcal;
	}
	
	@Override
	public String toString() {
		return "Food 객체 샘플 : \"" + this.name + "\"," + this.kcal;
	}
}
