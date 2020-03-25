package newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prices {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		int a = Integer.parseInt(s.split(" ")[0]);
		int b = Integer.parseInt(s.split(" ")[1]);
		double[][] dp = new double[a+1][b+1];
		for (int i = 1; i <= a; i++) {
			dp[i][0] = 1;
		}
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				dp[i][j] = (double)i / (i+j);
				if(j >= 3){
					dp[i][j] += (double)j / (i+j) * (double)(j-1)/(i+j-1) * (double)(j-2)/(i+j-2) * dp[i][j-3];
				}
				if(j >= 2){
					dp[i][j] += (double)j / (i+j) * (double)(j-1)/(i+j-1) * (double)i/(i+j-2) * dp[i-1][j-2];
				}
			}
		}
		System.out.printf("%.4f", dp[a][b]);
	}
}
