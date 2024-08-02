package Practice;

import java.util.HashMap;
import java.util.Set;

public class c01 {
	public static void main(String[] args) {
		int[][][][] test = new int[4][4][4][4];
		for(int i = 0; i < test.length; i++) {
			for(int j = 0; j < test.length; j++) {
				for(int a = 0; a < test.length; a++) {
					for(int b = 0; b < test.length; b++) {
						System.out.print("(["+i+"]["+j+"]["+a+"]["+b+"])\t");
					}
					System.out.println();
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
