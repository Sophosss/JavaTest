import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class WyNiu {
	private static void test () throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String s = bufferedReader.readLine();
		Deque<String> stack = new ArrayDeque<>();
		stack.push(s);
		s = bufferedReader.readLine();
		if (!((s.length()+"").equals(stack.pop()))){
			return;
		}
		int temp = 0;
		for (int i = 0; i < s.length(); i++) {
			if ('L'==s.charAt(i)){
				temp++;
 			}else {
				temp--;
			}
		}
		if (temp > 0){
			int t = temp%4;
			if (t==0){
				System.out.println("N");
			}else if (t==1){
				System.out.println("W");
			}else if (t==2){
				System.out.println("S");
			}else {
				System.out.println("E");
			}
		}else {
			int p = temp%4;
			if (p==0){
				System.out.println("N");
			}else if (p==1){
				System.out.println("E");
			}else if (p==2){
				System.out.println("S");
			}else {
				System.out.println("W");
			}
		}

	}

	public static void main(String[] args) {
		try {
			test();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
