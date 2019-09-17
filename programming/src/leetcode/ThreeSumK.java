package leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import	java.util.Scanner;

public class ThreeSumK {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
        int []arr = new int [n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		int k = scanner.nextInt();
		System.out.println(find(arr, k));
	}
	private static int find(int [] arr, int k) {
		List<Integer> list = new ArrayList<>();
		Arrays.sort(arr);
        int n = arr.length, j = 0;
		for (int i = 0; i < n - 2; i++) {
			j = i + 1;
			int d = n - 1;
			while (d > j){
				if(arr[i] + arr[j] + arr[d] < k) j++;
				else if(arr[i] + arr[j] + arr[d] > k) d--;
				else{
					list.add(arr[i]);
					list.add(arr[j]);
					list.add(arr[d]);
					j++;
					d--;
				}
			}
		}
		return j;
	}
}
