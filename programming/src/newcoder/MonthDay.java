package newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonthDay {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		while((s = bf.readLine()) != null){
			int year = Integer.parseInt(s.split(" ")[0]);
			int month = Integer.parseInt(s.split(" ")[1]);
			if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				System.out.println(31);
			else if(month == 4 || month == 6 || month == 9 || month == 11) System.out.println(30);
			else if(year % 4 == 0 && year % 100 != 0) System.out.println(29);
			else System.out.println(28);
		}
	}
}
