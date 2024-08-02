package test.t240718.object2;

public class Personcontroller {
//	Student[] s = new Student[3];
//	Employee[] e = new Employee[10];
	Person[] p = new Person[20];
	
	public int[] personCount() {
		int[] countArr = new int[2];
		
		int studentCount = 0, employeeCount = 0;
		for(Person tmp : p) {
			if(tmp == null) {
				break;
			} else if(tmp instanceof Student) {
				studentCount++;
			} else if(tmp instanceof Employee) {
				employeeCount++;
			}
		}

		countArr[0] = studentCount;
		countArr[1] = employeeCount;
		
		return countArr;
	}
	
	public void insertPerson(Person per) {
		for(int i = 0; i < p.length; i++) {
			if(p[i] == null) {
				p[i] = per;
				return;
			}
		}
	}
	
	public Person[] printPerson() {
		return this.p;
	}
	
}
