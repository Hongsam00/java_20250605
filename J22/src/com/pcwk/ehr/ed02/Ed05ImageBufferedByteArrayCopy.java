/**
 * 파일명:Ed05ImageBufferedByteArrayCopy.java <br/>
 * 생성일:2025-04-16
 */
package com.pcwk.ehr.ed02;

import java.io.*;

public class Ed05ImageBufferedByteArrayCopy {

	public static void main(String[] args) {
		String orgImage = "D:\\JAP_20250317\\01_JAVA\\workspace\\J22\\image\\spring_flower.jpg";
		String saveImage = "newCopyFlowArray.jpg";
		
		long start = System.currentTimeMillis();

		
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(orgImage));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(saveImage));
				) {
			byte[] data = new byte[1024];
			int leng;
			
			while((leng = bis.read(data)) !=-1){
				
				bos.write(data, 0, leng);
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
