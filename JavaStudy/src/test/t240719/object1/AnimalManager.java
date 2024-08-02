package test.t240719.object1;

import java.util.Scanner;

public class AnimalManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Animal[] am = new Animal[5];
		int num = 100;
		for (int i = 0; i < am.length; i++) {
			num = (int)(Math.random() * 100 + 1);
			if(num % 2 == 0) {
				System.out.println("개 정보 입력");
				System.out.print("이름 : ");	String name = sc.next();
				System.out.print("종류 : ");	String kinds = sc.next();
				System.out.print("몸무게 : "); int weight = sc.nextInt();
				
				am[i] = new Dog(name, kinds, weight);
			} else {
				System.out.println("고양이 정보 입력");
				System.out.print("이름 : ");	String name = sc.next();
				System.out.print("종류 : ");	String kinds = sc.next();
				System.out.print("서식지 : "); String location = sc.next();
				System.out.print("색 : "); String color = sc.next();
				
				am[i] = new Cat(name, kinds, location, color);
			}
		}
		
		for(int i = 0; i < am.length; i++) {
			am[i].speak();
		}
	}
}
