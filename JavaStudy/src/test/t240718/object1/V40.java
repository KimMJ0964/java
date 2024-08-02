package test.t240718.object1;

public class V40 extends SmartPhone implements NotePen{

	public V40() {
		super();
		this.setMaker("LG");
	}
	
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}
	
	public String takeCall() {
		return "수신 버튼을 누름";
	}
	public String picture() {
		return "1200, 1600만 트리플 카메라";
	}
	public String charge() {
		return "고속 충전, 고속 무선 충전";
	}
	public String touch() {
		return "정전식";
	}
	@Override
	public boolean bluetoothPen() {
		return false;
	}
	
	public String printlnformation() {
		String result = "";
		
		result += "V40은 "+ this.getMaker() +"에서 만들어졌고 제원은 다음과 같다.\n";
		result += this.makeCall() + "\n";
		result += this.takeCall() + "\n";
		result += this.picture() + "\n";
		result += this.charge() + "\n";
		result += this.touch() + "\n";
		result += this.bluetoothPen() + "\n";
		
		return result;
	}


}
