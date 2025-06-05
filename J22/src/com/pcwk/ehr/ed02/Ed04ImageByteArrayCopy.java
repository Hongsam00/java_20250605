/**
 * 파일명:Ed04ImageByteArrayCopy.java <br/>
 * 생성일:2025-04-16
 */
package com.pcwk.ehr.ed02;

import java.io.*;

public class Ed04ImageByteArrayCopy {

	public static void main(String[] args) {
		String orgImage = "D:\\JAP_20250317\\01_JAVA\\workspace\\J22\\image\\spring_flower.jpg";
		String saveImage = "newCopyFlowArray.jpg";
		
		long start = System.currentTimeMillis();
		//byte[]
		
		try(FileInputStream fis = new FileInputStream(orgImage);
			FileOutputStream fos = new FileOutputStream(saveImage);
				) {
			byte[] data = new byte[1024];
			int leng;
			
			while((leng = fis.read(data)) !=-1){
				
				fos.write(data, 0, leng);
			}
		} catch(IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		System.out.println("경과시간: " + (end - start)+"ms");
		System.out.println("ImageCopy 성공!");
	}

}
