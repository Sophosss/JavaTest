package leetcode;

public class SelfCrossing {
	public boolean isSelfCrossing(int[] x) {
		for (int i = 3; i < x.length; i++) {
			if(x[i-3] >= x[i-1] && x[i] >= x[i-2]) return true;
			if(i >= 4 && x[i-4] + x[i] >= x[i-2] && x[i-1] == x[i-3]) return true;
			if(i >= 5 && x[i-5] + x[i-1] >= x[i-3] && x[i-4] + x[i] >= x[i-2] && x[i-3] >= x[i-1] && x[i-2] >= x[i-4]) return true;
		}
		return false;
	}
}
