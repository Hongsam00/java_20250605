/**
 * 파일명:Ed01Reader.java <br/>
 * 생성일:2025-04-17 
 */
package com.pcwk.ehr.ed05;

import java.io.*;

public class Ed01Reader {

	public static void main(String[] args) {
		try (Reader reader = new FileReader("pcwk_writer.txt");){
			
			//1문자
			int data = 0;
			while((data = reader.read()) != -1) {
				System.out.print((char)data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}

}
