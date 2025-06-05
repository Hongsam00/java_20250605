/**
 * 파일명:Ed02FileInputStreamByteArray.java <br/>
 * 생성일:2025-04-16
 */
package com.pcwk.ehr.ed02;

import java.io.*;

public class Ed02FileInputStreamByteArray {

	public static void main(String[] args) {
		String fileName = "D:\\JAP_20250317\\01_JAVA\\workspace\\J22\\src\\com\\pcwk\\ehr\\ed02\\Ed02FileInputStreamByteArray.java";
		try (InputStream fis = new FileInputStream(fileName)) {
			byte[] buffer = new byte[1024];
			int byteRead;

			while ((byteRead = fis.read(buffer)) != -1) {
				// 읽은 바이트 수만큼 문자로 출력
				System.out.print(new String(buffer, 0, byteRead));
			}

			System.out.println("파일 읽기 완료!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
