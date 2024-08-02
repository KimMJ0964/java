package test.t240716.object2;

public class UserTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		User[] user = new User[3];

		user[0] = new User("user01", "pass01", "김철수", 32, 'M', "010-1234-5678");
		user[1] = new User("user02", "pass02", "이영희", 25, 'F', "010-5555-7777");
		user[2] = new User("user03", "pass03", "황진이", 20, 'F', "010-9874-5632");

		System.out.println("--------- user list ---------");
		for(int i = 0; i < user.length; i++)
			System.out.println(user[i]);
		
		System.out.println("--------- copy user list ---------");
		User[] copyUsers = new User[user.length];
		for(int i = 0; i < copyUsers.length; i++) { 
			copyUsers[i] = (User)user[i].clone();
			System.out.println(copyUsers[i]);
		}
		
		// for(User copy : copyUsers) {		for each 문 출력
		//		System.out.print(copy.toString);
		// }
		
		System.out.println("--------- 비교 결과 ---------");
		for(int i = 0; i < copyUsers.length; i++)
			System.out.println(copyUsers[i].equals(user[i]));
		
	}
}
