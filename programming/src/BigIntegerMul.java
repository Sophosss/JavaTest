public class BigIntegerMul {
	public static String go(String s1, String s2){
		char sign1 = s1.charAt(0);
		char sign2 = s2.charAt(0);
		char sign = '+';
		if(sign1 == '+' || sign1 == '-'){
			sign = sign1;
			s1 = s1.substring(1);
		}
		if(sign2 == '+' || sign2 == '-'){
			if(sign == sign2) sign = '+';
			else sign = '-';
			s2 = s2.substring(1);
		}
		char [] c1 = new StringBuilder(s1).reverse().toString().toCharArray();
		char [] c2 = new StringBuilder(s2).reverse().toString().toCharArray();
		int len = s1.length() + s2.length();
		int []nums = new int[len];
		for (int i = 0; i < c1.length; i++) {
			for (int j = 0; j < c2.length; j++){
				int a1 = c1[i] - '0';
				int b1 = c2[j] - '0';
				nums[i + j] += a1 * b1;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > 10){
				nums[i+1] += nums[i] / 10;
				nums[i] %= 10;
			}
		}
		StringBuilder sb = new StringBuilder();
		if(sign == '-') sb.append("-");
		boolean flag = true;
		for(int i = len-1; i >= 0; i--){
			if(flag && nums[i] == 0) continue;
			else flag = false;
			sb.append(nums[i]);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(go("+11", "+11"));
	}
}
