package leetcode;

import java.util.LinkedList;

public class BasicCalculatorTwo {
	public int calculate(String s) {
		if(s == null || s.length() == 0);
		s = String.join("", s.trim().split(" "));
		return value(s.toCharArray(), 0);
	}
	public int value(char[] arrs, int i){
		int pre = 0;
		String s = null;
		LinkedList<String> que = new LinkedList<>();
		while(i < arrs.length){
			if(arrs[i] >= '0' && arrs[i] <= '9') pre = pre * 10 + arrs[i++] - '0';
			else {
				addNum(que, pre);
				que.addLast(String.valueOf(arrs[i++]));
				pre = 0;
			}
		}
		addNum(que, pre);
		return getNum(que);
	}
	public void addNum(LinkedList<String> que, int num){
		if(!que.isEmpty()){
			int cur = 0;
			String s = que.pollLast();
			if("+".equals(s) || "-".equals(s)) que.addLast(s);
			else {
				cur = Integer.valueOf(que.pollLast());
				num = "*".equals(s) ? num*cur :cur/num;
			}
		}
		que.addLast(String.valueOf(num));
	}
	public int getNum(LinkedList<String> que){
		int cur = 0;
		int sum = 0;
		boolean flag = true;
		String s = null;
		while (!que.isEmpty()){
			s = que.pollFirst();
			if("+".equals(s)) flag = true;
			else if("-".equals(s)) flag = false;
			else {
				cur = Integer.valueOf(s);
				sum += flag ? cur : -cur;
			}
		}
		return sum;
	}
}
