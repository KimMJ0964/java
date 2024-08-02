package h.inherit.override;

public class Man {
	private String name;
	
	public Man() {}
	public Man(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void tellYourName() {
		System.out.println("이름 : " + this.name);
	}
	
	//alt + shift + s (창이뜬후)+ s
	@Override
	public String toString() {
		return "이름 : " + this.name;
	}
	
	
}
