package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class IntegerToRoman {
	public String intToRoman(int num) {
		Map<Integer, String> map = new TreeMap<>();
		String s = "";
		map.put(1, "I");
		map.put(4, "IV");
		map.put(5, "V");
		map.put(9, "IX");
		map.put(10, "X");
		map.put(40, "XL");
		map.put(50, "L");
		map.put(90, "XC");
		map.put(100, "C");
		map.put(400, "CD");
		map.put(500, "D");
		map.put(900, "CM");
		map.put(1000, "M");
		Integer[] integers = map.keySet().toArray(new Integer[0]);
		int end = 12;
		while (num != 0){
			while (num > integers[end]){
				num -= integers [end];
				s += map.get(integers [end]);
			}
			end--;
		}
		return s;
	}

	public static void main(String[] args) {
		IntegerToRoman integerToRoman = new IntegerToRoman();
		integerToRoman.intToRoman(1994);
	}
}
