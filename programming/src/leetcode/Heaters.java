package leetcode;

import java.util.Arrays;

public class Heaters {
	public int findRadius(int[] houses, int[] heaters) {
		Arrays.sort(heaters);
		Arrays.sort(houses);
		int i = 0;
		int res = 0;
		for(int house : houses){
			while(i < heaters.length && heaters[i] < house) i++;
			if(i == 0) res = Math.max(res, heaters[i] - house);
			else if(i == heaters.length) res = Math.max(res, houses[houses.length-1] - heaters[i-1]);
			else res = Math.max(res, Math.min(heaters[i] - house, house - heaters[i-1]));
		}
		return res;
	}

	public static void main(String[] args) {
		Heaters heaters = new Heaters();
		heaters.findRadius(new int[]{1,5}, new int[]{10});
	}
}
