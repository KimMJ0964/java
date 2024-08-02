package PersonTest;


public class Test {
	public static void main(String[] args) {
		Person[] pArr = new Person[3];

		for(int i = 0; i <= pArr.length; i++) {
			pArr[i] = new Person(i + "번");
			System.out.println(pArr[i].getName());
		}
	}
}
