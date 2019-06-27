import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

class TreeNode {
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;

	public TreeNode(int val) {
		this.val = val;

	}

}
public class MyTest {
	public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
		if (array.length < 2) return;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			Integer key = array[i];
			Integer val = map.get(key);
			if (val == null) map.put(key, 1);
			else map.put(key, val + 1);
		}
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < array.length; i++) {
			if(map.get(array[i])==1){
				stack.push(array[i]);
			}
		}
		num1[0]=stack.pop();
		num2[0]=stack.pop();
	}
	public static void main(String[] args) {
		int []array = {2,4,3,90,3,2,5,5};
		int []num1 = new int [1];
		int []num2 = new int [1];
		FindNumsAppearOnce(array,num1,num2);
		System.out.println(num1[0]);
		System.out.println(num2[0]);

		
	}
}




