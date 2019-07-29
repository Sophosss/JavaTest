package leetcode;

public class ContainerWithMostWater {
	public int maxArea(int[] height) {
		int sum = 0;
		int start = 0;
		int end = height.length - 1;
		while (start < end){
			sum = Math.max(sum, (end - start) * Math.min(height[start], height[end]));
			if (height[start] < height[end]){
				start ++;
			}else {
				end --;
			}
		}
		return sum;
	}
}
