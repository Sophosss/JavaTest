import java.util.Scanner;

public class QuickSort {
	public static void quicksort(int[] array) {
		if (array == null || array.length < 2) {
			return;
		} else {
			quicksort2(array, 0, array.length - 1);
		}
	}

	public static void quicksort2(int[] array, int i, int j) {
		if (j - i < 1) {
			return;
		}
		int index = quicksort3(array, i, j);
		quicksort2(array, i, index - 1);
		quicksort2(array, index + 1, j);
	}

	public static int quicksort3(int[] array, int i, int j) {
		int start = i, end = j;
		int temp = array[start];
		while (start < end) {
			while (start < end && array[end] >= temp) {
				end--;
			}
			if (start < end) {
				array[start] = array[end];
			}
			while (start < end && array[start] < temp) {
				start++;
			}
			if (start < end) {
				array[end] = array[start];
			}
		}
		array[start] = temp;
		return start;
	}

	public static void test() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int [] data = new int [n];
		for (int item : data){
			data[item] = scanner.nextInt();
		}
		quicksort(data);
		for (int item : data) {
			System.out.print(item);
		}
	}

	public static void main(String[] args) {
		test();
	}
}
