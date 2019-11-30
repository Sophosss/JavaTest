import java.util.Arrays;

public class PlayingCards {
	public boolean isContinuous(int [] numbers) {
		if(numbers == null || numbers.length < 5) return false;
		int count = 0;
		int len = 0;
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length - 1; i++) {
			if(numbers[i] == 0) {
				count++;
				continue;
			}
			if(numbers[i] == numbers [i+1]) return false;
			len += numbers[i+1] - numbers[i] - 1;
		}
		if(count >= len) return true;
		else return false;
	}
}
