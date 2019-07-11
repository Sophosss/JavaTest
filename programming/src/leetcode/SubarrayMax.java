package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubarrayMax {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string = "";
		while ((string = br.readLine()) != null){
			int count = Integer.parseInt(string);
			int sum = 0, tem = Integer.MIN_VALUE;
			int []arr = new int[count];
			for (int i = 0; i < count; i++) {
				arr[i] = Integer.parseInt(br.readLine());
				sum += arr[i];
				if (sum > tem){
					tem = sum;
				}
				if (sum < 0){
					sum = 0;
				}
			}
			System.out.println(tem);
		}
	}
}
