package leetcode;

public class TrappingRainWater {
	public int trap(int[] height) {
		int max = 0;
		int maxIndex = 0;
		int left = 0;
		int right = 0;
		int res = 0;
		for (int i = 0; i < height.length; i++) {
			if (height[i] > max) {
				max = height[i];
				maxIndex = i;
			}
		}
		for (int i = 0; i < maxIndex; i++) {
			if (height[i] > left) left = height[i];
			else res += left - height[i];
		}
		for (int i = height.length - 1; i > maxIndex; i--) {
			if (height[i] > right) right = height[i];
			else res += right - height[i];
		}
		return res;
	}
}
