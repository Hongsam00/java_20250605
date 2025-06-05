/**
 * 파일명:Ed01BufferedWriter.java <br/>
 * 생성일:2025-04-17 
 */
package com.pcwk.ehr.ed06;

import java.io.*;

public class Ed01BufferedWriter {

	public static void main(String[] args) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("bufferedWrite.txt"));){
			writer.write("Java 입출력 연습");
			
			writer.newLine(); //OS에 따른 줄바끔
			
			writer.write("BufferedWriter는 줄바꿈도 가능 합니다.");
			writer.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("┌───────────────────────┐");
		System.out.println("│ Complete              │");
		System.out.println("└───────────────────────┘");
		
	}

}
