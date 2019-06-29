import java.util.ArrayList;

public class ArrayMin {
	public String PrintMinNumber(int [] numbers) {
		ArrayList<Integer> list = new ArrayList<>();
		StringBuilder string = new StringBuilder();
		for (int number : numbers) {
			list.add(number);
		}
		list.sort((str1, str2) -> {
			String s1 = str1 + "" + str2;
			String s2 = str2 + "" + str1;
			return s1.compareTo(s2);
		});
		for (int s:list) {
			string.append(s);
		}
		return string.toString();
	}
}
