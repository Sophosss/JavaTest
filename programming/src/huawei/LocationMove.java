package huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LocationMove {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		while ((s = br.readLine())!= null){
		String []arr = s.split(";");
		int x = 0, y = 0, temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() == 3 && arr[i].charAt(0) >= 'A' && arr[i].charAt(0) <= 'Z'&& arr[i].charAt(1) >= 48 && arr[i].charAt(1) <= 57 && arr[i].charAt(2) >= 48 && arr[i].charAt(2) <= 57){
				temp = Integer.parseInt(arr[i].substring(1,3));
				switch (arr[i].charAt(0)){
					case 'A' : x -= temp; break;
					case 'D' : x += temp; break;
					case 'W' : y += temp; break;
					case 'S' : y -= temp; break;
					default:
				}
			}
			if (arr[i].length() == 2 && arr[i].charAt(0) >= 'A' && arr[i].charAt(0) <= 'Z'&& arr[i].charAt(1) >= 48 && arr[i].charAt(1) <= 57 ){
				temp = Integer.parseInt(arr[i].substring(1,2));
				switch (arr[i].charAt(0)){
					case 'A' : x -= temp; break;
					case 'D' : x += temp; break;
					case 'W' : y += temp; break;
					case 'S' : y -= temp; break;
					default:
				}
			}
		}
		System.out.println(x + "," + y);
	}
	}
}
