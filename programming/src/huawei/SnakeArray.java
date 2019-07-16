package huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SnakeArray {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		while ((s = br.readLine())!= null){
			int n = Integer.parseInt(s);
			int number = 2, temp = 2, i = 1, j = 0;
			int [][]arr = new int[n][n];
			arr[0][0] = 1;
			while ((i-j) != n){
				if (i >= 0){
					arr[i][j] = number;
					number += 1;
					i--;
					j++;
				}else {
					i = temp;
					temp += 1;
					j =0;
				}
			}
			getResult(n, arr);
		}
	}

	public static void getResult(int num, int[][] array) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < array.length-i; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
