package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FractionToRecurringDecimal {
	public String fractionToDecimal(int numerator, int denominator) {
		if(numerator == 0) return "0";
		StringBuilder sb = new StringBuilder();
		Map<Long, Integer> map = new HashMap<>();
		if ((numerator < 0 ) ^ (denominator < 0)) sb.append("-");
		long n = Math.abs((long) numerator);
		long d = Math.abs((long) denominator);
		sb.append(n/d);
		n = n % d;
		if(n == 0) return sb.toString();
		sb.append(".");
		while(!map.containsKey(n)){
			map.put(n, sb.length());
			n *= 10;
			sb.append(n / d);
			n = n % denominator;
			if (n == 0) return sb.toString();
		}
		sb.insert(map.get(n), "(").append(")");
		return sb.toString();
	}

	public static void main(String[] args) {
		FractionToRecurringDecimal fractionToRecurringDecimal = new FractionToRecurringDecimal();
		fractionToRecurringDecimal.fractionToDecimal(40, 17);
	}
}
