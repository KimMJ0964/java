package homework20240712.test5.copy;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("폰 기종명 : "); 		String name = sc.nextLine();
		System.out.print("가격 : "); 		int price = sc.nextInt();
		System.out.print("개수 : "); 		int quantity = sc.nextInt();
		
		Product pd = new Product (name, price, quantity);
		System.out.println(pd.information());
		System.out.println("총 가격 : " + (pd.getPrice() * pd.getQuantity()));
		
		sc.close();
	}

}
