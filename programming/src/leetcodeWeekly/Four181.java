package leetcodeWeekly;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Four181 {
	public String longestPrefix(String s) {
		if(s.length() <= 1) return "";
		for (int i = s.length()-1; i >= 0; i--) {
			if(s.length() <= 1) return "";
			String tmp = s.substring(0, i);
			String s1 = s.substring(s.length() - i, s.length());
			Matcher matcher = Pattern.compile(tmp).matcher(s1);
			if (matcher.find()) return tmp;
		}
		return "";
	}

	public static void main(String[] args) {
		Four181 four181 = new Four181();
		four181.longestPrefix("level");
	}
}
