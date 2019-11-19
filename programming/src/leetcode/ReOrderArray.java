package leetcode;

public class ReOrderArray {
	public void reOrderArray(int [] array) {
		int len = array.length;
		for(int i = 0; i < len; i++){
			for(int j = 0; j < len - i - 1; j++){
				if(array[j] % 2 == 0 && array[j+1] % 2 == 1){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
}
