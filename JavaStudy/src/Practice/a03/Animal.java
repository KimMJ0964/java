package Practice.a03;

public abstract class Animal {
	private String name;
	private String kinds;
	
	public Animal() {}
	public Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}
	
	@Override
	public String toString() {
		return "저의 이름은 " + this.name + "이고, 종은 " + this.kinds + "이며 ";
	}
	
	public abstract void speak();
}
