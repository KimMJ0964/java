package test.t240711.object2;

public class Run {
	/*
	 * 다음과 같은 코드를 실행했을 때, 예시와 같은 결과가 출력되도록 tv클래스를 작성
	 * TV myTv = new TV("삼성", 2020, 65, 100000;
	 * myTv.show();
	 * TV myTv2 = new TV("LG", 2024, 85, 500000;
	 * myTv2.show();
	 * 
	 * 삼성에서 만든 2020년형 65이치 TV 가격 : 100000
	 * LG에서 만든 2024년형 85인치 TV 가격 : 500000
//		TV myTv = new TV("삼성", 2020, 65, 100000);
//		myTv.show();
//		TV myTv2 = new TV("LG", 2024, 85, 500000);
//		myTv2.show();
 * ============================================================================
 	 * 
 	 * one이라는 Human 객체를 생성하고 해당 객체를 이용해 myTV와 myTV를 구매 가능한지
 	 * 확인하는 코드
 	 * 
 	 * Human one = new Human("최지원", 10000000);
 	 * one.buy(myTV);
 	 * "최지원님 구매내역"
 	 * "삼성에서 만든 2020년형 65이치 TV 가격 : 100000" -> (돈차감)
 	 * "남은잔액 : ????"
 	 * 	or
 	 * "최지원님 잔액이 부족하여 구매할 수 없습니다."			
	 */
	public static void main(String[] args) {
		TV myTv = new TV("삼성", 2020, 65, 100000);
		myTv.show();
		TV myTv2 = new TV("LG", 2024, 85, 500000);
		myTv2.show();
		
		Human one = new Human("최지원", 100000);
	 	one.buy(myTv);
	}
}
