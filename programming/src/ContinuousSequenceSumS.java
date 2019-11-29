import java.util.ArrayList;

public class ContinuousSequenceSumS {
	ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		int n = (int)Math.sqrt(2*sum);
		int left = 1;
		int right = 1;
		int s = 0;
		while(left <= right && right <= sum){
			s += right;
			right++;
			while(s > sum){
				s -= left;
				left++;
			}
			if(s == sum) go(left, right-1);
		}
		return list;
	}
	public void go(int l ,int r){
		if(r - l == 0) return;
		ArrayList<Integer> li = new ArrayList<>();
		for(int i = l; i <= r; i++){
			li.add(i);
		}
		list.add(li);
	}
}
