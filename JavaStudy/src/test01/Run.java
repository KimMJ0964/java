package test01;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		System.out.print("fileName : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		new FileController().fileSave(name);
	}
}
