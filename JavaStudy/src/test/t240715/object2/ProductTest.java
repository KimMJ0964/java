package test.t240715.object2;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품명 : "); 		String name = sc.nextLine();
		
		System.out.print("가격 : "); 		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("개수 : "); 		int quantity = sc.nextInt();
		sc.nextLine();
		
		Product pd = new Product (name, price, quantity);
		System.out.println(pd.information());
		System.out.println("총 가격 : " + (pd.getPrice() * pd.getQuantity()));
		
		sc.close();
	}

}
