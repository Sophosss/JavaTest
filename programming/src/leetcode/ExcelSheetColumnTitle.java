package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnTitle {
	public String convertToTitle(int n) {
		StringBuilder sb = new StringBuilder();
		while (n > 0){
			sb.append((char)('A' + (--n) % 26));
			n /= 26;
		}
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();
		excelSheetColumnTitle.convertToTitle(701);
	}
}
