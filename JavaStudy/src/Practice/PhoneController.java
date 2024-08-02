package Practice;

public class PhoneController {
	String[] result = new String[2];
	
	public String[] method() {
		Phone[] phone = new Phone[2];
		
		phone[0] = new GalaxyNote9();
		phone[1] = new V40();
		
		for(int i = 0; i < phone.length; i++) {
			result[i] = ((SmartPhone)phone[i]).printInformation();
		}
		
		return result;
	}
}
