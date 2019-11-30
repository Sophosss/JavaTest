import java.math.BigInteger;

public class T1 {
	public static String toHexspeak(String num) {
		if(num == null || num.length() == 0) return "";
		String s = new BigInteger(num, 10).toString(16);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '0') sb.append("O");
			else if(s.charAt(i) == '1') sb.append("I");
			else if(s.charAt(i) == 'a') sb.append("A");
			else if(s.charAt(i) == 'b') sb.append("B");
			else if(s.charAt(i) == 'c') sb.append("C");
			else if(s.charAt(i) == 'd') sb.append("D");
			else if(s.charAt(i) == 'e') sb.append("E");
			else if(s.charAt(i) == 'f') sb.append("F");
			else return "ERROR";
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(toHexspeak("747823223228"));
	}
}
