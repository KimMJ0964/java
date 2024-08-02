package p.network;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	public void output() {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("testTest.txt");
			fw.write(97);
			fw.write(65);
			fw.flush();
		}catch(FileNotFoundException e) { 
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
	}

}
