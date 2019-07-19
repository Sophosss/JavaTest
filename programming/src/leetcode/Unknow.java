package leetcode;

import java.util.Scanner;

public class Unknow {
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			int len = 0;
			String [] s1 = null;
			String [] s2 = null;
			len = in.nextInt();
			s1 = new String[len];
			for (int i = 0; i<len; i++){
				s1[i] = in.next();
			}
			s2 = new String[len];
			for (int i = 0; i<len; i++){
				s2[i] = in.next();
			}
			int result = 0;
			for(int i = 0; i<len; i++){
				result += misDistance(s1[i],s2[i]);
			}
			System.out.println(result);

		}
		public static int misDistance(String w1, String w2){
			int m = w1.length();
			int n = w2.length();
			int [][]a = new int [m+1][n+1];
			for(int i = 0; i<=m; i++){
				a[i][0] = i;

			}
			for(int i = 0; i<=n; i++){
				a[0][i] = i;

			}
			for(int i = 1; i<=m; i++){
				for(int j = 1; j<=n; j++){
					if(w1.charAt(i-1)==w2.charAt(j-1)){
						a[i][j] = a[i-1][j-1];
					}
					else {
						a[i][j] = 1+Math.min(a[i-1][j-1],Math.min(a[i-1][j],a[i][j-1]));
					}
				}

			}
			return a[m][n];
		}


}
