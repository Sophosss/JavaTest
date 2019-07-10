package huawei;

import java.util.Scanner;

public class MazeProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int len = sc.nextInt();
			int wid = sc.nextInt();
			int[][] array = new int[len + 2][wid + 2];
			for (int i = 0; i < wid + 2; i++) {
				array[0][i] = 1;
				array[len + 1][i] = 1;
			}
			for (int i = 0; i < len + 2; i++) {
				array[i][0] = 1;
				array[i][wid + 1] = 1;
			}
			for (int i = 1; i <= len; i++) {
				for (int j = 1; j <= wid; j++) {
					array[i][j] = sc.nextInt();
				}
			}
			step(array, 1, 1, len, wid);
			for (int i = 0; i < len + 2; i++) {
				for (int j = 0; j < wid + 2; j++) {
					if (array[i][j] == 2) {
						int a = i - 1;
						int b = j - 1;
						System.out.println("(" + a + "," + b + ")");
					}
				}
			}
		}
	}
	public static boolean step(int[][]array1, int l, int w, int a, int b){
		if (array1[a][b] == 2){
			return true;
		}else {
			if (array1[l][w] == 0){
				array1[l][w] = 2;
				if (step(array1, l,w+1, a, b)){
					return true;
				}else if (step(array1, l+1,w, a, b)){
					return true;
				}else if (step(array1, l-1,w, a, b)){
					return true;
				}else if (step(array1, l,w-1, a, b)){
					return true;
				}else {
					array1[l][w] = 1;
					return false;
				}
			}else {
				return false;
			}
		}
	}
}
