package huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LastWordsLen {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		while ((s = br.readLine())!= null){
			String []arr = s.split(" ");
			System.out.println(arr[arr.length - 1].length());
		}
	}
}
