package leetcode;

public class DistributeCandiesToPeople {
	public int[] distributeCandies(int candies, int num_people) {
		int[] nums= new int[num_people];
		int count = 0;
		while(candies > 0){
			nums[count % num_people] += Math.min(candies, ++count);
			candies -= count;
		}
		return nums;
	}
}
