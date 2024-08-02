package test.t240731.object1;

public class Farm {
	private String kind;

	public Farm() {}
	public Farm(String kind) {
		super();
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	@Override
	public String toString() {
		return "Farm [kind=" + kind + "]";
	}
	
	@Override
	public int hashCode() {
		// return Objects.hash(this.getKind());
		return this.getKind().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Farm) {
			if(((Farm)obj).getKind().equals(this.getKind())) {
				return true;
			}
		}
		return false;
	}
}
