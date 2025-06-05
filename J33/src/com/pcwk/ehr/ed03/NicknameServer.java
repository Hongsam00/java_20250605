/**
 * Package Name : com.pcwk.ehr.ed03 <br/>
 * [파일명: NicknameServer.java] <br/>
 */
package com.pcwk.ehr.ed03;

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class NicknameServer {
	private static List<ClientHandler> clients = new ArrayList<>();
	private static final int PORT = 8000;

	static class ClientHandler extends Thread {
		private Socket socket;
		private PrintWriter out;
		private BufferedReader in;
		private String nickname;

		public ClientHandler(Socket socket) throws IOException {
			super();
			this.socket = socket;
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
		}

		private void broadcast(String message) {
			for (ClientHandler c : clients) {
				c.out.println(message);
			}
		}

		@Override
		public void run() {

			try {
				out.println("닉네임을 입력하세요: ");
				nickname = in.readLine();
				broadcast(nickname + "님이 입장하셨습니다.");

				String message;

				while ((message = in.readLine()) != null) {
					broadcast(nickname + ": " + message);
				}

			} catch (IOException e) {
				System.out.println(currentDateTime() + "> " + nickname + " 연결 종료!");
			} finally {
				try {
					socket.close();
				} catch (IOException e) {
				}

				clients.remove(this);
				broadcast(nickname + "님이 퇴장하셨습니다.");

			}
		}

	}

	public static String currentDateTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd a HH:mm:ss");
		return sdf.format(new Date());
	}

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(PORT);
		System.out.println(currentDateTime() + ": Server start. 포트: " + PORT);

		while (true) {
			Socket socket = serverSocket.accept();
			ClientHandler client = new ClientHandler(socket);
			// List에 client 추가
			clients.add(client);

			// run()메서드 호출!
			client.start();
		}
	}

}
