package leetcode;

import java.util.ArrayList;
import java.util.List;

public class EnerateParentheses {
	List<String> result = new ArrayList<>();
	public List<String> generateParenthesis(int n) {
		back(n, 0, "");
		return result;
	}
	public void back(int left, int right, String s){
		if (left == 0 && right == 0){
			result.add(s);
		}else if (left != 0 && right != 0){
			back(left - 1 , right + 1, s + "(");
			back(left, right - 1, s + ")");
		}else if (left != 0 && right == 0){
			back(left - 1, right + 1, s + "(");
		}else if (left == 0 && right != 0){
			back(left, right - 1, s + ")");
		}
	}
}
