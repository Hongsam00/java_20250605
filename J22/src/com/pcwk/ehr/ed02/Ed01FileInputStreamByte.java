/**
 * 파일명:Ed01FileInputStreamByte.java <br/>
 * 생성일:2025-04-16
 */
package com.pcwk.ehr.ed02;

import java.io.*;

public class Ed01FileInputStreamByte {

	public static void main(String[] args) {
		
		//String filePath = ".\\src\\com\\pcwk\\ehr\\ed02\\byte_file.txt";
		String filePath = "D:\\JAP_20250317\\01_JAVA\\workspace\\J22\\src\\com\\pcwk\\ehr\\ed02\\byte_file.txt";
		try {
			InputStream fis = new FileInputStream(filePath);
			int data;
			while ((data = fis.read()) != -1) {
				System.out.print((char)data);
			}
			System.out.println("파일 읽기 완료!");
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
