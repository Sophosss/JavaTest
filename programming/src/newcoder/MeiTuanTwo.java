package newcoder;

import org.omg.CORBA.MARSHAL;

import java.util.HashMap;
import java.util.Map;

public class MeiTuanTwo {
	public String getMinString (String str1, String str2) {
		// write code here
		if(str2.length() == 0) return str1;
		int left = 0;
		int right = 0;
		Map<Character, Integer> have = new HashMap<>();
		Map<Character, Integer> need = new HashMap<>();
		for(char c : str2.toCharArray()) need.put(c, need.getOrDefault(c, 0) + 1);
		int count = 0;
		int l = 0;
		int len = Integer.MAX_VALUE;
		while(right <= str1.length()){
			char c1 = str1.charAt(right);
			have.put(c1, have.getOrDefault(c1, 0) + 1);
			if(need.containsKey(c1) && have.get(c1).equals(need.get(c1))) count++;
			right++;
			while(count == need.size()){
				if(right - left < len){
					l = left;
					len = right - left;
				}
				char c2 = str1.charAt(left);
				have.put(c2, have.get(c2) - 1);
				if(need.containsKey(c2) && have.get(c2) <= (need.get(c2))) count--;
				left++;
			}
		}
		return str1.substring(l, l + len);
	}
}
