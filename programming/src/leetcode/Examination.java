package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Examination {
	static List<List<String>> list1 = new ArrayList<>();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String []strs = new String []{"A", "B", "C"};
		back(new ArrayList<String> (), n, strs);
		System.out.println(list1.size());
	}
	private static void back(List<String> list, int n, String [] strs) {
	    if (list.size() == n){
	    	if (test(list)) list1.add(new ArrayList<> (list));
		}else {
			for (int i = 0; i < strs.length; i++) {
				list.add(strs [i]);
				back(list, n, strs);
				list.remove(list.size() - 1);
			}
		}
	}
	private static boolean test(List<String> list) {
	    String s = "";
	    int countc = 0;
	    for(String str : list) s += str;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A') continue;
			else if (s.charAt(i) == 'B'){
				if (i < s.length() - 2 && s.charAt(i+1) == 'B' && s.charAt(i+2) == 'B') return false;
			}else {
				countc++;
				if (countc > 1) return false;
			}
		}
		return true;
	}
}
