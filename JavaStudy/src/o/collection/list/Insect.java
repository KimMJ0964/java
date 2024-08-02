package o.collection.list;

public class Insect {
	private String kind;
	private String name;
	
	public Insect() {}
	public Insect(String kind, String name) {
		super();
		this.kind = kind;
		this.name = name;
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
	
	@Override
	public String toString() {
		return "이 곤충의 종류는 " + this.kind + ", 이름은 " + this.name;
	}
}
