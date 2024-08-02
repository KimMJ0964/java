package q.thread.chat;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 3000);
			// 서버로부터 메세지를 받는 쓰레드
			ClientReveive task1 = new ClientReveive(socket);
			task1.start();
						
			// 서버로부터 메세지를 보내는 쓰레드
			ClientSend task2 = new ClientSend(socket);
			task2.start();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
