package k.exception.ex1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {
	/*
	 * 에러종류
	 *  - 시스템 에러 : 컴퓨터의 오작동 발생하는 에러 -> 소스코드로 해결이 안됨 -> 심각
	 *  - 컴파일 에러 : 소스코드 문법상의 오류 -> 빨간줄로 애초에 오류를 알려준다.(개발자의 실수) -> 발견과 해결이 쉬움
	 *  - 런타임 에러 : 코드 상으로는 문제가 없지만 프로그램 실행도중 발생하는 에러(사용자의 실수 또는 개발자가 미처 처리하지 않은 기능)
	 *  - 논리 에러 : 문법적으로도 문제없고 실행했을 때도 문제는 없지만 프로그램의 의도와 맞지않는 동작이나 결과가 나타나는 에러
	 *  
	 * 컴파일 에러, 런타임 에러, 논리 에러 같은 개발자가 예측 가능하며 수정할 수 있는 에러들을 가지고 작업
	 *  -> 이런것들을 예외라고 한다. -> Exception
	 *  
	 * 이런 "예외"가 발생했을 때를 "처리"하는 방법을 "예외처리"라고 함.
	 * 
	 * * 예외처리를 하는 목적
	 *  - 예외처리를 하지 않고 그대로 예외가 발생한 경우, 프로그램이 비정상적으로 종료될 수 있다.
	 *  
	 * * 예외처리방법
	 *  - try ~ catch문
	 *  - throw (떠넘기기)
	 *  
	 * * 사용한 리소스 반납방법
	 *  - finally에서 반납
	 *  - try-with-resource
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RunException ex = new RunException();
		ex.method01();
		ex.method02();
		try {
			ex.methodA();
		} catch (IOException e) {
			System.out.println("main에서 해결");
			e.printStackTrace();
		} finally {
			// 예외가 발생하든 안하든 try catch 종료 후, 마지막에 발생하는 코드
			sc.close();
		}
//		try(Scanner sc = new Scanner(System.in)) {
//			ex.methodA();
//		} catch (IOException e) {
//			System.out.println("main에서 해결");
//			e.printStackTrace();
//		} 
		
		ex.myInfo(null);
	}	
}
