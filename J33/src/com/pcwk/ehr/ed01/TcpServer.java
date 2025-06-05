/**
 * Package Name : com.pcwk.ehr.ed01 <br/>
 * 파일명: TcpServer.java <br/>
 */
package com.pcwk.ehr.ed01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) {
		try (ServerSocket serverSocket = new ServerSocket(8000)) {
			System.out.println("서버 대기 중...");

			// 클라이언트 연결 수락
			Socket clientSocket = serverSocket.accept();
			System.out.println("클라이언트 연결됨: " + clientSocket.getInetAddress());

			// 클라이언트로 부터 메세지 수신
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			String message = in.readLine();
			System.out.println("받은 메세지: " + message);

			// 클라이언트부터 메세지 송신
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
			out.write("서버에서 받은 메세지:" + message + "\n");
			out.flush();

			in.close();
			out.close();
			clientSocket.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
