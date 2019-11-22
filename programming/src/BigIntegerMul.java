import java.math.BigInteger;

public class BigIntegerMul {
	public static String multiply(String num1, String num2) {
		if(num1 == "" || num2 == "" || num1.length() == 0 || num2.length() == 0) return "0";
		if(num1.equals("0") || num2.equals("0")) return "0";
		int len1 = num1.length();
		int len2 = num2.length();
		char [] n1 = num1.toCharArray();
		char [] n2 = num2.toCharArray();
		int []nums = new int [len1+len2];
		for(int i = 0; i < len1; i++){
			for(int j = 0; j < len2; j++){
				int a = n1[i] - '0';
				int b = n2[j] - '0';
				nums[i+j] += a * b;
			}
		}
		for(int i = nums.length - 1; i > 0; i--){
			nums[i-1] += nums[i] / 10;
			nums[i] = nums[i] % 10;
		}
		String s = "";
		boolean flag = true;
		for(int i = 0; i < nums.length - 1; i++){
			s += "" + nums[i];
		}
		return s;
	}

	public static void main(String[] args) {
		System.out.println(multiply("65", "27"));
		BigInteger b1 = new BigInteger("65");
		BigInteger b2 = new BigInteger("27");
		System.out.println(b1.multiply(b2));
	}
}
