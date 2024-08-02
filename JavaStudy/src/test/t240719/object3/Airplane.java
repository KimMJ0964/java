package test.t240719.object3;

public class Airplane extends Plane{
	Airplane() {}
	
	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	@Override
	public void flight(int distance) {
		this.setFuelSize(getFuelSize()-((distance / 10) * 30));
	}
}
