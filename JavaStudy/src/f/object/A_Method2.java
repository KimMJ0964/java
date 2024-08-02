package f.object;

public class A_Method2 {
	/*
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(adder(123, 444));
		System.out.println(adder(90));
		System.out.println(adder(90.0));
		answer();
	}
	
	// 			 반환형 메서드이름(매개변수)
	public static int adder(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	// 매개변수의 갯수 또는 타입이 다르다는 것은 메소드를 구분할 수 있다. -> 메서드 오버로디(메서드는 같지만 타입이 다른것)
	public static int adder(int num) {
		int result = num + 10;
		return result;
	}
	
	public static int adder(double num) {
		return (int)(num + 10);
	}
	
	static void answer() {
		System.out.println("대답");
	}
	
	//반환형이 달라도 다른 메소드가 아니다! 함수 호출시 반환형으로 어떤 함수를 불렀는지 구분할 수 없기 때문에
	/*
	 * public static void double adder(int num) {
	 * 		double result = num + 10.0;
	 * 		return result;
	 * }
	 */
}

