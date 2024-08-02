package Practice.a01;

public class Train implements Traffic{
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

	public Train(String name, int pay) {
		super();
		this.name = name;
		this.pay = pay;
	}

	@Override
	public void go() {
		System.out.println("철도를 따라 달립니다.");
	}

	@Override
	public void in() {
		
	}


}
