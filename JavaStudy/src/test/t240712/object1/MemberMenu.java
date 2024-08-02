package test.t240712.object1;

import java.util.Scanner;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();

	public MemberMenu() {
	}

	public void mainMenu() {
		int choice = 0;

		while (choice != 9) {
			System.out.println("최대 등록 가능한 회원 수는 " + MemberController.SIZE + "명입니다.");
			System.out.println("현재 등록된 회원 수는 " + mc.existMemberNum() + "명입니다");
			if (mc.existMemberNum() != 10) {
				System.out.println("1. 새 회원 등록");
			} else {
				// 현재 등록된 회원 수가 10명일 때
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 :");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				this.insertMember();
				break;
			case 2:
				this.searchMember();
				break;
			case 3:
				this.updateMember();
				break;
			case 4:
				this.deleteMember();
				break;
			case 5:
				this.printAll();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못 입력했습니다.");
			}
		}
	}

	public void insertMember() {
		// 회원 등록에 필요한 아이디, 이름, 비밀번호, 이메일, 성별, 나이를
		System.out.println("새 회원을 등록합니다.");
		String id;
		while (true) {
			System.out.print("아이디 : ");
			id = sc.next();
			if (mc.checkId(id) == true) { // 사용가능
				break;
			} else { // 사용불가능
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}
		}

		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		char gender;
		while (true) {
			System.out.print("성별(M / F) : ");
			gender = sc.next().charAt(0);
			if ((gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f')) {
				break;
			} else {
				System.out.println("성별을 다시 입력하세요.");
			}
		}

		System.out.print("나이 : ");
		int age = sc.nextInt();

		mc.insertMember(id, name, password, email, gender, age);

	}

	public void searchMember() {
		// 메뉴 번호에 따라 각 메소드로 이동되며 9번을 입력했을 경우
		// “메인으로 돌아갑니다.” 출력 후 mainMenu()로 돌아감
		// 메뉴 번호를 잘못 입력했을 경우 “잘못 입력하셨습니다.” 출력 후
		// mainMenu()로 돌아감
		int num = 0;
		while (num != 9) {
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 :");
			num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				this.searchId();
				break;
			case 2:
				this.searchName();
				break;
			case 3:
				this.searchEmail();
				break;
			case 9:
				System.out.println("메인으로 돌아가기");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
		}
	}

	public void searchId() {
		// 검색할 아이디를 사용자에게 입력 받고 입력 받은 데이터를
		// mc의 searchId() 메소드의 매개변수로 넘김, 반환 값에 따라
		// 검색 결과 없으면 “검색 결과가 없습니다.” 출력 후 mainMenu()로 돌아감
		// 검색 결과가 있으면 “찾으신 회원 조회 결과입니다.” 출력 후
		// 회원 검색 결과 출력
		System.out.println("검색할 아이디 : ");
		String id = sc.next();
		
		String memberInfo = mc.searchId(id);
		if (memberInfo == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(memberInfo);
		}
	}

	public void searchName() {
		String name;
		
		System.out.println("검색할 이유 : ");
		name = sc.next();
		
		Member[] mArr = mc.searchName(name);
		if(mArr[0] == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(int i = 0; i < mArr.length; i++) {
				if(mArr[i] == null) {
					break;
				}
				String info = mArr[i].inform();
				System.out.println(info);
			}
		}
	}

	public void searchEmail() {
	}

	public void updateMember() {
		// 메뉴 번호에 따라 각 메소드로 이동되며 9번을 입력했을 경우
		// “메인으로 돌아갑니다.” 출력 후 mainMenu()로 돌아감
		// 메뉴 번호를 잘못 입력했을 경우 “잘못 입력하셨습니다.” 출력 후
		// mainMenu()로 돌아감
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아기기");

		int num = sc.nextInt();
		sc.nextLine();

		switch (num) {
		case 1:
			this.updatePassword();
			break;
		case 2:
			this.updateName();
			break;
		case 3:
			this.updateEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아가기");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}

	}

	public void updatePassword() {
		System.out.print("수정할 id : ");
		String id = sc.next();
		System.out.print("수정할 비밀번호 : ");
		String password = sc.next();

		if (mc.updatePassword(id, password)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}

	public void updateName() {
		System.out.print("수정할 id : ");
		String id = sc.next();
		System.out.print("수정할 이름 : ");
		String name = sc.next();

		if (mc.updateName(id, name)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}

	public void updateEmail() {
		System.out.print("수정할 id : ");
		String id = sc.next();
		System.out.print("수정할 이메일 : ");
		String email = sc.next();

		if (mc.updateName(id, email)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}

	public void deleteMember() {
		// 메뉴 번호에 따라 각 메소드로 이동되며 9번을 입력했을 경우
		// “메인으로 돌아갑니다.” 출력 후 mainMenu()로 돌아감
		// 메뉴 번호를 잘못 입력했을 경우 “잘못 입력하셨습니다.” 출력 후
		// mainMenu()로 돌아감
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아기기");
		
		int num = sc.nextInt();
		sc.nextLine();

		switch (num) {
		case 1:
			this.deleteOne();
			break;
		case 2:
			this.deleteAll();
			break;
		case 9:
			System.out.println("메인으로 돌아가기");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void deleteOne() {
		// 삭제할 회원 id를 사용자에게 입력 받고 정말 삭제할 것인지 사용자에게
		// 물어본 뒤, Y나 y를 사용자가 입력할 경우 입력 받은 id를
		// mc의 delete() 메소드의 매개변수로 넘김, 반환 값에 따라
		// 검색결과 없으면 “존재하지 않는 아이디입니다.” 출력, mainMenu()로 감
		// 검색 결과가 있으면 “성공적으로 삭제하였습니다.” 출력 후
		// mainMenu()로 돌아감
		System.out.print("삭제할 id : ");
		String id = sc.next();

		System.out.print("정말로 삭제하시겠습니까?(y) : ");
		char check = sc.next().charAt(0);
		if (check == 'y' || check == 'Y') {
			if(mc.delete(id)) {
				System.out.println("성공적으로 삭제하였습니다.");
			} else {
				System.out.println("존재하지 않는 아이디입니다.");
			}
		}
	}

	public void deleteAll() {
		// 정말 삭제할 것인지 사용자에게 물어본 뒤, Y나 y를 사용자가 입력할 경우
		// mc의 delete() 메소드 호출, “성공적으로 삭제하였습니다.” 출력 후
		// mainMenu()로 돌아감
		System.out.print("정말로 삭제하시겠습니까?(y) : ");
		char check = sc.next().charAt(0);
		if (check == 'y' || check == 'Y') {
			mc.deleteAll();
		} 
		System.out.println("성공적으로 삭제하였습니다.");
	}

	public void printAll() {
		if(mc.existMemberNum() == 0) {
			System.out.println("저장된 회원이 없습니다.");
		} else {
			Member[] mArr = mc.printAll();
			for(int i = 0; i < mArr.length; i++) {
				if(mArr[i] == null) {
					break;
				}
				System.out.println(mArr[i].inform());
			}
		}
	}
}
		
		
			
