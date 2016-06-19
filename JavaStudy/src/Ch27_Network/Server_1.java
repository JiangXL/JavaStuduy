package Ch27_Network;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server_1 {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = null;
		Socket s = null;
		OutputStream out = null;
		Scanner in = null;

		try {
			
			ss = new ServerSocket(9000);
			System.out.println("Waiting for connection" );
			s = ss.accept();
			System.out.println("Connection from : " + s.getInetAddress().getHostName());
			String message;
			
			out = s.getOutputStream();
			PrintWriter pout = new PrintWriter(out,true); //得到网络输出流
			in = new Scanner(System.in); //得到控制台输入流
			
			do {
				//从键盘读取用户输入的信息并发送到客户端
				message = in.nextLine();
				pout.println(message);
				
			} while(!message.equals("quit"));
		} finally {
			out.close();
			in.close();
			s.close();
		}
		
		
	}
}
