/**
 * 파일명:Ed04ByteArrayOffLen.java <br/>
 * 생성일:2025-04-16
 */
package com.pcwk.ehr.ed01;

import java.io.*;

public class Ed04ByteArrayOffLen {

	public static void main(String[] args) {
		byte [] data = {72, 73, 74, 75, 76}; //ASCII:HIJKL
		
		
		try(FileOutputStream fos = new FileOutputStream("partial_array.txt");) {
			fos.write(data, 1, 3); //출력 : IJK
			System.out.println("일부 바이트만 기록");
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
