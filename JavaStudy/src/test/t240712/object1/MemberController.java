package test.t240712.object1;

public class MemberController {
	public static final int SIZE = 10;
	private Member[] m = new Member[SIZE];
	
	// 현재 존재하는 멤버 수 반환
	public int existMemberNum() {
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				count++;
			} else {
				break;
			}
		}
		return count;
	}

	// 어아다 중복확인 하는 메소드
	// 중복 -> false 아니면 -> true
	public Boolean checkId(String inputId) {
		for (int i = 0; i < m.length && m[i] != null; i++) {
			if(m[i] == null) {
				return false;
			}
			if (m[i].getId().equals(inputId)) {
				// 중복 id 찾음
				return false;
			}
		}
		// id 사용가능
		return true;
	}
	
	// Member 객체를 객체 배열에 저장하는 메소드 - for문으로 배열을 돌아 인덱스가 널인 배열에 새로운 맴버 생성
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] == null) {
				m[i] = new Member(id, name, password, email, gender, age);
				break;
			}
		}
	}
	
	// id로 회원을 조회하는 메소드
	public String searchId(String id) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				return m[i].inform();
			}
		}
		return null;
	}
	
	// 이름으로 회원을 조회하는 메소드
	public Member[] searchName(String name) {
		Member[] mArr = new Member[this.SIZE];	// 새로운 맴버 배열 생성
		int index = 0;	// 인덱스에 넣을 값생성
		for(int i = 0; i < m.length; i++) {	// for문으로 m배열의 길이만큼 돌면서
			if(m[i] != null && m[i].getName().equals(name))	// 해당 배열이 null이 아니면서 입력한 이름과 같은 값의 배열인덱스를 찾음
				mArr[index++] = m[i];	// 찾은 경우 mArr 인덱스에 m 인덱스 값넣고 반환
		}
		return mArr;
	}

	// 이메일로 회원을 조회하는 메소드
	public Member[] searchEmail(String email) {
		Member[] mArr = new Member[this.SIZE];
		int index = 0;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getName().equals(email))
				mArr[index++] = m[i];
		}
		return mArr;
	}

	// 이메일 변경 메소드
	public Boolean updatePassword(String id, String password) {
		for (int i = 0; i < m.length; i++) {
			// 배열 m의 i번째 인덱스가 null이 아니고 사용자 입력한 id 값이 같을 때
			if (m[i] != null && m[i].getId().equals(id)) {
				m[i].setPassword(password);
				return true;
			}
		}
		return false;
	}

	// 이름 변경 메소드
	public Boolean updateName(String id, String name) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				m[i].setName(name);
				return true;
			}
		}
		return false;
	}

	// 이메일 변경 메소드
	public Boolean updateEmail(String id, String email) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				m[i].setEmail(email);
				return true;
			}
		}
		return false;

	}
	
	// 한 회원만 삭제하는 메소드
	// true -> 정상적으로 삭제
	// false -> id를 찾지 못함
	public Boolean delete(String id) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] == null) {	// 배열 인덱스 값이 비어있는지 확인
				return false;		// 비어있으면 false 반환( 못찾음 )
			} else if(m[i].getId().equals(id)) {	// 배열 인덱스 값과 id 값이 같은 ( 찾음 )
				for(int j=i; j<m.length - 1; j++) {		// 찾은 배열 인덱스 부터 m 배열의 전체 길이 - 1만큼 for문을 돔
					m[j] = m[j+1];	// 배열 +1 인덱스의 값을 앞으로 땡김
				}
				m[m.length - 1] = null;	// 앞으로 땡기니 맨 뒷 인덱스 값은 0
				return true;
			}
		}
		return false;
	}

	// 전체 회원을 삭제하는 메소드
	public void deleteAll() {
		this.m = new Member[this.SIZE];	// 새롭게 초기화하는 것으로 값 전체를 없애는것이 가능
	}

	// Member객체 반환 메소드
	public Member[] printAll() {
		return this.m;
	}
}
