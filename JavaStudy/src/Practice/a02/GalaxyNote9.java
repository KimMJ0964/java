package Practice.a02;

public class GalaxyNote9 extends SmartPhone implements NotePen{
	
	public GalaxyNote9() {
		super();
	}

	@Override
	public String charge() {
		// TODO Auto-generated method stub
		return "고속충전, 고속 무선 충전";
	}

	@Override
	public String makeCall() {
		// TODO Auto-generated method stub
		return "번호를 누르고 통화버튼을 누름";
	}

	@Override
	public String takeCall() {
		// TODO Auto-generated method stub
		return "전화받기 버튼을 누름";
	}

	@Override
	public String picture() {
		// TODO Auto-generated method stub
		return "1300만 화소 트리플 카메라";
	}

	@Override
	public String touch() {
		// TODO Auto-generated method stub
		return "정전식, 와콤펜 지원";
	}

	@Override
	public boolean bluetoothPen() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public String printInformation() {
		return "갤럭시 노트9은 삼성에서 만들어졌고 제원은 다음과 같다."
				+ "\n" + this.makeCall()
				+ "\n" + this.takeCall()
				+ "\n" + this.picture()
				+ "\n" + this.charge()
				+ "\n" + this.touch()
				+ "\n블루투스 펜 탑재 여부" + this.bluetoothPen();
	}
}
