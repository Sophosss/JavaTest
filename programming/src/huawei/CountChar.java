package huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountChar {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1, s2;
		int count = 0;
		s1 = br.readLine();
		s2 = br.readLine();
		String []s3 = new String[s1.length()];
		for (int i = 0; i < s1.length(); i++) {
			s3[i] = String.valueOf(s1.charAt(i));
			if (s3[i].equalsIgnoreCase(s2)){
				count++;
			}
		}
		System.out.println(count);
	}
}
