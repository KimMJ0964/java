package o.collection.list;

import java.util.ArrayList;
import java.util.List;

public class Practice {
	
	public static void main(String[] args) {
		
		List<Insect> list = new ArrayList<>();
		
		list.add(new Insect("딱정벌레", "장수풍뎅이"));
		list.add(new Insect("메뚜기", "섬서구메뚜기"));
		list.add(new Insect("개미", "곰개미"));
		
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.add(1, new Insect("딱정벌레", "사슴벌레"));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
}
