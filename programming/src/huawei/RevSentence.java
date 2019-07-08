package huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RevSentence {
	public static void main(String[] args) throws IOException {
		String s = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String []strs = br.readLine().split(" ");
		for (int i = strs.length-1; i > 0; i--) {
			String string = strs[i];
			s = s + string + " ";
		}
		System.out.println(s);
	}
}
