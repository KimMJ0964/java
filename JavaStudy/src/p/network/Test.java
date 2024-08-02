package p.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int port = 3000;
		String serverIP;
		try {
			serverIP = "192.168.30.8";

			Socket socket = new Socket(serverIP, port);

			if (socket != null) { // 서버와 잘 연결된 경우
				System.out.println("서버와 연결 성공");
			}
		} catch (IOException e) {

		}
	}

}
