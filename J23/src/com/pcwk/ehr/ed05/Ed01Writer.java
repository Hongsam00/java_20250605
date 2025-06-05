/**
 * 파일명:Ed01Writer.java <br/>
 * 생성일:2025-04-17 
 */
package com.pcwk.ehr.ed05;

import java.io.*;

public class Ed01Writer {

	public static void main(String[] args) {
		try(Writer writer = new FileWriter("pcwk_writer.txt");) {
			
			//문자씩 기록
			char ch01 = 'A';
			char ch02 = '1';
			char ch03 = '가';
			
			writer.write(ch01);
			writer.write(ch02);
			writer.write(ch03);
			writer.write("\n");
			
			//char 배열
			char[] chArr = {'B', 'C', 'D', '나'};
			writer.write(chArr);
			
			//
			writer.write(chArr, 1, 3);
			
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("┌───────────────────────┐");
		System.out.println("│ Complete              │");
		System.out.println("└───────────────────────┘");
	}

}
