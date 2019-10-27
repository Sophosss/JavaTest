package leetcode;

public class HammingDistance {
	public int hammingDistance(int x, int y) {
		x = x ^ y;
		int count = 0;
		while(x != 0){
			if((x & 1) == 1) count++;
			x >>= 1;
		}
		return count;
	}
}
