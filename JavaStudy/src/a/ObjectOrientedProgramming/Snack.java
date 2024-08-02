package a.ObjectOrientedProgramming;

public class Snack {
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	Snack() {}
	
	Snack(String kind, String name, String flavor, int numOf, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
		System.out.println("Snack 생성됨");
	}
	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getNumOf() {
		return numOf;
	}

	public void setNumOf(int numOf) {
		if(numOf <= 0) {
			this.numOf = 1;
		}
		this.numOf = numOf;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price <= 0) {
			this.price = 1;
		}
		this.price = price;
	}

	public String information() {
		String info = this.kind + "(" + this.name + "-" + this.flavor + ") " 
		+ this.numOf + "개 " + this.price + "원";
		
		return info;
	}
	
	
}
