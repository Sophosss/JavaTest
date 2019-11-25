public class ReverseOrderInArray {
	public int InversePairs(int [] array) {
		if(array == null || array.length < 2) return 0;
		return (int)(mergeSort(array, 0, array.length - 1) % 1000000007);
	}
	public long mergeSort(int []nums, int left, int right){
		if (left == right) return 0;
		int mid = left + ((right - left) >> 1);
		return mergeSort(nums, left, mid) + mergeSort(nums, mid + 1, right) + merge(nums, left, mid, right);
	}
	public long merge(int []nums, int left, int mid, int right){
		int [] temps = new int[right - left + 1];
		int i = 0;
		int p1 = left;
		int p2 = mid + 1;
		long tmp = 0;
		while (p1 <= mid && p2 <= right) {
			tmp = nums[p1] > nums[p2] ? (tmp + mid - p1 + 1) % 1000000007 : tmp;
			temps[i++] = nums[p1] < nums[p2] ? nums[p1++] : nums[p2++];
		}
		while (p1 <= mid) temps[i++] = nums[p1++];
		while (p2 <= right) temps[i++] = nums[p2++];
		for(i = 0; i < temps.length; i++){
			nums[left + i] = temps[i];
		}
		return tmp;
	}
}
