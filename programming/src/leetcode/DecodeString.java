package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class DecodeString {
	public String decodeString(String s) {
		if(s == null) return "";
		Deque<String> stack1 = new LinkedList<>();
		Deque<String> stack2 = new LinkedList<>();
		String s1 = "0";
		String s2 = "";
		for(int i = 0; i < s.length(); i++){
			char temp = s.charAt(i);
			if(temp >= '0' && temp <= '9'){
				s1 = s1 + temp + "";
			}else if(temp >= 'a' && temp <= 'z' || temp >= 'A' && temp <= 'Z'){
				s2 = s2 + temp + "";
			}else if(temp == '['){
				stack1.push(s1);
				stack2.push(s2);
				s1 = "0";
				s2 = "";
			}else{
				String s3 = "";
				int num = 0;
				num = Integer.parseInt(stack1.pop());
				for(int j = 0; j < num; j++){
					s3 += s2;
				}
				s2 = stack2.pop() + s3;
			}
		}
		return s2;
	}

	public static void main(String[] args) {
		DecodeString decodeString = new DecodeString();
		decodeString.decodeString("3[a]2[b4[F]c]");
	}
}
