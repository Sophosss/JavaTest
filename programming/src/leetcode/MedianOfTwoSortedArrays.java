package leetcode;

import java.util.PriorityQueue;

public class MedianOfTwoSortedArrays {
	PriorityQueue<Integer> queue1 = new PriorityQueue<>((o1, o2) -> o2-o1);
	PriorityQueue<Integer> queue2 = new PriorityQueue<>((o1, o2) -> o1-o2);
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		for(int num1 : nums1) add(num1);
		for(int num2 : nums2) add(num2);
		int len1 = queue1.size();
		int len2 = queue2.size();
		if(len1 + len2 == 0) return 0;
		if(len1 == 0) return queue2.poll();
		if(len2 == 0) return queue1.poll();
		int n1 = queue1.poll();
		int n2 = queue2.poll();
		if(((len1 + len2) & 1) == 0) return (double)(n1 + n2) / 2;
		return len1 > len2 ? n1 : n2;
	}
	public void modify(PriorityQueue<Integer> queue1, PriorityQueue<Integer> queue2){
		if(queue1.size() == queue2.size() + 2) queue2.add(queue1.poll());
		if(queue2.size() == queue1.size() + 2) queue1.add(queue2.poll());
	}
	public void add(int num){
		if(queue1.isEmpty()) {
			queue1.add(num);
			return;
		}
		if(queue1.peek() >= num){
			queue1.add(num);
		}else{
			if(queue2.isEmpty()){
				queue2.add(num);
				return;
			}
			if(queue2.peek() > num){
				queue1.add(num);
			}else queue2.add(num);
		}
		modify(queue1, queue2);
	}

	public static void main(String[] args) {
		MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
		int []nums1 = new int[]{1, 2};
		int []nums2 = new int[]{3, 4};
		System.out.println(medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
	}
}
