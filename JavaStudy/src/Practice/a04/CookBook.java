package Practice.a04;

public class CookBook extends Book{
	private boolean coupon;
	
	public CookBook() {}
	public CookBook(boolean coupon) {
		super();
		this.coupon = coupon;
	}
	
	public boolean isCoupon() {
		return coupon;
	}
	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
	@Override
	public String toString() {
		return "CookBook [coupon=" + coupon + "]";
	}
}
