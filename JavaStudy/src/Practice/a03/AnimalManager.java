package Practice.a03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AnimalManager{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Animal[] animal = new Animal[5];
		int num = 0;
		
		for(int i = 0; i < animal.length; i++) {
			num = (int)(Math.random()*100 + 1);
			if(num % 2 == 0) {
				System.out.print("강아지 이름 : "); String name = sc.next();
				System.out.print("강아지 종 : "); String kinds = sc.next();
				while(true) {
					try {
						System.out.print("강아지 몸무게 : "); int weight = sc.nextInt();
						animal[i] = new Dog(name, kinds, weight);
						break;
					} catch(InputMismatchException e) {
						System.out.println("잘못 입력하였습니다. 숫자로 다시 입력하십시오.");
						sc.nextLine();
					}
				}
			} else {
				System.out.print("고양이 이름 : "); String name = sc.next();
				System.out.print("고양이 종 : "); String kinds = sc.next();
				System.out.print("고양이 서식지 : "); String location = sc.next();
				System.out.print("고양이 색 : "); String color = sc.next();
				animal[i] = new Cat(name, kinds, location, color);
			}
			System.out.println();
		}
		
		for(int i = 0; i < animal.length; i++) {
			animal[i].speak();
		}
	}
}
