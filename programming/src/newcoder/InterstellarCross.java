package newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InterstellarCross {
	static int len = 0;
	static int[][] dir = new int[][]{{-1,0,0},{1,0,0},{0,-1,0},{0,1,0},{0,0,-1},{0,0,1}};
	static int res = 0;
	static int cur = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		int n = Integer.parseInt(s);
		if(n == 0) {
			System.out.println(0);
			return;
		}
		len = n;
		int[][][] dp = new int[n][n][n];
		int x0 = 0, y0 = 0, z0 = 0, max = 0;
		for (int i = 0; i < Math.pow(n, 3); i++) {
			String[] strs = bf.readLine().split(" ");
			int x = Integer.parseInt(strs[0]);
			int y = Integer.parseInt(strs[1]);
			int z = Integer.parseInt(strs[2]);
			int p = Integer.parseInt(strs[3]);
			dp[x][y][z] = p;
			if(p > max){
				x0 = x;
				y0 = y;
				z0 = z;
				max = p;
			}
		}
		boolean[][][] v = new boolean[n][n][n];
		v[x0][y0][z0] = true;
		dfs(x0, y0, z0, dp, v, 0);
		System.out.println(res);
	}

	public static void dfs(int x, int y, int z, int[][][] dp, boolean[][][] v, int tmp){
		tmp += dp[x][y][z];
		for (int i = 0; i < 6; i++) {
			int dx = x + dir[i][0];
			int dy = y + dir[i][1];
			int dz = z + dir[i][2];
			if(!valid(dx, dy, dz) || v[dx][dy][dz] || dp[dx][dy][dz] >= dp[x][y][z]) continue;
			v[dx][dy][dz] = true;
			dfs(dx, dy, dz, dp, v, tmp);
			v[dx][dy][dz] = false;
		}
		res = Math.max(res, tmp);
	}
	public static boolean valid(int x, int y, int z){
		if(x<0 || x>=len || y<0 || y>=len || z<0 || z>=len) return false;
		else return true;
	}
}
