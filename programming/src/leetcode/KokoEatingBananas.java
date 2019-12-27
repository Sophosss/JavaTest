package leetcode;

public class KokoEatingBananas {
	public int minEatingSpeed(int[] piles, int H) {
		if(piles == null || piles.length == 0) return 0;
		int min = 1;
		int max = piles[0];
		for(int pile : piles){
			if(pile > max) max = pile;
		}
		while(min < max){
			int mid = (min + max) >>> 1;
			if(ok(piles, mid) > H) min = mid + 1;
			else max = mid;
		}
		return min;
	}
	private int ok(int[] piles, int num){
		int count = 0;
		for(int pile : piles){
			if(pile % num == 0) count += pile / num;
			else count += pile / num + 1;
		}
		return count;
	}
}
