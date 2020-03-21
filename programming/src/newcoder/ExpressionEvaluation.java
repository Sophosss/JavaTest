package newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class ExpressionEvaluation {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String f = go(s);
		System.out.println(f);
	}
	public static String go(String s){
		String[] strs = s.split(" ");
		LinkedList<String> list = new LinkedList<>();
		for(int i = 0; i < strs.length;){
			if("and".equals(strs[i])){
				if(!list.isEmpty() && i < strs.length - 1 && ("true".equals(strs[i+1]) || "false".equals(strs[i+1]))){
					if("true".equals(list.pop()) && "true".equals(strs[i+1])){
						list.push("true");
					}else list.push("false");
					i+=2;
				}else return "error";
			} else {
				list.push(strs[i]);
				i++;
			}
		}
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			if("true".equals(list.get(i))) flag = true;
			if((i%2 == 0) && "or".equals(list.get(i))) return "error";
			if((i%2 == 1) && "true".equals(list.get(i))) return "error";
			if((i%2 == 1) && "false".equals(list.get(i))) return "error";
		}
		return flag ? "true" : "false";
	}
}
