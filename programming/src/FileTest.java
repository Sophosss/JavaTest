import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class FileTest {
	public static void main(String[] args) throws IOException {
		String enc = "GBK";
		File file = new File("C:\\Users\\pc\\Desktop\\yiche.json");
		InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file),enc);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String emp = null;
		ArrayList<String> arrayList = new ArrayList<>();
		while ((emp = bufferedReader.readLine())!=null){
			arrayList.add(emp);
		}
		inputStreamReader.close();
		System.out.println(arrayList);
	}
}
