package test.t240709.object1;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	// 생성자
	public Member() {}
	
	// 아이디, 비밀번호, 이름을 넘겨받아 초기화하는 생성자
	public Member(String memberId, String memberPwd, String memberName) {
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
	}
	
	// 메소드
	public void changeName(String name) {	// memberName의 필드값을 넘겨받은 name값으로 변경
		this.memberName = name;
	}
	
	public void printName() {	// memberName의 값을 출력하는 메소드
		System.out.println(this.memberName);
	}
	
}
