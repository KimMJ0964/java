package test.t240718.object1;

public class Run {

	public static void main(String[] args) {
		PhoneController pc = new PhoneController();
		
		String[] result = pc.method();
		
		for(String res : result) {
			System.out.println(res);
		}
	}
}
