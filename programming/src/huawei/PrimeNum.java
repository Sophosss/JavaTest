package huawei;

import java.util.Scanner;

public class PrimeNum {

	public static  void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		long data = scanner.nextLong();
		String string = getResult(data);
		System.out.println(string);
	}
	public static String getResult(long ulDataInput){
		int num = 2;
		String string = "";
		while (ulDataInput != 1){
			while (ulDataInput % num == 0){
				ulDataInput /= num;
				string = string + num + " ";
 			}
 			num++;
		}
		return string;
	}
}
