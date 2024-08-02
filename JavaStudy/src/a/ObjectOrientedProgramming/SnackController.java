package a.ObjectOrientedProgramming;

public class SnackController {
	private Snack s = new Snack();
	
	SnackController() {
		System.out.println("SnackController 생성됨");
	}
	
	public String savaData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "저장 안료되었습니다.";
		
	}
	
	public String confirmData() {
		return s.information();
	}
}
