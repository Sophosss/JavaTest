package huawei;

import java.io.*;
import java.util.Stack;

public class NumRev {
	public static void main(String[] args) throws IOException {
		Stack stack = new Stack();
		StringBuilder stringBuilder = new StringBuilder();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String string = bufferedReader.readLine();
		for (int i = 0; i < string.length(); i++) {
			stack.push(string.charAt(i));
		}
		while (!stack.isEmpty()){
			stringBuilder.append(stack.pop());
		}
		System.out.println(stringBuilder.toString());
	}
}
