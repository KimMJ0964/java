package test.t240716.object3;

public class Personcontroller {
	Student[] s = new Student[3];
	Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int[] countArr = new int[2];
		int studentCount = 0, employeeCount = 0;
		
		// 학생 수
		for(int i = 0; i < s.length; i++) {
			if(s[i] == null) {
				break;
			}
			studentCount++;
		}
		
		// 사원 수
		for(Employee emp : e) {
			if(emp == null) {
				break;
			}
			employeeCount++;
		}
		
		// 배열 0 인덱스 : 학생		1 인덱스 : 사원
		countArr[0] = studentCount;
		countArr[1] = employeeCount;
		
		return countArr;
	}
	
	public void insertStudent(String name, int age, double height, 
			double weight, int grade, String major) {
		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				break;
			}
		}
	}
	
	public Student[] printStudent() {
		return this.s;
	}
	
	public void insertEmployee(String name, int age, double height, 
			double weight, int salary, String dept) {
		for (int i = 0; i < e.length; i++) {
			if (e[i] == null) {
				e[i] = new Employee(name, age, height, weight, salary, dept);
				break;
			}
		}
		
	}
	
	public Employee[] printEmployee() {
		return this.e;
	}
}
