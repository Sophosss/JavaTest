package newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TicketCombine {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		while(!"0".equals(s = bf.readLine())){
			int W = Integer.parseInt(s);
			s = bf.readLine();
			String[] strs = s.split(" ");
			int n = Integer.parseInt(strs[0]);
			int[] v = new int[n];
			for (int i = 0; i < n; i++) v[i] = Integer.parseInt(strs[i+1]);
			int[] dp = new int[W+1];
			Arrays.fill(dp, 1, dp.length, Integer.MAX_VALUE);
			for (int i = 0; i < n; i++) {
				for (int j = 1; j <= W ; j++) {
					if(j >= v[i] && dp[j-v[i]] != Integer.MAX_VALUE) dp[j]  = Math.min(dp[j], dp[j-v[i]] + 1);
				}
			}
			System.out.println(dp[W] == Integer.MAX_VALUE ? "Impossible" : dp[W]);
		}
	}
}
