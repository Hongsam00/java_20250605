/**
 * Package Name : com.pcwk.ehr.ed04 <br/>
 * [파일명: FileServer.java] <br/>
 */
package com.pcwk.ehr.ed04;

import java.io.*;
import java.net.*;

public class FileServer {
	private static final int PORT = 9000;

	public static void main(String[] args) {
		try (ServerSocket serverSocket = new ServerSocket(PORT)) {
			System.out.println("서버가 포트 " + PORT + "에서 대기 중입니다...");

			while (true) {
				Socket socket = serverSocket.accept();
				System.out.println("클라이언트 연결: " + socket.getInetAddress());

				InputStream is = socket.getInputStream();
				/// DataInputStream/DataOutputStream은
				// 기본형 데이터(int, double, boolean등)를 바이너리 형식으로 읽고 쓰기
				// 위한 스트림 클래스 입니다.
				DataInputStream dis = new DataInputStream(is);

				String fileName = dis.readUTF(); // file 이름
				long fileSize = dis.readLong(); // file 사이즈

				FileOutputStream fos = new FileOutputStream("received_" + fileName);

				byte[] buffer = new byte[4096];

				int read;
				long totalRead = 0;

				while ((read = dis.read(buffer, 0, buffer.length)) > 0) {
					
					fos.write(buffer, 0, read);
					totalRead += read;
					if(totalRead >= fileSize)
						break;
				} // while 파일 쓰기
				
				System.out.println("파일 수신 완료: " +fileName);
				
				fos.close();
				socket.close();
				
			} // while(true) end
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	} // main end

}
