package leetcodeWeekly;

import java.util.ArrayList;
import java.util.List;

public class Two165 {
	public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
		List<Integer> list = new ArrayList<>();
		if(	tomatoSlices == 0 && cheeseSlices == 0) {
			list.add(0);
			list.add(0);
			return list;
		}
		if((tomatoSlices - cheeseSlices * 2) % 2 != 0 ) return list;
		if(tomatoSlices - cheeseSlices * 2 >= 0) {
			list.add((tomatoSlices - cheeseSlices * 2)/2);
			if((cheeseSlices - (tomatoSlices - cheeseSlices * 2)/2) < 0) return new ArrayList<>();
			list.add(cheeseSlices - (tomatoSlices - cheeseSlices * 2)/2);
			return list;
		}
		return list;
	}
}
