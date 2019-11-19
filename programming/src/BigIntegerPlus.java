public class BigIntegerPlus {
	public static String go(String s1, String s2){
		char[] c1 = new StringBuilder(s1).reverse().toString().toCharArray();
		char[] c2 = new StringBuilder(s2).reverse().toString().toCharArray();
		int len = s1.length() > s2.length() ? s1.length() : s2.length();
		int []nums = new int[len+1];
		for (int i = 0; i < nums.length; i++) {
			int a1 = i < s1.length() ? (c1[i] - '0') : 0;
			int b1 = i < s2.length() ? (c2[i] - '0') : 0;
			nums[i] = a1 + b1;
		}
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > 10){
				nums[i+1] += 1;
				nums[i] %= 10;
			}
		}
		StringBuilder sb = new StringBuilder();
		boolean flag = true;
		for (int i = len; i >= 0; i--) {
			if(nums[i] == 0 && flag) continue;
			else flag = false;
			sb.append(nums[i]);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(go("123123", "111111"));
	}
}
