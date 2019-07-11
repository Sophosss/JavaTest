package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeConversion {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string = "";
		while ((string = br.readLine()) != null) {
			int n = string.length();
			StringBuilder sb = new StringBuilder(string);
			int temp = Integer.parseInt(string.substring(0,2));
			if (string.charAt(n-2) == 'P'){
				if (temp == 12){
					String s = "12" + sb.substring(2,n-2);
					System.out.println(s);
				}else {
					temp += 12;
					String s = temp + sb.substring(2, n-2);
					System.out.println(s);
				}
			}else {
				if (temp == 12){
					String s = "00" + sb.substring(2,n-2);
					System.out.println(s);
				}else {
					String s1 = sb.substring(0, n-2);
					System.out.println(s1);
			}

		}
	}
}
}

