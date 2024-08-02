package test.t240726.object1;

import java.util.Comparator;

public class AscTitle implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		if(o1.getTitle().compareTo(o2.getTitle()) == 0) {
			return o1.getSinger().compareTo(o2.getSinger());
		}
		
		return o1.getTitle().compareTo(o2.getTitle());
	}
}
