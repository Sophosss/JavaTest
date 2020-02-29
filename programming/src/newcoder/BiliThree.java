package newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class BiliThree {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		while(!(s = bf.readLine()).equals("END")){
			int i = 0;
			LinkedList<Integer> stack1 = new LinkedList<> ();
			LinkedList<Character> stack2 = new LinkedList<Character> ();
			while(i < s.length()){
				if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
					int j = i;
					while(j < s.length() && s.charAt(j) >= '0' && s.charAt(j) <= '9') j++;
					int res = Integer.valueOf(s.substring(i, j));
					stack1.add(res);
					i = j;
					if(!stack2.isEmpty() && stack2.peekLast() == '*'){
						int a = stack1.pollLast();
						int b = stack1.pollLast();
						stack1.add(a * b);
						stack2.pollLast();
					}
				}
				else if(s.charAt(i) == '+') {
					stack2.add('+');
					i++;
				}
				else if(s.charAt(i) == '-') {
					stack2.add('-');
					i++;
				}
				else if(s.charAt(i) == '*') {
					stack2.add('*');
					i++;
				}
			}
			while(!stack2.isEmpty()){
				char c = stack2.poll();
				int a = stack1.poll();
				int b = stack1.poll();
				if(c == '+') stack1.addFirst(a + b);
				else stack1.addFirst(a - b);
			}
			System.out.println(stack1.peek());
		}
	}
}
