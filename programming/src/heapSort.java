import java.util.Arrays;

public class heapSort {
	public static void heapSort(int []nums){
		if(nums == null || nums.length < 2) return;
		for (int i = 0; i < nums.length; i++) {
			heapInsert(nums, i);
		}
		int size = nums.length;
		swap(nums, 0, --size);
		while (size > 0){
			heapify(nums, 0, size);
			swap(nums, 0, --size);
		}
	}
	public static void heapInsert(int []nums, int index){
		while(nums[index] > nums[(index - 1) / 2]){
			swap(nums, index, (index - 1) / 2);
			index = (index - 1) / 2;
		}
	}
	public static void heapify(int []nums, int index, int size){
		int left = index * 2 + 1;
		while(left < size){
			int large = left + 1 < size && nums[left] < nums[left + 1] ? left + 1 : left;
			large = nums[large] > nums[index] ? large : index;
			if (large == index) break;
			swap(nums, large, index);
			index = large;
			left = index * 2 + 1;
		}
	}
	public static void swap(int []nums, int i, int j){
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}
	public static void main(String[] args) {
		int[] nums = new int[]{6,4,5,8,8,9,6,4,6};
		heapSort(nums);
		System.out.println(Arrays.toString(nums));
	}
}
