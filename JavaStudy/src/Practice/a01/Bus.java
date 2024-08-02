package Practice.a01;

public class Bus implements Traffic{
	private String name;
	private int pay;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public Bus(String name, int pay) {
		super();
		this.name = name;
		this.pay = pay;
	}

	@Override
	public void go() {
		System.out.println("도로를 달립니다.");
	}

	@Override
	public void in() {
		
	}


}
