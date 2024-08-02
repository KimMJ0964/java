package test.t240719.object3;

public class Cargoplane extends Plane{
	Cargoplane() {}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	public void flight(int distance) {
		this.setFuelSize(this.getFuelSize()-((distance / 10) * 50));
	}
}
