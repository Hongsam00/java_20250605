/**
 * 파일명:Ed01ByteWrite.java <br/>
 * 생성일:2025-04-16
 */
package com.pcwk.ehr.ed01;

import java.io.*;

public class Ed02ByteWrite {

	public static void main(String[] args) {
		//try-with-resource
		//try-with-resource구문을 사용하려면, Closeable또는 AutoCloseable 인터페이스를 
		//구현한 객체는 try블록이 끝날 때 자동으로 자원 반납을 합니다.
		try {
			OutputStream fos = new FileOutputStream("single_byte.txt");
			fos.write(65); //ASCII 65 = 'A'
			fos.write(66); //ASCII 66 = 'B'
			fos.write(67); //ASCII 67 = 'C'
			
			fos.flush();
			System.out.println("단일 바이트 쓰기 완료");
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException: " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		} 
		

	}

}
