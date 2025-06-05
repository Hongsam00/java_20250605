/**
 * 파일명:Ed01ByteWrite.java <br/>
 * 생성일:2025-04-16
 */
package com.pcwk.ehr.ed01;

import java.io.*;

public class Ed01ByteWrite {

	public static void main(String[] args) {
		OutputStream fos = null;
		try {
			fos = new FileOutputStream("single_byte.txt");
			fos.write(65); //ASCII 65 = 'A'
			fos.write(66); //ASCII 66 = 'B'
			fos.write(67); //ASCII 67 = 'C'
			
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
		} finally {
			if(null != fos) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
