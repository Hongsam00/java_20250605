/**
 * 파일명:Ed03CopyFile.java <br/>
 * 생성일:2025-04-17 
 */
package com.pcwk.ehr.ed06;

import java.io.*;

public class Ed03CopyFile {

	public static void main(String[] args) {
		String fileName = "D:\\JAP_20250317\\01_JAVA\\workspace\\J23\\src\\com\\pcwk\\ehr\\ed06\\Ed03CopyFile.java";
		String CopyFile = "Ed03CopyFile_java.txt";
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
				BufferedWriter writer = new BufferedWriter(new FileWriter(CopyFile));){
			String line;
			while((line = reader.readLine()) != null) {
//				System.out.print(line);
//				System.out.println();
				writer.write(line);
				writer.newLine();
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
