package leetcode;

public class DivideTwoIntegers {
	public int divide(int dividend, int divisor) {
		int flag = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
		long a = Math.abs((long)dividend);
		long b = Math.abs((long)divisor);
		long res = 0;
		while(a >= b){
			long tmp = b;
			long i = 1;
			while(a >= tmp){
				a -= tmp;
				res += i;
				i <<= 1;
				tmp <<= 1;
			}
		}
		res *= flag;
		if(res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
		else if(res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
		return (int)res;
	}

	public static void main(String[] args) {
		DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();
		divideTwoIntegers.divide(-2147483648, -1);
	}
}
