public class PostorderBST {
	public boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence == null || sequence.length == 0) return false;
		return go(sequence, 0, sequence.length - 1);
	}
	public boolean go(int[] sequence, int left, int right){
		if (left >= right) return true;
		int i = left;
		for (; i < right; i++){
			if (sequence[i] > sequence[right]) break;
		}
		for (int j = i; j < right; j++) {
			if(sequence[j] < sequence[right]) return false;
		}
		return go(sequence, left, i - 1) && go(sequence, i + 1, right - 1);
	}
}
