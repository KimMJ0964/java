package test.t240731.object1;

import java.util.Objects;

public class Vegetable extends Farm{
	private String name;

	public Vegetable() {}
	public Vegetable(String kind, String name) {
		super(kind);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return super.getKind() + " : " + this.getName();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.name, super.getKind());
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Vegetable) {
			if(((Vegetable)obj).getName().equals(this.getName())&&((Vegetable)obj).getKind().equals(this.getKind())) {
				return true;
			}
		}
		return false;
	}
}
