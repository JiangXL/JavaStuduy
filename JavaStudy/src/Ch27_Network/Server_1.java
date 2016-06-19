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
			PrintWriter pout = new PrintWriter(out,true); //�õ����������
			in = new Scanner(System.in); //�õ�����̨������
			
			do {
				//�Ӽ��̶�ȡ�û��������Ϣ�����͵��ͻ���
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
