package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnTitle {
	public String convertToTitle(int n) {
		StringBuilder sb = new StringBuilder();
		while (n > 0){
			n--;
			sb.append('A' + (char)(n % 26));
			n /= 26;
		}
		return sb.reverse().toString();
	}
}
