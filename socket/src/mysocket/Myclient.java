package mysocket;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Myclient {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("127.0.0.1", 9999);
		InputStream inputStream = socket.getInputStream();
		OutputStream outputStream = new FileOutputStream("G:\\cjjjj\\111.txt");
		byte[] bs = new byte[1000];
		int temp = -1;
		while ((temp=inputStream.read(bs))!=-1) {
			outputStream.write(bs,0,temp);
		}
		System.out.println("okok");
		outputStream.close();
		inputStream.close();
		socket.close();
	}
	
}
