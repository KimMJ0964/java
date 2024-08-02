package test.t240718.object2;

import java.util.Scanner;

public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	Personcontroller pc = new Personcontroller();
	
	int choseNum = 0;
	char choseChar = 'n';
	public void mainMenu() {
		while(true) {
			int[] countArr = pc.personCount();
			System.out.println("*** 학생은 최대 "+ pc.p.length +"명까지 저장할 수 있습니다. ***");
			System.out.println("*** 현재 저장된 학생은 "+ countArr +"명입니다. ***");
			System.out.println("*** 사원은 최대 "+ pc.p.length +"명까지 저장할 수 있습니다. ***");
			System.out.println("*** 현재 저장된 사원은 "+ countArr +"명입니다. ***\n");
			
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");	choseNum = sc.nextInt();
			
			switch (choseNum) {
				case 1:
					studentMenu();
					break;
				case 2:
					employeeMenu();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 입력하였습니다. 다시 입력해주시길 바랍니다.");
			}
		
		}
	}
	public void studentMenu() {
		while(true) {
			int count = 0;
			for(int i = 0; i < pc.p.length; i++) {
				if(pc.p[i] != null)
					count++;
			}
			if (count != 3) {
				System.out.println("1. 학생 추가");
			} else {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다. ");
			}
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			System.out.print("번호 : ");	choseNum = sc.nextInt();
			
			switch (choseNum) {
				case 1:
					if (count != 3) {
						insertStudent();
					} else {
						System.out.println("잘못 입력했습니다.");
					}
					break;
				case 2:
					printStudent();
					break;
				case 9:
					return;
				default:
					System.out.println("잘못 입력하였습니다. 다시 입력해주시길 바랍니다.");
			}
		}
	}
	public void employeeMenu() {
		int count = 0;
		for(int i = 0; i < pc.p.length; i++) {
			if(pc.p[i] != null)
				count++;
		}
		if (count != 3) {
			System.out.println("1. 사원 추가");
		} else {
			System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상 활성화 되지 않습니다. ");
		}
		System.out.println("2. 사원 보기");
		System.out.println("9. 메인으로");
		System.out.print("번호 : ");	choseNum = sc.nextInt();
		
		switch (choseNum) {
			case 1:
				if (count != 3) {
					insertEmployee();
				} else {
					System.out.println("잘못 입력했습니다.");
				}
				break;
			case 2:
				printEmployee();
				break;
			case 9:
				break;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주시길 바랍니다.");
		}
	
	}	
	public void insertStudent() {
			while(true) {
				System.out.print("학생 이름 : ");		String name = sc.next();
				System.out.print("학생 나이 : ");		int age  = sc.nextInt();
				System.out.print("학생 키 : ");		double height = sc.nextDouble();
				System.out.print("학생 몸무게 : ");		double weight = sc.nextDouble();
				System.out.print("학생 학년 : ");		int grade = sc.nextInt();
				System.out.print("학생 전공 : ");		String major = sc.next();
				
				int[] personCount = pc.personCount();
				if(personCount[0] == 3) {
					System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
					return;
				}   
				pc.insertPerson(new Student(name, age, height, weight, grade, major));
				System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				choseChar = sc.next().charAt(0);
				if (choseChar == 'n' || choseChar == 'N') {
					return;
				}	
			}
	}
	public void printStudent() {
		Person[] pArr = pc.printPerson();
		for(Person p: pArr) {
			if(p == null) {
				break;
			}
			
			if(p instanceof Student)
				System.out.println(p.toString());
		}
		
	}
	public void insertEmployee() {
		int count = 1;
		while(count <= 10) {
			System.out.print("사원 이름 : ");		String name = sc.next();
			System.out.print("사원 나이 : ");		int age  = sc.nextInt();
			System.out.print("사원 키 : ");		double height = sc.nextDouble();
			System.out.print("사원 몸무게 : ");	double weight = sc.nextDouble();
			System.out.print("사원 급여 : ");		int salary = sc.nextInt();
			System.out.print("사원 부서 : ");		String dept = sc.next();
			
			int[] personCount = pc.personCount();
			if(personCount[1] == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				return;
			}  
			if(count > 10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고 사원 메뉴로 돌아갑니다.");
				break;
			} else {
				pc.insertPerson(new Employee(name, age, height, weight, salary, dept));
				System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				choseChar = sc.next().charAt(0);
				if (choseChar == 'n' || choseChar == 'N') {
					break;
				} else {					
					count++;
				}
			}
		}
	
	}
	public void printEmployee() {
		Person[] pArr = pc.printPerson();
		for(Person p: pArr) {
			if(p == null) {
				break;
			}
			
			if(p instanceof Employee)
				System.out.println(p.toString());
		}
	}
}
