package leetcodeWeekly;

public class One15 {
	public int findSpecialInteger(int[] arr) {
		int c = 0;
		int tmp = arr[0];
		for(int a : arr){
			if(c > arr.length/4) return tmp;
			if(a == tmp) c++;
			else c--;
			if(c == 0) {
				tmp = a;
				c = 1;
			}
		}
		return tmp;
	}
}
