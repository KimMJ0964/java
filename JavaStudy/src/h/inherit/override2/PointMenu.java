package h.inherit.override2;

import java.util.Scanner;

// 사용자로부터 입력을 받거나 결과를 보여주는 클래스
public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	
	private CircleController cc = new CircleController();
	
	private RectangleController rc = new RectangleController();
	
	int choiceNum = 0;
	
	public void mainMenu() {
		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴번호 : ");
			choiceNum = sc.nextInt();
			
			switch (choiceNum) {
				case 1:
					circleMenu();
					break;
				case 2:
					rectangleMenu();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 입력하였습니다. 다시 입력하십시오.");
			}
		}
	}
	
	public void circleMenu() {
		
			System.out.println("===== 원 메뉴 =====");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴번호 : ");
			choiceNum = sc.nextInt();
			
			switch (choiceNum) {
				case 1:
					calcCircum();
					break;
				case 2:
					calcCircleArea();
					break;
				case 9:
					break;
				default:
					System.out.println("잘못 입력하였습니다. 다시 입력하십시오.");
			}
		
	}
	
	public void rectangleMenu() {
		
			System.out.println("===== 사각형 메뉴 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴번호 : ");
			choiceNum = sc.nextInt();
			
			switch (choiceNum) {
				case 1:
					calcPerimeter();
					break;
				case 2:
					calcRectArea();
					break;
				case 9:
					break;
				default:
					System.out.println("잘못 입력하였습니다. 다시 입력하십시오.");
			}
	
	}
	
	public void calcCircum() {
		System.out.print("X 좌표 : ");	int xPot = sc.nextInt();
		System.out.print("Y 좌표 : ");	int yPot = sc.nextInt();
		System.out.print("반지름 : ");	int radius = sc.nextInt();
		
		System.out.println(cc.calcCircum(xPot, yPot, radius));
	}
	
	public void calcCircleArea() {
		System.out.print("X 좌표 : ");	int xPot = sc.nextInt();
		System.out.print("Y 좌표 : ");	int yPot = sc.nextInt();
		System.out.print("반지름 : ");	int radius = sc.nextInt();
		
		System.out.println(cc.calcArea(xPot, yPot, radius));
	}
	
	public void calcPerimeter() {
		System.out.print("X 좌표 : ");	int xPot = sc.nextInt();
		System.out.print("Y 좌표 : ");	int yPot = sc.nextInt();
		System.out.print("높이 : ");		int height = sc.nextInt();
		System.out.print("너비 : ");		int weight = sc.nextInt();
		
		System.out.println(rc.calcPerimeter(xPot, yPot, height, weight));
	}
	
	public void calcRectArea() {
		System.out.print("X 좌표 : ");	int xPot = sc.nextInt();
		System.out.print("Y 좌표 : ");	int yPot = sc.nextInt();
		System.out.print("높이 : ");		int height = sc.nextInt();
		System.out.print("너비 : ");		int weight = sc.nextInt();
		
		System.out.println(rc.calcArea(xPot, yPot, height, weight));
	}
}
