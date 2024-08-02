package Practice.a01;

public class TrafficController {
	Bus bus = new Bus("5300번", 1500);
	Train train = new Train("1호선", 2000);
	Airplane airplane = new Airplane("아시안항공", 100000);
	
	public int bus(int money) {
		if(this.bus.getPay() > money) {
			System.out.println("버스 요금이 부족합니다.");
			return 0;
		} else {
			System.out.println("버스를 탑승하였습니다.");
			return this.bus.getPay();
		}
	}
	
	public int train(int money) {
		if(this.bus.getPay() > money) {
			System.out.println("전철 요금이 부족합니다.");
			return 0;
		} else {
			System.out.println("전철를 탑승하였습니다.");
			return this.train.getPay();
		}
	}
	
	public int airplane(int money) {
		if(this.bus.getPay() > money) {
			System.out.println("비행기 요금이 부족합니다.");
			return 0;
		} else {
			System.out.println("비행기를 탑승하였습니다.");
			return this.airplane.getPay();
		}
	}

}
