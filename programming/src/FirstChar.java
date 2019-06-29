import java.util.Arrays;
import java.util.HashMap;

public class FirstChar {
	public int FirstNotRepeatingChar(String str) {
		HashMap<Character,Integer> map = new HashMap<>();
		int n = str.length()-1;
		for (int i = 0; i <= n; i++) {
			char a = str.charAt(i);
			if (map.containsKey(a)){
				int temp = map.get(a);
				map.put(a,temp+1);
			}else {
				map.put(a,0);
			}
		}
		for (int i = 0; i <=n ; i++) {
			char b = str.charAt(i);
			if (map.get(b)==0){
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		FirstChar firstChar = new FirstChar();
		String s = "abcdaQEaCD";
		firstChar.FirstNotRepeatingChar(s);
	}
}
