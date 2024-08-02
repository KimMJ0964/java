package a.basic;

public class Output {
	public static void main(String[] args) {
		//한줄을 출력하고 개행을 한다 = println
		System.out.println("안녕하세요.");
		System.out.println("김용담입니다.");
		//단순하게 출력을 할 때 사용하는 출력문 = print
		System.out.println(3);
		System.out.println(5 + 1);
		System.out.print("제 성별은 ");
		//print에서 개행을 하고싶을 때는 \n을 사용한다
		System.out.println("남자입니다.\n\n");
		
		String name = "김민재";
		System.out.println("안녕하세요. 저는 " + name + "입니다.");
		// System.out.printf(문자열 포맷, 값1, 값2);
		/*
		 * 포맷만에서 쓸 수 있는 키워드
		 * %d : 정수
		 * %c : 문자
		 * %s : 문자열
		 * %f : 실수 ( 소수점 아래로 원하는 만큼 표시하기 위해서는 %.nf )
		 */
		System.out.printf("저의 이름은 %s입니다. 나이는 %d이고 키는 %.1f입니다.", "아무개", 25, 171.5);	// %s : 문자열 = String name, %.nf : n은 원하는 소수점까지 표시
	}
}
