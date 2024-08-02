package test.t240710.object2;

public class Run {
	public static void main(String[] args) {
		// int empNo, String empName, String dept, String job, int age, char gender, int salary, double bonusPoint, String phone, String address
		Employee employee = new Employee();
		
		employee.setEmpNo(100);
		employee.setEmpName("홍길동");
		employee.setDept("영업부");
		employee.setJob("과장");
		employee.setAge(25);
		employee.setGender('남');
		employee.setSalary(2500000);
		employee.setBonusPoint(0.05);
		employee.setPhone("010-1234-5678");
		employee.setAddress("서울시 강남구");
		
		
		System.out.println("번호\t이름\t부서\t등급\t나이\t성별\t월급\t보너스\t전화번호\t주소");
		System.out.println(employee.getEmpNo());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getDept());
		System.out.println(employee.getJob());
		System.out.println(employee.getAge());
		System.out.println(employee.getGender());
		System.out.println(employee.getSalary());
		System.out.println(employee.getBonusPoint());
		System.out.println(employee.getPhone());
		System.out.println(employee.getAddress());
	}
}
