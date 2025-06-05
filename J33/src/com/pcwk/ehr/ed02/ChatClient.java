/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * 파일명: ChatClient.java <br/>
 */
package com.pcwk.ehr.ed02;

import java.io.*;
import java.net.*;
import java.nio.Buffer;
import java.util.*;

public class ChatClient {

	private static String serverAddress = "192.168.100.123";
	private static final int PORT = 8000;

	public static void main(String[] args) {

		try (Socket socket = new Socket(serverAddress, PORT);
				// keyboard 입력(Scanner 역할)
				BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true);) {

			// 서버에서 초기 메시지 수신: 닉네임 입력 요청
			System.out.println(in.readLine());
			String nickname = keyboard.readLine();
			out.println(nickname);
			
			// 서버 메시지 받는 스레드
			Thread receiver = new Thread(() -> {

				try {
					String message;
					while ((message = in.readLine()) != null) {
						System.out.println("수신: " + message);
					}
				} catch (IOException e) {
					System.out.println("서버 연결 종료");
				}
			});
			receiver.start();

			// 키보드 입력 전송
			String input;
			while ((input = keyboard.readLine()) != null) {
				out.println(input);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
