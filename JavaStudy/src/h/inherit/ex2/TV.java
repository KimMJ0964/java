package h.inherit.ex2;

public class TV extends Product{
	/*
	 * 필드에는 int inch정보를 가지고 있고 information을 오버라이딩하여
	 * 기본 Product의 정보 + inch 정보 출력
	 */
	private int inch;
	
	public TV() {} 
	
	public TV(String brand, String pCode, String pName, int price ,int inch) {
		super(brand, pCode, pName, price);
		this.inch = inch;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
	
	@Override
	public String toString() {
		return "TV [inch=" + inch + "]";
	}

	@Override
	public String information() {
		return super.information() + " 인치 : " + this.inch;
	} 
	
}
