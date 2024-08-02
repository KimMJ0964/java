package b.operator;

public class Operator3 {
	/*
	 * 산술 연산자
	 * 종류 : + , -, * , / , %
	 * 순서 : * , / , % 가 + , - 보다 우선순위이다.
	 * 
	 * 복합 대입 연산자
	 * 산술 연산자와 대입연산자를 결합해서 사용할 수 있다.
	 * 
	 * +=, /=, -=, *=, %=
	 * 
	 * a = a + 3; -> a += 3;
	 */
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = (++a) + b;	// ++a => 6 + 10 = 16
		int d = c / a;	
		System.out.println(d);
		int e = c % a;
		System.out.println(e);
		int f = e++;	// f에는 e값이 들어가고 그 후, e값이 1증가한다.
		System.out.println(f);
		int g = (--b) + (d--);
		System.out.println(g);
		int h = 2;
		// a=6, b=9, c=16, d=1, e=5, f=4, g=11, h=2
		int i = (a++) + b / (--c / f) * (g-- - d)%(++e + h);
		// 6 + 9 / 3 * 10 % 8
		// 답 : 12
		System.out.println(i);
	}
}
