package leetcode;

public class SqrtX {
	public int mySqrt(int x) {
		if (x == 0) return 0;
		int left = 1;
		int right = (x>>>1) + 1 ;
		while (left < right){
			int mid = (left + right) >>> 1;
			if (mid < x / mid){
				left = mid + 1;
			}else {
			    right = mid;
			}
		}
		if (left == x / left){
			return left;
		}else return left - 1;

	}

	public static void main(String[] args) {
		SqrtX s = new SqrtX();
		System.out.println(s.mySqrt(4));
	}
}
