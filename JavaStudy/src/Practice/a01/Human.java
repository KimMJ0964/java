package Practice.a01;

public class Human {
	private String name;
	private int money;
	
	public Human() {}
	public Human(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int pay(int payMoney) {
		return this.money -= payMoney;
	}
	
	
}
