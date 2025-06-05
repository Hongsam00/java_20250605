/**
 * 파일명:Ed02BufferedReader.java <br/>
 * 생성일:2025-04-17 
 */
package com.pcwk.ehr.ed06;

import java.io.*;

public class Ed02BufferedReader {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("bufferedWrite.txt"));){
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}



	}

}
