import java.util.Arrays;

public class MergeSort {
	public static void mergeSort(int []nums){
		if(nums == null || nums.length < 2) return;
		mergeSort(nums, 0, nums.length - 1);
	}
	public static void mergeSort(int []nums, int left, int right){
		if (left == right) return;
		int mid = left + ((right - left) >> 1);
		mergeSort(nums, left, mid);
		mergeSort(nums, mid + 1, right);
		merge(nums, left, mid, right);
	}
	public static void merge(int []nums, int left, int mid, int right){
		int [] temps = new int[right - left + 1];
		int i = 0;
		int p1 = left;
		int p2 = mid + 1;
		while (p1 <= mid && p2 <= right) temps[i++] = nums[p1] < nums[p2] ? nums[p1++] : nums[p2++];
		while (p1 <= mid) temps[i++] = nums[p1++];
		while (p2 <= right) temps[i++] = nums[p2++];
		for(i = 0; i < temps.length; i++){
			nums[left + i] = temps[i];
		}
	}

	public static void main(String[] args) {
		int[] nums = new int[]{6,4,5,8,8,9,6,4,6};
		mergeSort(nums);
		System.out.println(Arrays.toString(nums));
	}
}
