package Practice.a01;

import java.util.Scanner;

public class TrafficMenu {
	
	Traffic[] tf = new Traffic[3];
	TrafficController tc = new TrafficController();
	Scanner sc = new Scanner(System.in);
	Human me;

	public void menu(){
			System.out.print("이름을 입력해주세요. : ");				String name = sc.next();
			System.out.print("현재 보유 자금을 입력해주세요. : ");		int money = sc.nextInt();
			me = new Human(name, money);
			while(true) {
				System.out.println(me.getName() + "님의 현재 자금은 " + me.getMoney() + "원입니다.");
				System.out.println("교통을 이용하시겠습니까?\n");
				System.out.println("1. 버스");
				System.out.println("2. 기차");
				System.out.println("3. 비행기");
				System.out.println("9. 이용하지 않습니다.\n");
				System.out.print("번호 입력 : ");							int num = sc.nextInt();
				
				switch (num) {
					case 1:
						this.rideOnBus();
						break;
					case 2:
						this.rideOnTrain();
						break;
					case 3:
						this.rideOnAirplane();
						break;
					case 9:
						System.out.println("서비스를 이용해주셔서 감사합니다. 프로그램을 종료합니다.");
						return;
					default:
						System.out.println("잘못 입력하였습니다. 다시 입력해주시길바랍니다.");
				}
			}
	
		}
	
		public void rideOnBus() {
			int pay = tc.bus(me.getMoney());
			me.pay(pay);
			System.out.println(me.getName() + "님의 현재 자금은 " + me.getMoney() + "원입니다.");
		}
		
		public void rideOnTrain() {
			int pay = tc.train(me.getMoney());
			me.pay(pay);
			System.out.println(me.getName() + "님의 현재 자금은 " + me.getMoney() + "원입니다.");
		}
		
		public void rideOnAirplane() {
			int pay = tc.airplane(me.getMoney());
			me.pay(pay);
			System.out.println(me.getName() + "님의 현재 자금은 " + me.getMoney() + "원입니다.");
		}
	}

