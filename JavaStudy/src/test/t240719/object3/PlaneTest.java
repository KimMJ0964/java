package test.t240719.object3;

public class PlaneTest {
	
	public static void main(String[] args) {
		// Airplane 과 Cargoplane 객체 생성
		Plane ap = new Airplane("L747", 1000);
		Plane cargo = new Cargoplane("C40", 1000);
		
		// 생성된 객체의 정보 출력
		System.out.printf("개체명\t\t 연료\n");
		System.out.println("-----------------------------");
		System.out.printf("%s\t\t %d", ap.getPlaneName(), ap.getFuelSize());
		System.out.printf("\n%s\t\t %d", cargo.getPlaneName(), cargo.getFuelSize());
		// Airplane 과 Cargoplane 객체에 100 씩 운항
		System.out.println("\n\n[100 운항]\n\n");
		ap.flight(100);
		cargo.flight(100);
		
		
		// 100 운항 후 객체 정보 출력
		System.out.printf("개체명\t\t 연료\n");
		System.out.println("-----------------------------");
		System.out.printf("%s\t\t %d", ap.getPlaneName(), ap.getFuelSize());
		System.out.printf("\n%s\t\t %d", cargo.getPlaneName(), cargo.getFuelSize());
		//Airplane 과 Cargoplane 객체에 200 씩 주유
		System.out.println("\n\n[200 주유]\n\n");
		ap.refuel(200);
		cargo.refuel(200);
		
		// 200 주유 후 객체 정보 출력
		System.out.printf("개체명\t\t 연료\n");
		System.out.println("-----------------------------");
		System.out.printf("%s\t\t %d", ap.getPlaneName(), ap.getFuelSize());
		System.out.printf("\n%s\t\t %d", cargo.getPlaneName(), cargo.getFuelSize());
	}

}
