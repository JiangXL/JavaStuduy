package Ch27_Network;



import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client_1 {
	
	public static void main(String[] args) throws Exception {

		Socket ss = null;
		BufferedReader br = null;
		
		try {
			ss = new Socket("localhost", 9000);
			InputStream in = ss.getInputStream();

			br = new BufferedReader(new InputStreamReader(in)); // 得到网络输入流

			String message;
			do {
				message = br.readLine();
				System.out.println(message);

			} while (!message.equals("quit"));
		} finally {
			br.close();
			ss.close();
		}
	}

}

