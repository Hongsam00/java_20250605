/**
 * Package Name : com.pcwk.ehr.ed01 <br/>
 * 파일명: TcpClient.java <br/>
 */
package com.pcwk.ehr.ed01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TcpClient {

	public static void main(String[] args) {
		try (Socket socket = new Socket("192.168.100.150", 8001)) {
			System.out.println("서버에 연결됨!");

			// 서버에 메시지 전송
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			out.write("안녕하세요, 즐거운 수요일 입니다. 서버!\n");
			out.flush();

			// 서버에 메시지 수신
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String response = in.readLine();
			System.out.println("서버 응답 : " + response);

			in.close();
			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
