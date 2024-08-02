package Practice.a01;

public class Airplane implements Traffic{
	private String name;
	private int pay;
	
	public Airplane(String name, int pay) {
		super();
		this.name = name;
		this.pay = pay;
	}

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

	@Override
	public void go() {
		System.out.println("날아갑니다.");
	}

	@Override
	public void in() {
		
	}


}
