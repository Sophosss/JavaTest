package mysocket;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Myserver {
	public static void main(String[] args) throws IOException {
	
	ServerSocket serverSocket = new ServerSocket(9999);
	Socket socket = serverSocket.accept();
	System.out.println("connect");
	OutputStream outputStream = socket.getOutputStream();
	File file = new File("G:\\cjjjj\\123.txt");
	InputStream fileIn = new FileInputStream(file);
	byte[] bytes = new byte[1000];
	int temp = -1;
	while((temp=fileIn.read(bytes))!=-1){
		outputStream.write(bytes, 0, temp);
		
	}
	System.out.println("OK");
	fileIn.close();
	outputStream.close();
	socket.close();
	serverSocket.close();
	}
}
