package n.generic;

public class Run {
	public static void main(String[] args) {
		// 객체를 생성하는 시점에 어떤 타입을 사용할지
		// 타입인자를 정해준다.
		
		Box<String> aBox = new Box<>();
		
		String[] arr = new String[10];
		aBox.setObArr(arr);
		
		aBox.getObArr()[0] = "Hello";
		aBox.getObArr()[1] = "World!";
		System.out.println(aBox.toString()); 
	}
}
