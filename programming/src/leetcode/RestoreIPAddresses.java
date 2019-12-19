package leetcode;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {
	public List<String> restoreIpAddresses(String s) {
		List<String> list = new ArrayList<>();
		if(s == null || s.length() == 0) return list;
		int n = s.length();
		for (int i = 0; i < 3; i++) {
			for (int j = i+1; j < i+4; j++) {
				for (int k = j+1; k < j+4; k++) {
					if(i < n && j < n && k < n){
						String s1 = s.substring(0, i+1);
						String s2 = s.substring(i+1, j+1);
						String s3 = s.substring(j+1, k+1);
						String s4 = s.substring(k+1);
						if(ok(s1) && ok(s2) && ok(s3) && ok(s4)) list.add(s1 + "." + s2 + "." + s3 + "." + s4);
					}
				}
			}
		}
		return list;
	}
	private boolean ok(String s){
		if(s == null || s.length() == 0 || s.length() > 3 || (s.length() > 1 && s.charAt(0) == '0') || Integer.valueOf(s) > 255) return false;
		return true;
	}
}
