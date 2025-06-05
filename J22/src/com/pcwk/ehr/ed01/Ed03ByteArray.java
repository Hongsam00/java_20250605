/**
 * 파일명:Ed03ByteArray.java <br/>
 * 생성일:2025-04-16
 */
package com.pcwk.ehr.ed01;

import java.io.*;

public class Ed03ByteArray {

	public static void main(String[] args) {
		
		byte [] data = {68, 69, 70, 71, 72}; //ASCII:DEFGa

		try(OutputStream os = new FileOutputStream("byte_array.txt");){
			
			os.write(data);
			
			System.out.println("바이트 배열 출력 완료"); 
			
		} catch(FileNotFoundException e){
			System.out.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
			e.printStackTrace();
		} catch(Exception e){
		System.out.println("Exception: " + e.getMessage());
		e.printStackTrace();
		}
	}

}
