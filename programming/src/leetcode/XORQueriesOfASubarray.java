package leetcode;

public class XORQueriesOfASubarray {
	public int[] XorQueries(int[] arr, int[][] queries) {
		int len = queries.length, lenA = arr.length;
		int [] t = new int[lenA+1];
		t[0] = 0;
		for(int i=1;i<=lenA;i++)
		{
			t[i] = t[i-1] ^ arr[i-1];
		}

		int [] r = new int[len];
		for(int i=0;i<len;i++)
		{
			r[i] = t[queries[i][1]+1] ^ t[queries[i][0]];
		}
		return r;
	}
}
