package a.basic;

// 1. import : Scanner를 사용하기 위해서 외부로부터 가져온다.
import java.util.Scanner;

public class Input {
	/*
	 * 키보드로 값을 입력하는 방법
	 * Scanner를 사용한다.
	 * (java.util.Scanner 클래스를 이용한다.)
	 * 
	 * [사용법]
	 * Scanner 이름 = new Scanner(System.in);
	 * ex) Scanner sc = new Scanner(System.in);
	 * 
	 * sc.next(); : 사용자가 입력한 값 중, 공백이 있을 경우, 공백 이전까지의 값만 가져온다. (안녕하세요. 김민재입니다. -> 안녕하세요.)
	 * sc.nextLine(); : 사용자가 입력한 값 중, \n(개행문자)를 포함하는 한 라인을 읽고 \n 버린 나머지 값만 가져온다.
	 * 
	 * sc.nextByte(), sc.nextShort(), sc.nextInt(), sc.nextLong()
	 * sc.nextFloat(), sc.nextDouble(),
	 * 위처럼 정수나 실수를 입력받는 코드를 작성했을 때, \n도 함께 들어오기 때문에
	 * sc.nextLine()을 통해서 비워주는 코드를 작성해야 한다.
	 * sc.close() : 더 이상 스캐너를 사용하지 않겠다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		String str1, str2;
		// 안녕하세요. 잘 가세요. 입력 -> 버퍼
		str1 = sc.next();
		// str2 = sc.nextLine();
		sc.nextLine();	// 버퍼에서 \n(엔터값)을 비워주는 코드
		str2 = sc.nextLine();
		
		System.out.println("str1을 입력한 값 : " + str1);	// 안녕하세요. 출력
		System.out.println("str2을 입력한 값 : " + str2);	// 잘 가세요. 출력
		*/
		
		System.out.println("=============================================================");
		String name, address;
		int age;
		float height;
		
		System.out.print("이름을 입력해 주세요. 이름 : ");
		name = sc.nextLine();
		
		System.out.print("나이를 입력해 주세요. 나이 : ");
		age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("주소를 입력해 주세요. 주소 : ");
		address = sc.nextLine();
		
		System.out.print("키를 입력해 주세요. 키 : ");
		height= sc.nextFloat();
		sc.nextLine();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("키 : " + height);
		System.out.println("=============================================================");
		sc.close();
	}
}
