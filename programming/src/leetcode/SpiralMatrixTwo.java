package leetcode;

public class SpiralMatrixTwo {
	int t = 1;
	public int[][] generateMatrix(int n) {
		int ar = 0;
		int ac = 0;
		int br = n - 1;
		int bc = n - 1;
		int[][] arr = new int [n][n];
		while(ar <= br && ac <= bc){
			go(arr, ar++, ac++, br--, bc--);
		}
		return arr;
	}
	public void go(int[][] arr, int ar, int ac, int br ,int bc){
		if(ar == br){
			for(int i = ac; i <= bc; i++) arr[ar][i] = t++;
		}else if(ac == bc){
			for(int i = ar; i <= br; i++) arr[i][ac] = t++;
		}else{
			int tr = ar;
			int tc = ac;
			while(tc != bc) arr[tr][tc++] = t++;
			while(tr != br) arr[tr++][tc] = t++;
			while(tc != ac) arr[tr][tc--] = t++;
			while(tr != ar) arr[tr--][tc] = t++;
		}
	}
}
