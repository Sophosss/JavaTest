package leetcode;

import java.util.LinkedList;

public class BasicCalculator {
	public int calculate(String s) {
		if(s == null || s.length() == 0) return 0;
		s = String.join("", s.trim().split(" "));
		return value(s.toCharArray(), 0)[0];
	}
	public int[] value(char[] arrs, int i){
		LinkedList<String> que = new LinkedList<>();
		int pre = 0;
		int[] bra = null;
		while(i < arrs.length && arrs[i] != ')'){
			if(arrs[i] >= '0' && arrs[i] <= '9') pre = pre * 10 + arrs[i++] - '0';
			else if(arrs[i] != '('){
				addNum(que, pre);
				que.addLast(String.valueOf(arrs[i++]));
				pre = 0;
			}else{
				bra = value(arrs, i + 1);
				pre = bra[0];
				i = bra[1] + 1;
			}
		}
		addNum(que, pre);
		return new int[]{getNum(que), i};
	}
	public void addNum(LinkedList<String> que, int num){
		if(!que.isEmpty()){
			int cur = 0;
			String s = que.pollLast();
			if("+".equals(s) || "-".equals(s)) que.addLast(s);
			else {
				cur = Integer.valueOf(que.pollLast());
				num = "*".equals(s) ? num*cur : cur/num;
			}
		}
		que.addLast(String.valueOf(num));
	}
	public int getNum(LinkedList<String> que){
		boolean flag = true;
		int cur = 0;
		int sum = 0;
		String s = "";
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
