package huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CorrectPassword {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		while ((s = br.readLine()) != null) {
			if (s.length() < 9) {
				System.out.println("NG");
			}else if (!test2(s)){
				System.out.println("NG");
			}else if (!test(s)){
				System.out.println("NG");
			}
			else {
				System.out.println("OK");
			}
		}
	}
	public static boolean test(String string){
		int n = string.length();
		for (int i = 0; i < n-3; i++) {
			String string1 = string.substring(i,i+3);
			String string2 = string.substring(i+3,n);
			if (string2.contains(string1)){
				return false;
			}
		}
		return true;
	}
	public static boolean test2(String string){
		int []temp = new int[4];
		int num = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) >= '0' && string.charAt(i) <= '9'){
				temp[0] = 1;
			}else if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z'){
				temp[1] = 1;
			}else if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'){
				temp[2] = 1;
			}else {
				temp[3] = 1;
			}
		}
		for (int i = 0; i < 4; i++) {
			num += temp[i];
		}
		return num >= 3;
	}
}
