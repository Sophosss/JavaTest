package newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class UnzipString {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for (int i = 0; i < n; i++) {
			String s = in.readLine();
			solution(s);
		}
	}
	private static void solution(String s){
		Stack<Integer> stack = new Stack<>();
		int i = 0;
		int j = 0;
		StringBuilder ans = new StringBuilder();
		while(i < s.length()){
			char c = s.charAt(i);
			if(c == '('){
				stack.push(ans.length());
				i++;
			}else if(c >= 'A' && c <= 'z'){
				ans.append(c);
				i++;
			}else if(c >= '0' && c <= '9'){
				j = i;
				while(i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') i++;
				ans.append(go(ans.substring(ans.length() - 1), Integer.parseInt(s.substring(j, i)) - 1));
			}else if(c == ')'){
				i++;
				j = i;
				while(i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') i++;
				ans.append(go(ans.substring(stack.pop()), Integer.parseInt(s.substring(j, i)) - 1));
			}
		}
		System.out.println(ans.toString());
	}
	private static String go(String ans, int c){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < c; i++) {
			sb.append(ans);
		}
		return sb.toString();
	}
}
