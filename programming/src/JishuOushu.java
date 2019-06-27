import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class JishuOushu {
	public static void reOrderArray(int [] array) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		for (int i =0;i<array.length;i++){
			if (isodd(array[i])){
				arr1.add(array[i]);
			}
			else arr2.add(array[i]);
		}
		arr1.addAll(arr2);
		for (int i =0;i<array.length;i++){
			array[i] = arr1.get(i);
		}
	}
	public static boolean isodd(int num){
		if (num%2==1) {return true;}
		else {return false;}
	}
}
