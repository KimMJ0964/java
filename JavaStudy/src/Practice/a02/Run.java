package Practice.a02;

public class Run {
	public static void main(String[] args) {
		PhoneController pc = new PhoneController();
		
		String[] str = pc.method();
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i] + "\n");
		}
	}
}
