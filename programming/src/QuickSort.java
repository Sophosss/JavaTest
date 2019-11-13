import java.util.Arrays;
class Untitled {
	public static void main(String[] args) {
		int[] nums = new int[]{6,4,5,8,8,9,6,4,6};
		t(nums);
		System.out.println(Arrays.toString(nums));
	}

	public static void t(int []nums){
		if(nums == null || nums.length < 2) return;
		t(nums, 0, nums.length - 1);
	}

	public static void t(int []nums, int l, int r){
		if(l == r) return;
		int index = s(nums, l, r);
		t(nums, l, index);
		t(nums, index + 1, r);
	}

	public static int s(int []nums, int l, int r){
		int start = l;
		int end = r;
		int temp = nums[start];
		while(start < end){
			while(start < end && nums[end] >= temp ) end--;
			swap(nums, start, end);
			while(start < end && nums[start] <= temp ) start++;
			swap(nums, start, end);
		}
		nums[start] = temp;
		return start;
	}

	private static void swap(int [] nums, int i, int j) {
		int temp = nums [i];
		nums [i] = nums [j];
		nums [j] = temp;
	}
}