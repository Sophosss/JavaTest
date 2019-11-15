package leetcode;

public class VerifyPreorderSerializationOfBinaryTree {
	public static boolean isValidSerialization(String preorder) {
		int degree = 1;
		String[] strings = preorder.split(",");
		for(String s : strings){
			if (degree == 0) return false;
			else if ("#".equals(s)) degree--;
			else if (",".equals(s)) continue;
			else degree++;
		}
		return degree == 0;
	}

	public static void main(String[] args) {
		String s = "9,#,92,#,#";
		isValidSerialization(s);
	}
}
