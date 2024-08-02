package test01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileController {
	Food food = new Food();
	
	public void fileSave(String fileName) {
		File fName = new File(fileName + ".txt");
		
		try(FileWriter fw = new FileWriter(fName);
			BufferedWriter bw = new BufferedWriter(fw);
			Scanner sc = new Scanner(System.in);)	{
			
			fName.createNewFile();
			
			System.out.print("음식명 입력 : ");
			String foodName = sc.nextLine();
			
			System.out.print("음식 칼로리 입력 : ");
			int foodKcal = sc.nextInt();
			sc.nextLine();
			
			food = new Food(foodName, foodKcal);
			
			System.out.println(food.toString());
			bw.write(food.toString());
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
